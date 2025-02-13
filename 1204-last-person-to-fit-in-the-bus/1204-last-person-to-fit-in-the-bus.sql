# Write your MySQL query statement below
WITH cte AS
(SELECT * , SUM(weight)OVER(ORDER BY turn ROWS BETWEEN UNBOUNDED PRECEDING AND CURRENT ROW)
AS Total
FROM QUEUE)
SELECT person_name
FROM cte
WHERE total<=1000
ORDER BY total DESC
LIMIT 1


