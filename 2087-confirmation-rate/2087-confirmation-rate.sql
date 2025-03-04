# Write your MySQL query statement below
SELECT s.user_id, 
ROUND(SUM(CASE WHEN c.action = 'confirmed' THEN 1 ELSE 0 END) / COUNT(s.user_id), 2)  
as confirmation_rate 
FROM Signups s LEFT JOIN Confirmations c
on s.user_id = c.user_id
GROUP BY s.user_id;