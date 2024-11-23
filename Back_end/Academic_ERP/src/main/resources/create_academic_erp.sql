create table employee(
    id BIGINT AUTO_INCREMENT primary key ,
    empid VARCHAR(30) unique ,
    email VARCHAR(40) NOT NULL ,
    Password VARCHAR(30) NOT NULL ,
    first_name VARCHAR(30) NOT NULL ,
    last_name VARCHAR(30) NOT NULL ,
    department_id BIGINT NOT NULL

    );


create table department
(
    id            BIGINT AUTO_INCREMENT primary key,
    department_id INTEGER unique ,
    name          VARCHAR(40) unique NOT NULL ,
    capacity      INTEGER NOT NULL
);

-- Student table
create table student(
    id BIGINT AUTO_INCREMENT PRIMARY KEY ,
    student_id VARCHAR(255) NOT NULL UNIQUE ,
    name VARCHAR(255) NOT NULL ,
    batch_year INT NOT NULL
);

 -- placement_student tbale
create table placement_student(
  id BIGINT AUTO_INCREMENT PRIMARY KEY ,
  student_id BIGINT NOT NULL ,
  acceptance BOOLEAN NOT NULL ,
  FOREIGN KEY (student_id) REFERENCES student(id)

);

