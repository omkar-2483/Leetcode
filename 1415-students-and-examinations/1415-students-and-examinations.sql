# Write your MySQL query statement below
Select s.student_id, s.student_name, s2.subject_name, COUNT(e.student_id) As attended_exams
From (Students s Join Subjects s2)
Left Join Examinations e ON s.student_id=e.student_id and s2.subject_name=e.subject_name
GROUP BY s.student_id, s2.subject_name
ORDER BY s.student_id, s2.subject_name; 
