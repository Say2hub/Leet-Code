# Write your MySQL query statement below
WITH cte AS (
    SELECT 
        e.id,
        e.name AS Employee, 
        e.salary AS Salary, 
        e.departmentId,
        d.name AS Department
    FROM 
        Employee e
    INNER JOIN 
        Department d
    ON 
        e.departmentId = d.id
),
max_salary_per_dept AS (
    SELECT 
        departmentId, 
        MAX(salary) AS max_salary
    FROM 
        Employee
    GROUP BY 
        departmentId
)
SELECT 
    c.Department,
    c.Employee,
    c.Salary
FROM 
    cte c
INNER JOIN 
    max_salary_per_dept m
ON 
    c.departmentId = m.departmentId AND c.Salary = m.max_salary;


