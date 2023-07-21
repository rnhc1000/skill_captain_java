/**
Assignments:

Suppose you have two tables - one containing employee informatiON and the other containing department information. Schemas are given below:


CREATE TABLE Employee (
  EmployeeID INT,
  EmployeeName VARCHAR(255),
  DepartmentID INT
);

CREATE TABLE Department (
  DepartmentID INT,
  DepartmentName VARCHAR(255)
);
*/
-- 1. Write a SQL query to return a list of all possible combinations of employees and departments.

SELECT e.EmployeeName, e.EmployeeID, d.DepartmentName 
    FROM Employee e 
        CROSS JOIN Department d;

-- 2. Write a SQL query to return the list of employees who belong to at least one department.

SELECT e.EmployeeName, d.DepartmentName 
    FROM Employee e 
        INNER JOIN Department d 
            ON e.DepartmentID = d.DepartmentID 
                ORDER BY d.DepartmentName;
/*
+------------------+--------------------+
| EmployeeName     | DepartmentName     |
+------------------+--------------------+
| Ricardo Ferreira | Engineering        |
| Antonio Carlos   | Engineering        |
| Paulo Cesar      | Financial Services |
| Eduardo Ferreira | LegalServices      |
| Eduardo Silva    | LegalServices      |
| Rinaldo Ferreira | Logistics          |
| Pedro Ferreira   | Logistics          |
| Paulo Cesar      | Logistics          |
| Lucia Ferreira   | Warehouse          |
+------------------+--------------------+
*/

-- 3. Write a SQL query to return the list of all employees and their department details, 
-- including those employees who do not belong to any department or 
-- departments which do not have any employees.

SELECT e.EmployeeName , d.DepartmentName 
    FROM Employee e 
        RIGHT JOIN Department d
            ON e.DepartmentID = d.DepartmentID 
                UNION 
                    SELECT e.EmployeeName , d.DepartmentName     
                        FROM Employee e       
                            LEFT JOIN Department d              
                                ON e.DepartmentID = d.DepartmentID;

/**
+------------------+--------------------+
| EmployeeName     | DepartmentName     |
+------------------+--------------------+
| Ricardo Ferreira | Engineering        |
| Rinaldo Ferreira | Logistics          |
| Pedro Ferreira   | Logistics          |
| Lucia Ferreira   | Warehouse          |
| Eduardo Ferreira | LegalServices      |
| Paulo Cesar      | Financial Services |
| Eduardo Silva    | LegalServices      |
| Paulo Cesar      | Logistics          |
| Antonio Carlos   | Engineering        |
| NULL             | Security           |
| NULL             | Transportion       |
| NULL             | Customer Services  |
| Marcio Junior    | NULL               |
| Roberto Carlos   | NULL               |
| Miriam Rios      | NULL               |
+------------------+--------------------+
*/

-- 4. Write a SQL query to return the list of all employees, along with their department
-- details if they belong to a department.

SELECT e.EmployeeName, d.DepartmentName      
    FROM Employee e      
        LEFT JOIN Department d              
            ON e.DepartmentID = d.DepartmentID
                WHERE e.DepartmentID IS NOT NULL
                    ORDER BY d.DepartmentName;

/**

+------------------+--------------------+
| EmployeeName     | DepartmentName     |
+------------------+--------------------+
| Ricardo Ferreira | Engineering        |
| Antonio Carlos   | Engineering        |
| Paulo Cesar      | Financial Services |
| Eduardo Ferreira | LegalServices      |
| Eduardo Silva    | LegalServices      |
| Rinaldo Ferreira | Logistics          |
| Pedro Ferreira   | Logistics          |
| Paulo Cesar      | Logistics          |
| Lucia Ferreira   | Warehouse          |
+------------------+--------------------+

*/

-- 5. Write a SQL query to return the list of all departments, along with the 
-- employee details if they have atleast one employee belonging to the department.

SELECT d.DepartmentName, e.EmployeeID, e.EmployeeName 
    FROM Department d 
        INNER JOIN Employee e 
            WHERE d.DepartmentID = e.DepartmentID 
                GROUP BY d.DepartmentName 
                    ORDER BY EmployeeName;

/**

+--------------------+------------+------------------+
| DepartmentName     | EmployeeID | EmployeeName     |
+--------------------+------------+------------------+
| Engineering        |          1 | Ricardo Ferreira |
| Financial Services |          6 | Paulo Cesar      |
| LegalServices      |          5 | Eduardo Ferreira |
| Logistics          |          2 | Rinaldo Ferreira |
| Warehouse          |          4 | Lucia Ferreira   |
+--------------------+------------+------------------+
*/
