# Write your MySQL query statement below
select r.contest_id,Round(COUNT(r.user_id) * 100.0 / (SELECT COUNT(*) FROM Users),2) as percentage
from Register r
Left join Users u
on r.user_id = u.user_id
group by r.contest_id
ORDER BY percentage DESC, r.contest_id ASC;