USE my_db;

CREATE TABLE users (
  username varchar(15),
  password varchar(100),
  enabled tinyint(1),
  PRIMARY KEY (username)
) ;

CREATE TABLE authorities (
  username varchar(15),
  authority varchar(25),
  FOREIGN KEY (username) references users(username)
) ;

INSERT INTO my_db.users (username, password, enabled)
VALUES
	('dmitriy', '{noop}dmitriy123', 1),
	('elena', '{noop}elena123', 1),
	('ivan', '{noop}ivan123', 1);
    
INSERT INTO my_db.authorities (username, authority)
VALUES
	('dmitriy', 'ROLE_EMPLOYEE'),
	('elena', 'ROLE_HR'),
    ('ivan', 'ROLE_HR'),
	('ivan', 'ROLE_MANAGER');
    
    