-- Question 1:
SELECT	DepartmentName  FROM `department`;

-- Question 2:
SELECT	DepartmentID FROM `department`
WHERE	DepartmentName = 'Sale';

-- Question 3:
SELECT 		FullName,char_length(FullName)
FROM 		`Account` 
WHERE		char_length(Fullname) = (SELECT MAX(char_length(Fullname)) FROM `Account`);

-- Question 4:
SELECT*
FROM `group`
ORDER BY CreateDate
LIMIT 1;

-- Question 5:
SELECT 		QuestionID
FROM 		Answer
GROUP BY 	QuestionID
HAVING 		COUNT(QuestionID) >= 4;

-- Question 6:
SELECT	 GroupName
FROM	`group`
ORDER BY CreateDate	DESC
LIMIT 5;

-- Question 8:
DELETE 		CreateDate
FROM 		`exam` 
WHERE 		CreateDate < '2019-12-20';

-- Question 9:
UPDATE 		`Account` 
SET 		Fullname 	= 	N'Nguyễn Bá Lộc', 
			Email 		= 	'loc.nguyenba@vti.com.vn'
WHERE 		AccountID = 5;

-- Question 10:
SELECT *
FROM	`account` a
JOIN	`department` b ON a.DepartmentID = b.DepartmentID;

-- Question 11:
SELECT FullName,PositionName
FROM	`account` a
JOIN	`position` b ON a.PositionID = b.PositionID
WHERE	PositionName = 'dev';

-- Question 12:
SELECT 		b.DepartmentID, b.DepartmentName, COUNT(b.DepartmentID)
FROM 		`Account` a 
INNER JOIN 	Department  b ON a.DepartmentID = b.DepartmentID
GROUP BY 	a.DepartmentID
HAVING		COUNT(a.DepartmentID) >2;

-- Question 13:
SELECT		CQ.CategoryID, CQ.CategoryName, COUNT(Q.CategoryID) 
FROM		CategoryQuestion CQ 
LEFT JOIN 	Question Q ON CQ.CategoryID = Q.CategoryID
GROUP BY	CQ.CategoryID
ORDER BY	CQ.CategoryID ASC;

-- Question 19:
SELECT		T.TypeName , COUNT(Q.TypeID)
FROM		Question Q 
JOIN 	TypeQuestion T ON Q.TypeID = T.TypeID
GROUP BY	Q.TypeID;

-- Question 15:
SELECT 		Q.QuestionID, Q.Content, Q.CategoryID, Q.TypeID, Q.CreatorID, Q.CreateDate, Count(Q.Content) AS 'SO LUONG'
FROM		Question Q 
INNER JOIN 	ExamQuestion EQ ON Q.QuestionID = EQ.QuestionID
GROUP BY	Q.Content
HAVING		COUNT(Q.Content) = (SELECT	MAX(CountQ)
								FROM		
										(SELECT 		COUNT(Q.QuestionID) AS CountQ
										FROM			ExamQuestion EQ 
										INNER JOIN 		Question Q ON EQ.QuestionID = Q.QuestionID
										GROUP BY		Q.QuestionID) AS MaxContent);





