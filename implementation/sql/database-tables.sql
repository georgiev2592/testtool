-- Represents a particular section of the college.
--   i.e. { CSC, Computer Science }, { PSY, Psychology }
CREATE TABLE Department (
   id varchar(5),
   title varchar(30),
   PRIMARY KEY (id),
   UNIQUE (title)
);

-- Registered user of the test tool system
CREATE TABLE User (
   id int AUTO_INCREMENT,
   username  varchar(30), 
   password  varchar(30),
   email     varchar(30),
   firstname varchar(30),
   lastname  varchar(40),
   PRIMARY KEY (id),
   UNIQUE (username),
   UNIQUE (email)
);

-- Registered user given priviliges of a teacher:
--    can create questions/tests
--    can assign tests to course
--    can grade test submissions for their courses
CREATE TABLE Teacher (
   id int, 
   department varchar(5), 
   primary key (id), 
   FOREIGN KEY (id) REFERENCES User(id), 
   FOREIGN KEY (department) REFERENCES Department(id)
);

-- Registered user given permissions of a student:
--    can take tests assigned to them
--    can view grades for their test submissions
CREATE TABLE Student (
   id int,
   year int,   -- i.e. Sophomore (2), Junior (3)
   PRIMARY KEY (id),
   FOREIGN KEY (id) REFERENCES User(id)
);

-- Registered user given permissions of a grader:
--    can grade test submissions for a specified course
CREATE TABLE Grader (
   id int,
   PRIMARY KEY (id),
   FOREIGN KEY (id) REFERENCES User(id)
);

-- Registered user given superuser permissions:
--    can add, edit, and delete other registered users
--    can modify courses, departments, etc
CREATE TABLE SysAdmin (
   id int,
   PRIMARY KEY (id),
   FOREIGN KEY (id) REFERENCES User(id)
); 






-- Period during which a course can be offered
--   i.e. { Fall, 2015 }, { Winter, 2016 }
CREATE TABLE Term (
   quarter varchar(6),
   year int,
   PRIMARY KEY (quarter, year)
);

-- Represents a course offered by the college.
--   i.e. { CPE 101: Fundamentals of Computer Science I }
CREATE TABLE Course (
   id int AUTO_INCREMENT,
   title varchar(50),
   dept varchar(5),
   num int,
   PRIMARY KEY (id),
   FOREIGN KEY (dept) REFERENCES Department(id),
   UNIQUE (title, dept, num)
);

-- An instance of a course offered for a specific term.
--   Each class has a single teacher, and is associated with
--   a roster of students, a list of published tests, and
--   a list of graded student submissions.
CREATE TABLE CourseOffering (
   id int AUTO_INCREMENT,
   course int,
   quarter varchar(6),
   year int,
   teacher int,
   PRIMARY KEY (id),
   FOREIGN KEY (course) REFERENCES Course(id),
   FOREIGN KEY (quarter, year) REFERENCES Term(quarter, year),
   FOREIGN KEY (teacher) REFERENCES Teacher(id),
   UNIQUE (quarter, year, course)
);






-- Difficulty rating assigned to each question.
--   NOTE: this entity is only useful if we want to have string
--         representations for difficulty ratings
CREATE TABLE Difficulty (
   rating int,                  -- 1 - 5
   description varchar(10),     -- moderate, difficult, etc
   PRIMARY KEY (rating),
   UNIQUE(rating, description)
);

-- Data pertaining to a test question.
CREATE TABLE Question (
   id int AUTO_INCREMENT,
   prompt varchar(255),
   time_to_complete time,
   difficulty int,
   course int,
   created_by int,
   created_on date,
   PRIMARY KEY (id),
   FOREIGN KEY (difficulty) REFERENCES Difficulty(rating),
   FOREIGN KEY (course) REFERENCES Course(id),
   FOREIGN KEY (created_by) REFERENCES Teacher(id)
);

