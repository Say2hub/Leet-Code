# Write your MySQL query statement below
SELECT product_id,MIN(year) AS first_year,quantity,price
from Sales 
GROUP BY product_id;