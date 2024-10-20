# Write your MySQL query statement below
WITH cte AS
(SELECT *
FROM Students
CROSS JOIN Subjects),

cte2 AS
(SELECT student_id,subject_name,COUNT(subject_name) AS subs_count
FROM Examinations
GROUP BY student_id,subject_name)

SELECT cte.student_id,cte.student_name,cte.subject_name,CASE WHEN subs_count 
IS NOT NULL THEN subs_count ELSE 0 END AS attended_exams
FROM cte
LEFT JOIN cte2
on cte.student_id = cte2.student_id
AND cte.subject_name = cte2.subject_name
ORDER BY cte.student_id,cte.subject_name
