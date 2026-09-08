# Write your MySQL query statement below
select ifnull(ee.unique_id,null) as unique_id,e.name
from Employees e
left join EmployeeUNI ee
on e.id = ee.id ;