# Write your MySQL query statement below
select b.product_name,a.year,a.price 
from sales a
join product b on b.product_id=a.product_id;