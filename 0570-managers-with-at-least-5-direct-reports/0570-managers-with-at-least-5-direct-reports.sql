# Write your MySQL query statement below
SELECT name from Employee
where id in(
    SELECT managerID from employee
    Group by managerid
    having count(*)>=5
);