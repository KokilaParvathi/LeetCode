# Write your MySQL query statement below
select *
from Users
where binary right(mail, 13) = '@leetcode.com'
  and left(mail, length(mail) - 13) regexp '^[A-Za-z][A-Za-z0-9_.-]*$';

