# Write your MySQL query statement below
select u.name,ifnull(Sum(r.distance),0) as travelled_distance from Users u 
left join Rides r on u.id = r.user_id 
group by u.id order by travelled_distance desc,name;