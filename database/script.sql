DROP TABLE IF EXISTS product;
DROP TABLE IF EXISTS employee_project;
DROP TABLE IF EXISTS project;
DROP TABLE IF EXISTS employee;

CREATE TABLE product(
    product_id serial,
    product_name varchar,
    price decimal(12,2),
    constraint pk_product PRIMARY KEY (product_id)
);

INSERT INTO product (product_name, price) VALUES ('Mug', 15.00);
INSERT INTO product (product_name, price) VALUES ('Honda Civic', 20000.00);

CREATE TABLE employee(
    employee_id serial,
    employee_name varchar,
    title varchar,
    constraint pk_employee PRIMARY KEY (employee_id)
);

INSERT INTO employee (employee_name, title) VALUES ('Bob', 'Marketing Lead');
INSERT INTO employee (employee_name, title) VALUES ('Carly', 'Engineer');

CREATE TABLE project(
    project_id serial,
    project_name varchar,
    constraint pk_project PRIMARY KEY (project_id)
);

INSERT INTO project(project_name) VALUES ('Counting Goats');

CREATE TABLE employee_project(
    employee_id int NOT NULL,
    project_id int NOT NULL,
    constraint pk_employee_project PRIMARY KEY(employee_id, project_id),
    constraint fk_employee_projects_employee FOREIGN KEY (employee_id) REFERENCES employee(employee_id),
    constraint fk_employee_projects_project FOREIGN KEY (project_id) REFERENCES project(project_id)
);