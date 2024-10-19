# Write your MySQL query statement below
/*SELECT c.name AS Customers
FROM Customers c
LEFT JOIN Orders o
ON c.id=o.customerId
WHERE o.id is NULL*/

#Another approach
SELECT c.name AS Customers
FROM Customers c
WHERE c.id NOT IN
(SELECT c.id
FROM Customers c
INNER JOIN Orders o
ON c.id=o.customerId)