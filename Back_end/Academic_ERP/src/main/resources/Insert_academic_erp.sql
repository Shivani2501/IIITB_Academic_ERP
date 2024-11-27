INSERT INTO domain (domain_id, domain_name)
VALUES
    ('D1', 'Computer Science'),
    ('D2', 'Information Technology'),
    ('D3', 'Electronics'),
    ('D4', 'Mechanical Engineering');




INSERT INTO department (department_id, name, capacity)
VALUES
    (1, 'CSE', 50),
    (2, 'ECE', 10),
    (3, 'DS', 20),
    (4, 'AI', 15);



INSERT INTO employee (empid, email, Password, first_name, last_name, department_id)
VALUES
    ('E001', 'shivanishukla@gmail.com', 'password123', 'Shivani', 'Shukla', 1),
    ('E002', 'deomanisingh@gmail.com', 'password123', 'Deomani', 'Singh', 2),
    ('E003', 'amanverma@gmail.com', 'password123', 'Aman', 'Verma', 3),
    ('E004', 'tushardubey.com', 'password123', 'Tushar', 'Dubey', 4);


INSERT INTO student (student_id, name, batch_year, domain_id)
VALUES
    ('S001', 'Alice Johnson', 2023, 'D1'),
    ('S002', 'Bob Williams', 2022, 'D2'),
    ('S003', 'Charlie Davis', 2023, 'D3'),
    ('S004', 'Diana Evans', 2021, 'D4'),

('S005', 'Soumya Jain', 2023, 'D1'),
('S006', 'Shubhi Kesarwani', 2022, 'D2'),
('S007', 'Mohammad Yash', 2023, 'D3'),
('S008', 'Sakina Baranwala', 2021, 'D4'),

('S009', 'Meme Myanmar', 2023, 'D1'),
('S010', 'Chainesh Gautam', 2022, 'D2'),
('S011', 'Fitriana DewiPrasad', 2023, 'D3'),
('S012', 'Maitri Triwedi', 2021, 'D4');


INSERT INTO placement_student (student_id, acceptance)
VALUES
    ('S001', TRUE),
    ('S002', TRUE),
    ('S003', FALSE),
    ('S004', FALSE),

('S005', TRUE),
('S006', TRUE),
('S007', TRUE),
('S008', TRUE),

    ('S009', TRUE),
    ('S010', TRUE),
    ('S011', FALSE),
    ('S012', FALSE);


INSERT INTO alumni (alumni_id, contact_number, email, student_id)
VALUES
    (1001, '1234567890', 'alicejohnson@gmail.com', 'S001'),
    (1002, '0987654321', 'bobwilliams@gmail.com', 'S002'),
    (1003, '1122334455', 'charliedavis@gmail.com', 'S003'),

(1004, '1234567890', 'soumyajain@gmail.com', 'S005'),
(1005, '0987654321', 'subhikesarwani@gmail.com', 'S006'),
(1006, '1122334455', 'mohammadyash@gmail.com', 'S007'),

(1007, '1234567890', 'mememyanmar@gmail.com', 'S009'),
(1008, '0987654321', 'chaineshgautam@gmail.com', 'S010'),
(1009, '1122334455', 'fitrianadewiprasad@gmail.com', 'S011');


INSERT INTO alumni_organisation (id, alumni_id, organization_name, position, joining_date, leaving_date, student_id)
VALUES
    (1, 1001, 'Google', 'Software Engineer', '2023-06-01', NULL, 'S001'),
    (2, 1002, 'Microsoft', 'System Analyst', '2022-08-15', '2024-01-01', 'S002'),
    (3, 1003, 'Intel', 'Hardware Engineer', '2023-02-01', NULL, 'S003'),
    (4, 1004, 'Google', 'Software Engineer', '2023-06-01', NULL, 'S005'),

    (5, 1005, 'Google', 'Software Engineer', '2023-06-01', NULL, 'S006'),
    (6, 1006, 'Microsoft', 'System Analyst', '2022-08-15', '2024-01-01', 'S007'),
    (7, 1007, 'Intel', 'Hardware Engineer', '2023-02-01', NULL, 'S008'),
    (8, 1008, 'Google', 'Software Engineer', '2023-06-01', NULL, 'S009'),

    (9, 1009, 'Google', 'Software Engineer', '2023-06-01', NULL, 'S010');
