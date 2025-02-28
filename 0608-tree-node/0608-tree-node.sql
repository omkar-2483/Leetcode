# Write your MySQL query statement below
SELECT id, "Root" as type FROM Tree WHERE p_id IS NULL
UNION
SELECT id, "Inner" as type FROM Tree WHERE p_id IS NOT NULL AND id IN (Select p_id FROM Tree WHERE p_id IS NOT NULL)
UNION
SELECT id, "Leaf" as type FROM Tree WHERE p_id IS NOT NULL AND id NOT IN(Select p_id FROM Tree where p_id IS NOT NULL);