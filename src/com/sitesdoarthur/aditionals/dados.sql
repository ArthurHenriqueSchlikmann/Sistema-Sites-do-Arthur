CREATE DATABASE dados
GO

USE dados

CREATE TABLE Vinicius ( 
    ID INT PRIMARY KEY IDENTITY(1, 1),
    NOME VARCHAR(8) NOT NULL,
    IDADE INTEGER NOT NULL,
    APELIDO VARCHAR(4) NOT NULL
)