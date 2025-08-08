# Write your MySQL query statement b
update Salary set sex=
CASE
  WHEN sex='m' THEN 'f'
  WHEN sex='f' THEN 'm'
END;