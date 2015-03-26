SELECT Name FROM Customers WHERE ID NOT IN (SELECT CustomerId FROM Orders);
