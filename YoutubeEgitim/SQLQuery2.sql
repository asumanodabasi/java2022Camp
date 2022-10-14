--ANSıI
Select ContactName Adi,CompanyName SirketAdi,City Sehir from Customers 
--case insensitive
Select * from Customers where City='London'

Select* from Products where CategoryID=1 or CategoryID=3

Select* from Products where CategoryID=1 and UnitPrice=10

Select*from Products order by CategoryID , ProductName

Select*from Products order by UnitPrice asc --ascending

Select*from Products where CategoryID=1 order by UnitPrice desc

Select count(*) Adet from Products where CategoryID=2

select categoryId ,count(*) from Products where UnitPrice>20  group by CategoryID having count(*)<10

select Products.ProductName, Products.ProductID ,Products.UnitPrice,Categories.CategoryName
from Products inner join Categories 
on Products.CategoryID=Categories.CategoryID
where Products.UnitPrice>10

Select*from Products p left join [Order Details] od
on p.ProductID=od.ProductID

select *from Customers c left join Orders o
on c.CustomerID=o.CustomerID
where o.CustomerID is null