/**
Assignments:

Insert 2 new rows of data (employee details) into the employees table.
Update the salary of the employee with ID 2 to 75000.
Delete the employee with ID 1 from the employees table.
*/

insert into Employees (Name,Email, Department, DateOfBirth, Salary, isACTIVE)
VALUES
("Nathalia Ferreira","nathalia@ferreiras.dev.br", "Chemical Labs", "1999-03-27", 5000.00, true);


insert into Employees (Name,Email, Department, DateOfBirth, Salary, isACTIVE)
VALUES
("Henrique Ferreira","henrique@ferreiras.dev.br", "Medical ER", "2001-02-19", 15000.00, true);

MariaDB [skillCaptain_db]> select * from Employees;
+----+-------------------+---------------------------+----------------------+-------------+--------+----------+
| ID | Name              | Email                     | Department           | DateOfBirth | Salary | isACTIVE |
+----+-------------------+---------------------------+----------------------+-------------+--------+----------+
|  1 | Ricardo Ferreira  | ricardo@ferreiras.dev.br  | Software Engineering | 1957-10-18  |  10000 |        1 |
|  2 | Rinaldo Ferreira  | rinaldo@ferreiras.dev.br  | Logistics            | 1961-03-21  |  10001 |        1 |
|  3 | Nathalia Ferreira | nathalia@ferreiras.dev.br | Chemical Labs        | 1999-03-27  |   5000 |        1 |
|  4 | Henrique Ferreira | henrique@ferreiras.dev.br | Medical ER           | 2001-02-19  |  15000 |        1 |

update Employees set Salary=75000 where ID=2;

MariaDB [skillCaptain_db]> update Employees set Salary=75000 where ID=2;
Query OK, 1 row affected (0.006 sec)
Rows matched: 1  Changed: 1  Warnings: 0

MariaDB [skillCaptain_db]> select * from Employees;
+----+-------------------+---------------------------+----------------------+-------------+--------+----------+
| ID | Name              | Email                     | Department           | DateOfBirth | Salary | isACTIVE |
+----+-------------------+---------------------------+----------------------+-------------+--------+----------+
|  1 | Ricardo Ferreira  | ricardo@ferreiras.dev.br  | Software Engineering | 1957-10-18  |  10000 |        1 |
|  2 | Rinaldo Ferreira  | rinaldo@ferreiras.dev.br  | Logistics            | 1961-03-21  |  75000 |        1 |
|  3 | Nathalia Ferreira | nathalia@ferreiras.dev.br | Chemical Labs        | 1999-03-27  |   5000 |        1 |
|  4 | Henrique Ferreira | henrique@ferreiras.dev.br | Medical ER           | 2001-02-19  |  15000 |        1 |
+----+-------------------+---------------------------+----------------------+-------------+--------+----------+

delete from Employees where ID=1;
MariaDB [skillCaptain_db]> delete from Employees where ID=1;
Query OK, 1 row affected (0.002 sec)

MariaDB [skillCaptain_db]> select * from Employees;
+----+-------------------+---------------------------+---------------+-------------+--------+----------+
| ID | Name              | Email                     | Department    | DateOfBirth | Salary | isACTIVE |
+----+-------------------+---------------------------+---------------+-------------+--------+----------+
|  2 | Rinaldo Ferreira  | rinaldo@ferreiras.dev.br  | Logistics     | 1961-03-21  |  75000 |        1 |
|  3 | Nathalia Ferreira | nathalia@ferreiras.dev.br | Chemical Labs | 1999-03-27  |   5000 |        1 |
|  4 | Henrique Ferreira | henrique@ferreiras.dev.br | Medical ER    | 2001-02-19  |  15000 |        1 |
+----+-------------------+---------------------------+---------------+-------------+--------+----------+
3 rows in set (0.000 sec)

