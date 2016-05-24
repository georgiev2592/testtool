
-- TERM, DEPARTMENT, COURSE
INSERT INTO Term
   (quarter, year)
VALUES 
   ('Spring', 2015),
   ('Fall', 2015),
   ('Winter', 2016);
   
INSERT INTO Department
   (id, title)
VALUES
   ('CPE', 'Computer Engineering'),
   ('CSC', 'Computer Science');
   
INSERT INTO Course
   (title, dept, num)
VALUES
   ('Fundamentals of Computer Science I', 'CPE', 101),
   ('Fundamentals of Computer Science II', 'CPE', 102);
  
  
  
-- USER, STUDENT, TEACHER, GRADER
INSERT INTO User
   (username, password, firstname, lastname)
VALUES
   ('gfisher', 'password', 'Gene', 'Fisher'),
   ('ismithgr', 'password', 'Ian', 'Smith-Grove'),
   ('pgeorgie', 'password', 'Peter', 'Georgiev');

INSERT INTO Teacher
   (id)
SELECT id FROM User
   WHERE username = 'gfisher';
   
INSERT INTO Student
   (id)
SELECT id FROM User
   WHERE username = 'ismithgr'
      || username = 'pgeorgie';

INSERT INTO Grader
   (id)
SELECT id FROM User
   WHERE username = 'ismithgr';
   
INSERT INTO SysAdmin
   (id)
SELECT id FROM User
   WHERE username = 'gfisher';
   


-- DIFFICULTY
INSERT INTO Difficulty
   (rating, description)
VALUES 
   (1, 'very easy'),
   (2, 'easy'),
   (3, 'moderate'),
   (4, 'hard'),
   (5, 'very hard');
   

-- QUESTIONS
INSERT INTO Question
   (id, prompt, time_to_complete, difficulty, course, created_on, created_by)
VALUES
   (
      1,
      '\nHow many times is printf executed in the following nested loop?\n'
      '   int i,j;\n'
      '   for (i = 0; i < 10; i++) {\n'
      '      for (j = 0; j < 10; j++) {\n'
      '         printf("%d", i+j);\n'
      '      }\n'
      '}\n',
      '00:01:00',
      2,
      1,
      '2008-7-04',
      1
   ),
   (
      2,
      '\nWhat does the following code print?\n'
      '   int x = 10, y = 20;\n'
      '   if (x = y) printf("equal");\n'
      '   else if (x < y) printf("less");\n'
      '   else printf("greater");\n',
      '00:01:00',
      2,
      1,
      '2009-10-25',
      1
   );
   
INSERT INTO Answer
   (question, val, is_correct)
VALUES
   (1, '10 times', FALSE),
   (1, '11 times', FALSE),
   (1, '20 times', FALSE),
   (1, '100 times', TRUE),
   (1, 'none of the above', FALSE),
   
   (2, 'equal', FALSE),
   (2, 'less', TRUE),
   (2, 'greater', FALSE),
   (2, 'no output at all, i.e., it doesn’t print anything', FALSE);
   
   


      '
         
   
