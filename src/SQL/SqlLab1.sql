-- SQL laboratorium 1
-- Wyœwietl:
USE AdventureWorks

-- wszystkie wiersze (wszystkie kolumny) tabeli [SalesOrderHeader]
SELECT * 
FROM Sales.SalesOrderHeader

-- 3 wybrane kolumny tabeli [SalesOrderHeader] posortowanie wg kolumny ModifiedDate malej¹co
SELECT SalesOrderID, ShipDate, ModifiedDate 
FROM Sales.SalesOrderHeader
ORDER BY ModifiedDate DESC

-- 3 kolumny tabeli [Person].[Contact], posortowane wg LastName malej¹co i FirstName rosn¹co
SELECT LastName, FirstName, EmailAddress 
FROM Person.Contact 
ORDER BY LastName DESC, FirstName ASC

-- wszystkie wiersze z tabeli Person.Contact zawieraj¹ce ‘Michael’ w kolumnie FirstName, posortowane wg kolumny Lastname
SELECT * FROM Person.Contact  
WHERE FirstName = 'Michael'
ORDER BY LastName

-- wszystkie dane kontaktowe (tabela Person.Contact) osób o innym imieniu ni¿ ‘Michael’ i nazwisku zaczynaj¹cym siê na Ac (zapytanie zwróci 4 wiersze)
SELECT * FROM Person.Contact  
WHERE FirstName <> 'Michael' AND LastName LIKE 'Ac%'

-- wszystkie dane kontaktowe zmodyfikowane miêdzy 1, a 22 wrzeœnia 2003 (928 wierszy)
SELECT * FROM Person.Contact  
WHERE ModifiedDate BETWEEN '20030901' AND '20030922'

SELECT * FROM Person.Contact  
WHERE ModifiedDate BETWEEN '2003-09-01 00:00:00.000' AND '2003-09-22 00:00:00.000'

-- 10 ostatnio zatrudnionych pracowników
SELECT TOP 10 * 
FROM HumanResources.Employee
ORDER BY HireDate DESC

SELECT TOP 10 con.FirstName, con.LastName, emp.HireDate 
FROM HumanResources.Employee emp 
JOIN Person.Contact con on emp.ContactID = con.ContactID
ORDER BY HireDate DESC

-- 10 najstarszych pracowników p³ci ¿eñskiej
SELECT TOP 10 *
FROM HumanResources.Employee
WHERE Gender = 'F'
ORDER BY BirthDate;

-- pracowników, których stanowisko (kolumna Title) zaczyna siê na ‘Production Technician’, lub ‘Tool Designer’, posortowani wg nazwy stanowiska
SELECT *
FROM HumanResources.Employee
WHERE (Title LIKE 'Production Technician%' OR Title LIKE 'Tool Designer%')
ORDER BY Title

-- nazwy stanowisk bez duplikatów (67 wierszy)
SELECT DISTINCT Title
FROM HumanResources.Employee

-- 3 kolumny z tabeli Person.Contact, korzystaj¹c z aliasów, przet³umacz nazwy kolumn w wyniku na jêzyk polski: FirstName=Imie, LastName=Nazwisko, Phone=Telefon
SELECT FirstName AS Imie, LastName AS Nazwisko, Phone AS Telefon
FROM Person.Contact