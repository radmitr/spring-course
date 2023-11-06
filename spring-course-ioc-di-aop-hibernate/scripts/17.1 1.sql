CREATE TABLE my_db.children (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  age int,
  PRIMARY KEY (id)
);

CREATE TABLE my_db.section (
  id int NOT NULL AUTO_INCREMENT,
  name varchar(15),
  PRIMARY KEY (id)
);

CREATE TABLE my_db.child_section (
  child_id int NOT NULL,
  section_id int NOT NULL,
  PRIMARY KEY (child_id, section_id),
  FOREIGN KEY (child_id) REFERENCES my_db.children(id),
  FOREIGN KEY (section_id) REFERENCES my_db.section(id));