# Write your MySQL query statement below
SELECT p.product_id,
ROUND(IFNULL(SUM(p.price * s.units) / SUM(s.units), 0), 2) as average_price
FROM Prices p LEFT JOIN UnitsSold s
ON p.product_id = s.product_id and p.start_date <= s.purchase_date and p.end_date >= s.purchase_date
GROUP BY p.product_id;