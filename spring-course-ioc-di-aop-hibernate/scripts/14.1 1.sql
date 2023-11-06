drop table my_db.employees;

drop table my_db.details;

CREATE TABLE my_db.departments (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  max_salary int,
  min_salary int,
  PRIMARY KEY (id)
);

CREATE TABLE my_db.employees (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  surname varchar(25),
  salary int,
  department_id int,
  PRIMARY KEY (id),
  FOREIGN KEY (department_id) REFERENCES my_db.departments(id)
);