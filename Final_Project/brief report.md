# This is the Introduction of the Final Project

#Method: Java + MySQL

This project is about Student Grade Management System. It allows users to add, delete, modify or search the information which stored in database.

#There are 6 java files in this project:

#Main.java:
This is the Main Program file, users should run the program on this page.

#JDBC_Connection.java:
This file was designed for connecting with MySQL server, you can change the username and password in this file. (In addition, in order to run on your computer, you shouldn't only change the username or password but also need to create a table named 'student', you could use the following query.)</br>

CREATE TABLE Student (</br>
    stu_id CHAR(10) PRIMARY KEY,</br>
    stu_name CHAR(20) NOT NULL,</br>
    Java_score DOUBLE(5,2),</br>
    Python_score DOUBLE(5,2),</br>
    C_score DOUBLE(5,2),</br>
    Total_score DOUBLE(5,2)</br>
);</br>

#JDBC_Close.java:
This file was designed for disconnecting from MySQL server.

#SGMS.java:
This file is the main page of the program.

#Operations.java
This file contains of add(), show(), modify(), delete() and search() functions.

#checkFunctions.java
This file conclude all the check valid functions. In order to check each input is valid or not.</br>

