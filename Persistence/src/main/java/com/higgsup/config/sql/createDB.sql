CREATE DATABASE LearnJavaAdverces;
USE LearnJavaAdverces;

CREATE TABLE clazz
(
  id   INT          NOT NULL
    PRIMARY KEY,
  name VARCHAR(100) NULL
);

CREATE TABLE student
(
  id   INT AUTO_INCREMENT
    PRIMARY KEY,
  name VARCHAR(200) NULL,
  age  INT          NULL
);