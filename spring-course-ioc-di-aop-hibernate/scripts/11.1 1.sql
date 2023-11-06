CREATE TABLE my_db.details (
  id int NOT NULL AUTO_INCREMENT,
  city varchar(15),
  phone_number varchar(25),
  email varchar(30),
  PRIMARY KEY (id)
);

CREATE TABLE my_db.employees (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  surname varchar(25),
  department varchar(20),
  salary int,
  details_id int,
  PRIMARY KEY (id),
  FOREIGN KEY (details_id) REFERENCES my_db.details(id)
);