# Write your MySQL query statement below
SELECT m.name From employee m INNER JOIN employee r
ON m.id=r.managerId
GROUP BY m.id
HAving Count(m.id) >= 5; 