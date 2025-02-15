WITH cte AS(
SELECT * , 
LEAD(id) OVER(ORDER BY id) AS next, #Lead,Lag are Window Functions
LAG(id) OVER(ORDER BY id) AS prev   #Lead keeps value of next Running ID, Lag Keeps Previous Id.#Over Indicates that it is a Window Function
FROM Seat
)
SELECT  CASE 
WHEN ((id%2=1) AND next IS NOT NULL) 
THEN next
WHEN (id%2=0) THEN prev
ELSE id
END AS id,student
FROM cte
ORDER BY id
