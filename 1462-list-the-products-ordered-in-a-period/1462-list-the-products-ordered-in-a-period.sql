# Write your MySQL query statement below
select p.product_name,sum(o.unit) as unit from Products p
left join Orders o on p.product_id = o.product_id and order_date like "2020-02-%"
group by o.product_id Having unit >= 100;