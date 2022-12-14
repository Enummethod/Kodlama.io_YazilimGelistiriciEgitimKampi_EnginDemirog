--Select
Select ContactName Adi,CompanyName Sirketadi, City Sehir from Customers

Select * from Customers where City = 'Berlin'

--case insensitive
select * from Products where CategoryID=1 or CategoryID=3

select * from Products where CategoryID=1 and UnitPrice>=10

select * from Products order by UnitPrice asc  --ascending(default artan)

select * from Products where CategoryID=1 order by UnitPrice desc  --descending(azalan)

select count(*) from Products

select count(*) from Products where CategoryID = 2

select categoryID, count(*) from products group by CategoryID

select categoryID, count(*) from products group by CategoryID having count (*)<10

select categoryID, count(*) from products where UnitPrice>20 group by CategoryID having count (*)<10

select  Products.ProductID, Products.ProductName, Products.UnitPrice, Categories.CategoryName
from Products inner join Categories on Products.CategoryID = Categories.CategoryID
where Products.UnitPrice>10

--DTO Data Transformation Object

--İnner Join iki tablodaki eşleşen verileri getirir.
Select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID

--left join Solda olup sağda olmayanları getir. 
Select * from Customers c left join Orders o on c.CustomerID = o.CustomerID

--left joinde where sorgusu
Select * from Customers c left join Orders o on c.CustomerID = o.CustomerID
where o.CustomerID is null

--right join Sağda olup solda olmayanları getir.

--ikiden fazla tablonun join edilmesi
select * from Products p inner join [Order Details] od on p.ProductID = od.ProductID
inner join Orders o on o.OrderID = od.OrderID
