select sell_date, count(distinct product) as num_sold,
        GROUP_CONCAT(DISTINCT product SEPARATOR ',') as products
from Activities
group by sell_date
order by sell_date