# Write your MySQL query statement below
WITH cte AS(
SELECT *,RANK()OVER(PARTITION BY product_id ORDER BY change_date DESC) AS r
FROM Products                         
WHERE change_date<='2019-08-16'
)
SELECT product_id,new_price AS price
FROM cte
WHERE r=1
UNION
SELECT product_id,10 AS price
FROM Products
WHERE product_id NOT IN(SELECT product_id FROM cte)


/*
| product_id | new_price | change_date | rank 
| ---------- | --------- | ----------- |
| 1          | 35        | 2019-08-16  | 1
| 1          | 30        | 2019-08-15  | 2
| 1          | 20        | 2019-08-14  | 3
| 2          | 50        | 2019-08-14  | 1

#UNION
| product_id | new_price | change_date | price
| 3          | 20        | 2019-08-18  | 10

#RESULT
| product_id | price   |
| 1          | 35      |  
| 2          | 50      | 
| 3          | 10      |  
*/




