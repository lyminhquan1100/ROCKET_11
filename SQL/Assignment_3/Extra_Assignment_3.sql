-- Exercise 1: Subquery
-- Question 1: Lay Name = 'Saddles'
SELECT		`Name`
FROM		`product`
WHERE		ProductSubcategoryID = (SELECT	ProductSubcategoryID
								FROM	`productsubcategory`
								WHERE	`Name` = 'Saddles');
                                
-- Question 2: Lay Name = Bo.....
SELECT		`Name`
FROM		`product`
WHERE		ProductSubcategoryID IN (SELECT	ProductSubcategoryID
									FROM	`productsubcategory`
									WHERE	`Name` LIKE 'Bo%');
                                    
-- Question	3:	Trả về các sản phầm có giá rẻ nhất
WITH	Lowest_ListPrice AS(
SELECT	MIN(ListPrice)
FROM	`Product`
WHERE	ProductSubcategoryID = 3)

SELECT 	`Name`
FROM 	`Product`
WHERE	ListPrice = (SELECT * FROM Lowest_ListPrice);

-- Exercise 2: JOIN nhiều bảng

-- Question 1: Viết query lấy danh sách tên country và province được lưu trong database
SELECT  A.`Name`, B.`Name`
FROM	`countryregion` A
JOIN	`stateprovince` B ON A.CountryRegionCode = B.CountryRegionCode;

-- Question 2:	tiep tuc query truoc va them dieu kien chi lay Germany va Canada

SELECT  A.`Name`, B.`Name`
FROM	`countryregion` A
JOIN	`stateprovince` B ON A.CountryRegionCode = B.CountryRegionCode
WHERE	A.`Name` = 'Germany' OR 	A.`Name` = 'Canada';
-- Tai sao khong dung duoc lenh WHERE IN

-- Question 3: 

SELECT 	B.SalesOrderID, B.OrderDate, A.SalesPersonID, A.Bonus, A.SalesYTD
FROM	salesperson A INNER JOIN salesorderheader B
ON	A.SalesPersonID = B.SalesPersonID;


-- Question 4: 
SELECT 	B.SalesOrderID, B.OrderDate, A.SalesPersonID, A.Bonus, A.SalesYTD, C.Title
FROM	salesperson A INNER JOIN salesorderheader B
ON	A.SalesPersonID = B.SalesPersonID
INNER JOIN	employee C
ON			B.SalesPersonID = C.EmployeeID;







	






