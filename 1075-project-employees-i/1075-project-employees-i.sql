# Write your MySQL query statement below
select p.project_id,round(avg(a.experience_years),2) as average_years
from project p
join employee a on a.employee_id=p.employee_id
group by p.project_id;