# Write your MySQL query statement below
SELECT email
FROM Person
GROUP BY email
#Distinct can even not be written as id is primary key.
HAVING COUNT(DISTINCT id)>1
