# Write your MySQL query statement below
WITH cte AS
(SELECT u.name, SUM(t.amount) AS balance
FROM Users u
INNER JOIN Transactions t
ON u.account = t.account
GROUP BY t.account)

SELECT cte.name , balance
FROM cte
WHERE balance > 10000

