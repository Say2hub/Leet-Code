# Write your MySQL query statement below
WITH cte AS(
    SELECT * , DENSE_RANK() OVER(ORDER BY salary DESC) AS r
    FROM Employee
)
# IFNULL(expression,desired_value)
SELECT IFNULL((SELECT salary FROM cte WHERE r=2 LIMIT 1),null) AS SecondHighestSalary
