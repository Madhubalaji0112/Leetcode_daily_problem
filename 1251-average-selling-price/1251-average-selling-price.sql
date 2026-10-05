# Write your MySQL query statement below
select p.product_id,ROUND(coalesce(SUM(p.price*u.units)/SUM(u.units) ,0),2) average_price
from Prices p 
Left join UnitsSold u
on p.product_id = u.product_id AND u.purchase_date BETWEEN p.start_date AND p.end_date
group by p.product_id;