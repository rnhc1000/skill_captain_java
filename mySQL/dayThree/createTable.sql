/**
Assignments:

Create a MySQL database with a table Employees consisting of the following columns -
- ID (Integer data type)
- Name (Character data type
- Email Address (Character data type)
- Department (Character data type)
- Date of Birth (Date data type)
- Salary (Decimal data type)
- Is Active (Boolean data type)
Insert 2 rows of data into the table.

**/


create table EmplOyees (
    ID INT NOT NULL,
    Name VARCHAR(255) NOT NULL,
    Email VARCHAR(255) NOT NULL,
    Department VARCHAR(255) NOT NULL,
    DateOfBirth Date NOT NULL,
    Salary DECIMAL NOT NULL,
    isACTIVE BOOLEAN NOT NULL,
)

alter table Employees add primary key (ID);

alter table Employees modify ID int not null auto_increment;

insert into Employees (name, Email, Department, DateOfBirth, Salary, isActive) 
VALUES (
    "Ricardo Ferreira", "ricardo@ferreiras.dev.br", "Software Engineering", "1957-10-18", "5000.00", true);
