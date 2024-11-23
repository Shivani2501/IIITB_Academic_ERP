INSERT INTO department(department_id,name,capacity) values(1,"CSE",150);
INSERT INTO department(department_id,name,capacity) values(2,"ECE",30);
INSERT INTO department(department_id,name,capacity) values(3,"Mech",120);

INSERT INTO employee(empid,email,Password,first_name,last_name,department_id) values("E001","shuklashivani2501@","shivani","shivani","shukla",1);

-- Insert students
INSERT Into student(student_id,name,batch_year) values ('S1','John Doe','2025'),
    ('S2','Jane smith',2025),
    ('S4','Abhi shukla',2026);

-- Insert Placement records
Insert into placement_student(student_id,acceptance) VALUES (1,True),(2,FALSE),(3,TRUE);
