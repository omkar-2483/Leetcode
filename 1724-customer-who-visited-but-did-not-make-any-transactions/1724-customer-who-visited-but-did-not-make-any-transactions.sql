# Write your MySQL query statement below
SELECT V.customer_id, COUNT(*) AS count_no_trans
FROM Visits V LEFT JOIN Transactions T 
ON V.Visit_id=T.Visit_id 
WHERE T.transaction_id is NULL
GROUP BY V.customer_id;