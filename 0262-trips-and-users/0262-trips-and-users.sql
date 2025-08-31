WITH cte1 AS (
    SELECT 
        t.request_at AS Day,
        COUNT(*) AS total_rides,
        SUM(CASE WHEN t.status LIKE '%cancelled%' THEN 1 ELSE 0 END) AS cancelled_rides
    FROM Trips t
    JOIN Users u1 ON t.client_id = u1.users_id
    JOIN Users u2 ON t.driver_id = u2.users_id
    WHERE u1.banned = 'No' AND u2.banned = 'No' AND t.request_at BETWEEN '2013-10-01' AND '2013-10-03'
    GROUP BY t.request_at
)
SELECT 
    Day,
    ROUND(cancelled_rides / total_rides, 2) AS `Cancellation Rate`
FROM cte1
ORDER BY Day;