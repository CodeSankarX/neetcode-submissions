-- Write your query below


select customers.name from customers 
left join orders on orders.customer_id=customers.id
where orders.id is NULL