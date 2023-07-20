/**
Assignments:

Retrieve all columns from the employees table created in the day 3.
Retrieve only the ID and Name columns from the employees table, where 
Salary is greater than 10000.

*/


select * from Employess;
+----+------------------+--------------------------+----------------------+-------------+--------+----------+
| ID | Name             | Email                    | Department           | DateOfBirth | Salary | isACTIVE |
+----+------------------+--------------------------+----------------------+-------------+--------+----------+
|  1 | Ricardo Ferreira | ricardo@ferreiras.dev.br | Software Engineering | 1957-10-18  |  10000 |        1 |
|  2 | Rinaldo Ferreira | rinaldo@ferreiras.dev.br | Logistics            | 1961-03-21  |  10001 |        1 |
+----+------------------+--------------------------+----------------------+-------------+--------+----------+

select ID, Name from Employees where Salary > 10000;
+----+------------------+
| ID | Name             |
+----+------------------+
|  2 | Rinaldo Ferreira |
+----+------------------+