SELECT d.name AS Department,
       e.name AS Employee,
       e.salary AS Salary
FROM employee e
JOIN department d
ON e.departmentid = d.id
WHERE e.salary = (
    SELECT MAX(e2.salary)
    FROM employee e2
    WHERE e2.departmentid = e.departmentid
);