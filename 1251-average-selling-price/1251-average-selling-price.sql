# Write your MySQL query statement below
Select p.product_id,round(ifnull(sum(p.price*u.units)/NULLIF(SUM(u.units), 0), 0), 2) as average_price 
From Prices p
left join UnitsSold u
on p.product_id = u.product_id
AND 
u.purchase_date BETWEEN p.start_date AND p.end_date
group by p.product_id;




