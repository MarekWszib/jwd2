---------------------------------------------------------------------------------
--dropping-----------------------------------------------------------------------
---------------------------------------------------------------------------------

use pedrys
GO

DROP VIEW IF EXISTS Forum.vClues
DROP VIEW IF EXISTS Forum.vTopics
DROP VIEW IF EXISTS Forum.vTopicsExtended
DROP VIEW IF EXISTS Forum.vUsersConfirmedRegistrations

ALTER TABLE Forum.Topics DROP CONSTRAINT FK_Topics_Topics_ID
ALTER TABLE Forum.Topics DROP CONSTRAINT FK_Topics_Clues_ID
ALTER TABLE Forum.Topics DROP CONSTRAINT
ALTER TABLE Forum.UserStats DROP CONSTRAINT FK_UserStats_Users_ID
ALTER TABLE Forum.UserStats DROP CONSTRAINT FK_UserStats_Topics_ID
ALTER TABLE Forum.UsersLogins DROP CONSTRAINT FK_UsersLogins_Users_ID
ALTER TABLE Forum.Users DROP CONSTRAINT CK_Users_EmailAddress

DROP TABLE Forum.Clues
DROP TABLE Forum.Topics
DROP TABLE Forum.UserStats
DROP TABLE Forum.Users
DROP TABLE Forum.UsersLogins

DROP SCHEMA Forum
GO


---------------------------------------------------------------------------------
--creating-----------------------------------------------------------------------
---------------------------------------------------------------------------------

use pedrys
GO

CREATE SCHEMA Forum
GO

CREATE TABLE Forum.Clues (
  ID int IDENTITY PRIMARY KEY,
  Name nvarchar(50) NOT NULL,
  Descript nvarchar(400),
  TopicsCount int DEFAULT 0 NOT NULL
)

CREATE TABLE Forum.Topics (
  ID int IDENTITY PRIMARY KEY,
  ParentID int,
  CreateTime datetime DEFAULT GETDATE() NOT NULL,
  TopicSubject nvarchar(128),
  TopicBody nvarchar(MAX),
  AuthorID int,
  ClueID int NOT NULL,
  ViewsCnt int DEFAULT 0 NOT NULL,
  AnswersCnt int DEFAULT 0 NOT NULL
)

CREATE TABLE Forum.UserStats (
  ID int IDENTITY PRIMARY KEY,
  UserID int NOT NULL,
  TopicID int NOT NULL,
  Times datetime DEFAULT GETDATE() NOT NULL
)

CREATE TABLE Forum.Users (
  ID int IDENTITY PRIMARY KEY,
  EmailAddress nvarchar(100) NOT NULL,
  Pass nvarchar(250),
  Firstname nvarchar(100),
  Lastname nvarchar(100),
  RegisterTime datetime DEFAULT GETDATE() NOT NULL,
  RegConfirmTime datetime,
  ForumPostsCnt int DEFAULT 0 NOT NULL
)

CREATE TABLE Forum.UsersLogins (
  ID int IDENTITY PRIMARY KEY,
  UserID int NOT NULL,
  LoginTime datetime DEFAULT GETDATE() NOT NULL,
  IPAddress varchar(30),
  HostName nvarchar(100)
)

ALTER TABLE Forum.Topics
ADD CONSTRAINT FK_Topics_Topics_ID FOREIGN KEY(ParentID)
REFERENCES Forum.Topics (ID)

ALTER TABLE Forum.Topics
ADD CONSTRAINT FK_Topics_Clues_ID FOREIGN KEY(ClueID)
REFERENCES Forum.Clues (ID)

ALTER TABLE Forum.Topics
ADD CONSTRAINT FK_Topics_Users_ID FOREIGN KEY(AuthorID)
REFERENCES Forum.Users (ID)

ALTER TABLE Forum.UserStats
ADD CONSTRAINT FK_UserStats_Users_ID FOREIGN KEY(UserID)
REFERENCES Forum.Users (ID)

ALTER TABLE Forum.UserStats
ADD CONSTRAINT FK_UserStats_Topics_ID FOREIGN KEY(TopicID)
REFERENCES Forum.Topics (ID)

ALTER TABLE Forum.UsersLogins
ADD CONSTRAINT FK_UsersLogins_Users_ID FOREIGN KEY(UserID)
REFERENCES Forum.Users (ID)

ALTER TABLE Forum.Users
ADD CONSTRAINT CK_Users_EmailAddress CHECK (CHARINDEX('@',EmailAddress) <> 0)

GO
