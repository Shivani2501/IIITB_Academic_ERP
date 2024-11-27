ALTER TABLE employee modify Password varchar(255);

Alter table student add constraint fk_domain foreign key (domain_id) REFERENCES domain(domain_id);


Alter table placement_student add constraint fk_student FOREIGN KEY (student_id) REFERENCES student(student_id);


Alter table alumni add constraint fk_student_id FOREIGN KEY (student_id) REFERENCES student(student_id);
Alter table alumni_organisation add constraint fk_alumni FOREIGN KEY (alumni_id) REFERENCES alumni(alumni_id);

Alter table alumni_organisation add constraint fk_stud FOREIGN KEY (student_id) REFERENCES student(student_id);