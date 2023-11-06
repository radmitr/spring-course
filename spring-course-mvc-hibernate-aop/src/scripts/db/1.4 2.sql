USE my_db;

CREATE TABLE employees (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  surname varchar(25),
  department varchar(20),
  salary int,
  PRIMARY KEY (id)
) ;

INSERT INTO my_db.employees (name, surname, department, salary)
VALUES
	('Zaur', 'Tregulov', 'IT', 500),
	('Oleg', 'Ivanov', 'Sales', 700),
	('Nina', 'Sidorova', 'HR', 850);

