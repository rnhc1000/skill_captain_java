/**
Assignments:

Consider the table structure given:


CREATE TABLE Employees (
  ID INT,
  Name VARCHAR(255),
  Department VARCHAR(255)
);

Write a SQL query to display the total number of employees in each department, 
sorted by the department with the highest number of employees first, 
and only show departments with more than 2 employees.

*/

select Department, count(ID) as totalOfEmployees  from Employees group by Department order by ID asc 

MariaDB [skillCaptain_db]> select Department, count(ID) as totalOfEmployees  from Employees group by Department order by ID asc;
+---------------+------------------+
| Department    | totalOfEmployees |
+---------------+------------------+
| Logistics     |                1 |
| Chemical Labs |                3 |
| Medical ER    |                4 |
+---------------+------------------+
3 rows in set (0.001 sec)

select Department, count(ID) as totalOfEmployees  from Employees group by Department having count(id) > 2 order by ID asc ;

MariaDB [skillCaptain_db]> select Department, count(ID) as totalOfEmployees  from Employees group by Department having count(id) > 2 order by ID asc ;
+---------------+------------------+
| Department    | totalOfEmployees |
+---------------+------------------+
| Chemical Labs |                3 |
| Medical ER    |                4 |
+---------------+------------------+
2 rows in set (0.001 sec)
