

DELETE FROM employee;
DELETE FROM department;

INSERT INTO department(id,name) VALUES(100,'HR');
INSERT INTO department(id,name) VALUES(101,'PDE');
INSERT INTO department(id,name) VALUES(102,'Marketing');

INSERT INTO employee(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(1,'Alex','Bonilla','M','1990-12-07','2011-04-01',100);
INSERT INTO employee(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(2,'Duke','Stacey','M','1989-07-11','2012-08-21',100);
INSERT INTO employee(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(3,'Hayley','Drake','M','1992-10-01','2007-07-06',101);
INSERT INTO employee(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(4,'Nancie','Beasley','M','1978-02-21','2003-03-03',101);
INSERT INTO employee(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(5,'Wyatt','Holder','M','1994-12-01','2016-02-15',101);
INSERT INTO employee(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(6,'Tobey','Drake','M','1992-10-01','2014-06-11',102);
INSERT INTO employee(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(7,'Marvin','Hope','F','1978-02-21','2003-09-10',102);
INSERT INTO employee(id,first_name,last_name,gender,birth_date,hire_date,department_id) VALUES(8,'Ibrar','Garcia','F','1994-12-01','2004-12-21',102);
