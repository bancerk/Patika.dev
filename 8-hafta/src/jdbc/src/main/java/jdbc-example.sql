CREATE TABLE departments(
department_id INT PRIMARY KEY,
department_name VARCHAR(100) NOT NULL
);

CREATE TABLE employees(
employee_id INT PRIMARY KEY,
first_name VARCHAR(100),
last_name VARCHAR(100),
department_id INT,
salary DECIMAL(10,2),
hire_date DATE,
FOREIGN KEY (department_id) references departments (department_id)
);

INSERT INTO departments(department_id, department_name)
values (1,'IT');
INSERT INTO departments(department_id, department_name)
values (2,'HR');
INSERT INTO departments(department_id, department_name)
values (3,'Muhasebe');
INSERT INTO employees (employee_id,first_name,last_name,department_id,salary,hire_date)
values (1,'Elif','Beyaz',1,30000,'2022-03-15'),
       (2,'Emir','Ak',1,28000,'2024-12-15'),
       (3,'Nehir','Kara',2,29000,'2024-01-15'),
       (4,'Melike','Mavi',2,29000,'2024-12-15');