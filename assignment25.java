-- Create Students table
CREATE TABLE Students (
    student_id INT,
    roll_no INT,
    name VARCHAR(50),
    age INT,
    date_of_birth DATE,
    email_id VARCHAR(100),
    phone_number VARCHAR(15) NOT NULL,
    address VARCHAR(200),

    PRIMARY KEY (student_id, name, email_id)
);

-- Insert three records
INSERT INTO Students
(student_id, roll_no, name, age, date_of_birth, email_id, phone_number, address)
VALUES
(1, 101, 'Rahul', 20, '2006-05-15', 'rahul@gmail.com', '9876543210', 'Bangalore'),

(2, 102, 'Priya', 19, '2007-02-20', 'priya@gmail.com', '9876543211', 'Chennai'),

(3, 103, 'Arun', 21, '2005-11-10', 'arun@gmail.com', '9876543212', 'Hyderabad');

-- Display the records
SELECT * FROM Students;
