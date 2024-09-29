# Write your MySQL query statement below
Select p.product_name,s.year,s.price
From Product p
Join Sales s
on s.product_id=p.product_id;

