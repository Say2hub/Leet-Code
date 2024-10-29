# Write your MySQL query statement below
SELECT employee_id, CASE WHEN COUNT(department_id)=1 THEN department_id 
WHEN COUNT(department_id)>1 THEN SUM((primary_flag='Y')*department_id) 
END AS department_id
FROM Employee
GROUP BY employee_id