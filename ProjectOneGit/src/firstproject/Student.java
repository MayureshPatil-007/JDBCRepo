package firstproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Student 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Successfully Registered");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gitone","root","Mayuresh@18");
		System.out.println("Connection Successfully Established");
		
		Statement st=con.createStatement();
		System.out.println("Statement Successfully Created");
		
		st.execute("create database gitone");
		System.out.println("Database Successfully Created");
		
		st.execute("create table student(sid int,sname varchar(30),saddress varchar(20),primary key(sid))");
	    System.out.println("Table Successfully Created");
	    
	    st.execute("insert into student (sid,sname,saddress) values (1,'Mayuresh','Pune')");
	    st.execute("insert into student (sid,sname,saddress) values (2,'Jayesh','Pune')");
	    st.execute("insert into student (sid,sname,saddress) values (3,'Naresh','Pune')");
	    st.execute("insert into student (sid,sname,saddress) values (4,'Suresh','Pune')");
	    System.out.println("Values Successfully Inserted");
	    
		
	}
}
