# Write your MySQL query statement below
WITH cte AS
(SELECT sales_id
FROM Orders o
INNER JOIN Company c
ON c.com_id = o.com_id
WHERE c.name LIKE 'RED')

SELECT name
FROM SalesPerson
WHERE sales_id NOT IN (SELECT DISTINCT sales_id FROM cte)



