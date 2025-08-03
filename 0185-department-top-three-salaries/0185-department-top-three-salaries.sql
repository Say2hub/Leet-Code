# Write your MySQL query statement below
SELECT Department, Employee , Salary from
(SELECT d.name AS Department , e.name AS Employee , e.salary ,
DENSE_RANK() OVER(PARTITION BY e.departmentid ORDER BY salary DESC) as rnk 
FROM Employee e
JOIN Department d ON e.departmentid=d.id)
as ranked where rnk<4;

