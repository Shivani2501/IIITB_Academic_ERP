create table employee(

    empid VARCHAR(30) primary key ,
    email VARCHAR(40) NOT NULL ,
    password VARCHAR(30) NOT NULL ,
    first_name VARCHAR(30) NOT NULL ,
    last_name VARCHAR(30) NOT NULL ,
    department_id BIGINT NOT NULL

    );


create table department
(

    department_id INTEGER unique primary key ,
    name          VARCHAR(40) unique NOT NULL ,
    capacity      INTEGER NOT NULL
);

-- Student table
CREATE TABLE student(

                        student_id VARCHAR(255) PRIMARY KEY ,
                        name VARCHAR(255) NOT NULL,
                        batch_year INT NOT NULL,
                        domain_id VARCHAR(255) NOT NULL -- New column added

);
 -- placement_student tbale
create table placement_student(
  id BIGINT AUTO_INCREMENT PRIMARY KEY ,
  student_id VARCHAR(255) NOT NULL ,
  acceptance BOOLEAN NOT NULL


);

-- Alumni table
create table alumni(

    alumni_id BIGINT PRIMARY KEY ,
    contact_number VARCHAR(255),
    email VARCHAR(255),
    student_id VARCHAR(255) NOT NULL UNIQUE


);

-- alumni organisation
create table alumni_organisation(
    id BIGINT PRIMARY KEY ,
    alumni_id BIGINT  ,
    organization_name VARCHAR(255) NOT NULL ,
    position VARCHAR(100),
    joining_date DATE,
    leaving_date DATE,
    student_id VARCHAR(255) NOT NULL
);

-- domain table
CREATE TABLE domain (

                        domain_id VARCHAR(50) primary key ,
                        domain_name VARCHAR(100) NOT NULL UNIQUE
);
