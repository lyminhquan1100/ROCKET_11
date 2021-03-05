DROP DATABASE IF EXISTS FresherManagement;
CREATE DATABASE FresherManagement;
USE FresherManagement;

DROP TABLE IF EXISTS Trainee;
CREATE TABLE Trainee(
	TraineeID 			TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Full_Name			NVARCHAR(50) NOT NULL,
    Birth_Date			DATE NOT NULL,
    Gender				ENUM('male','female','unknown') NOT NULL,
    ET_IQ				TINYINT UNSIGNED CHECK(ET_IQ<=20) NOT NULL,
    ET_Gmath			TINYINT UNSIGNED CHECK(ET_Gmath<=20) NOT NULL,
    ET_English			TINYINT UNSIGNED CHECK(ET_English<=20) NOT NULL,
    Trainning_Class		CHAR(6) NOT NULL,
    Evaluation_Notes	NVARCHAR(50) NOT NULL
);

ALTER TABLE Trainee ADD COLUMN VTI_Account VARCHAR(30) NOT NULL UNIQUE;

DROP TABLE IF EXISTS Exercise2;
CREATE TABLE Exercise2(
	ID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Name			VARCHAR(50) NOT NULL,
    Code			CHAR(5) NOT NULL,
    ModifiedDate	DATETIME DEFAULT NOW()
);

DROP TABLE IF EXISTS Exercise3;
CREATE TABLE Exercise3(
	ID 				TINYINT UNSIGNED AUTO_INCREMENT PRIMARY KEY,
    Name			VARCHAR(50) NOT NULL,
    BirthDate		DATE NOT NULL,
    Gender			ENUM('0','1','2'), 
    IsDeletedFlag	ENUM('0','1') 
);
