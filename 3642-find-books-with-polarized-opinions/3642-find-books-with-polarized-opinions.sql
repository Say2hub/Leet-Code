# Write your MySQL query statement below
SELECT r.book_id,b.title,b.author,b.genre,b.pages,MAX(r.session_rating)-MIN(r.session_rating) AS rating_spread,
ROUND((SUM(r.session_rating>=4)+SUM(r.session_rating<=2))/(COUNT(*)),2) AS polarization_score
FROM books b
JOIN reading_sessions r
ON b.book_id = r.book_id
GROUP BY b.book_id
HAVING COUNT(r.session_id)>=5
AND SUM(r.session_rating>=4)>=1 AND SUM(r.session_rating<=2)>=1
AND polarization_score>=0.6
ORDER BY polarization_score DESC, b.title DESC