-- Possible response to a test question.
CREATE TABLE Answer (
   question int,
   val varchar(50),
   is_correct bool,
   PRIMARY KEY (question, val),
   FOREIGN KEY (question) REFERENCES Question(id)
);

-- Data pertaining to a test.
CREATE TABLE Test (
   id int AUTO_INCREMENT,
   title varchar(40),
   course int,
   created_by int,
   created_on date,
   PRIMARY KEY (id),
   FOREIGN KEY (course) REFERENCES Course(id),
   FOREIGN KEY (created_by) REFERENCES Teacher(id)
);

-- Assignment of a test question to a page of a test
CREATE TABLE TestQuestionMapping (
   question int,
   test int,
   pageNum int,
   PRIMARY KEY (question, test, pageNum),
   FOREIGN KEY (question) REFERENCES Question(id),
   FOREIGN KEY (test) REFERENCES Test(id)
);

-- Keywords associate with questions to aid question search.
CREATE TABLE Keyword (
   word varchar(12),
   question int,
   PRIMARY KEY (word, question),
   FOREIGN KEY (question) REFERENCES Question(id)
);








-- Data pertaining to a published test question.
--  Cannot be edited but can be responded to as part of a published test.
CREATE TABLE PublishedQuestion (
   id int AUTO_INCREMENT,
   prompt varchar(255),
   max_score float,       -- specific to published question
   PRIMARY KEY (id)
);

-- Possible response to a published test question (answer key)
--  Cannot be edited. Used as key to grade test submissions.
CREATE TABLE PublishedAnswer (
   question int,
   val varchar(50),
   is_correct boolean,
   PRIMARY KEY (question, val),
   FOREIGN KEY (question) REFERENCES PublishedQuestion(id)
);

-- Data pertaining to a published test.
--  A published test cannot be edited but can be assigned/taken.
CREATE TABLE PublishedTest (
   id int AUTO_INCREMENT,              --
   title varchar(50),   --
   intro varchar(255),  -- specific to published test
   time_limit time,     -- specific to published test
   course int,
   published_by int,    --
   published_on date,   --
   PRIMARY KEY (id),
   FOREIGN KEY (course) REFERENCES Course(id),
   FOREIGN KEY (published_by) REFERENCES Teacher(id)
);

-- Assignment of a published test question to a page of a published test.
CREATE TABLE PublishedTestQuestionMapping (
   question int,
   test int,
   pageNum int,
   PRIMARY KEY (question, test, pageNum),
   FOREIGN KEY (question) REFERENCES PublishedQuestion(id),
   FOREIGN KEY (test) REFERENCES PublishedTest(id)
);






-- 
CREATE TABLE TestSubmission (
   student int,
   assignment int,
   course int,
   timestamp datetime,
   PRIMARY KEY (student, assignment, course),
   FOREIGN KEY (student) REFERENCES Student(id),
   FOREIGN KEY (assignment) REFERENCES PublishedTest(id),
   FOREIGN KEY (course) REFERENCES CourseOffering(id)
);

--
CREATE TABLE AnswerSubmission (
   grade_score int,
   grade_comment varchar(50),
   question int,
   test int,
   pageNum int,
   FOREIGN KEY (question, test, pageNum) 
      REFERENCES PublishedTestQuestionMapping(question, test, pageNum)
);













-- Represents relationship of many students to one course (roster)
CREATE TABLE Enrollment (
   student int,
   course int,
   PRIMARY KEY (student, course),
   FOREIGN KEY (student) REFERENCES Student(id),
   FOREIGN KEY (course) REFERENCES Course(id)
);

-- Represents relationship of many published tests to one course
CREATE TABLE Assignment (
   test int,
   course int,
   asgn_date datetime,
   expr_date datetime,
   primary key (test, course),
   FOREIGN KEY (test) REFERENCES PublishedTest(id),
   FOREIGN KEY (course) REFERENCES Course(id)
);


-- Represents relationship of many test submissions to one course assignment
--Submission
