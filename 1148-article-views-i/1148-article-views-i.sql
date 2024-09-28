# Write your MySQL query statement below

SELECT author_id AS id
FROM Views
WHERE author_id IN (
    SELECT viewer_id
    FROM Views
    WHERE viewer_id = author_id
)
GROUP BY author_id
ORDER BY author_id ASC;
