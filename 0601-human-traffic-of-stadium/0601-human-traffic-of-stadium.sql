# Write your MySQL query statement below
with cte AS(
    SELECT *,id-row_number() over() as id_diff
    from stadium
    WHERE people>99
)
SELECT id,visit_date,people
from cte
WHERE id_diff IN(
    SELECT id_diff
    FROM cte
    GROUP BY id_diff
    HAVING COUNT(*)>2
)
