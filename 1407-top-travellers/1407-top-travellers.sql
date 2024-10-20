# Write your MySQL query statement below
SELECT DISTINCT u.name, CASE WHEN r.distance IS NOT NULL 
THEN SUM(distance) OVER(PARTITION BY r.user_id ORDER BY r.user_id) ELSE 0 END AS travelled_distance
FROM Users u
LEFT JOIN Rides r
ON u.id = r.user_id
ORDER BY travelled_distance DESC,u.name
