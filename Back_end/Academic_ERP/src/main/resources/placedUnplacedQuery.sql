 -- Query for placed student
 select count(*) As placed_count
 from placement_student ps
 INNER JOIN student s on ps.student_id=s.id
 where ps.acceptance =TRUE And s.batch_year=2025;

-- Query for total student in the batch
select COUNT(*) As total_students
from student
where batch_year=2025;