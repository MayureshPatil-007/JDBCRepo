package projectone;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Employee 
{
	static int id1;
	static String name1;
	static String dname1;
	static String address1;
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		System.out.println("Driver Successfully Registered");
		
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/gitone","root","Mayuresh@18");//gitone is my database in sql
		System.out.println("Connection Successfully Established");
		
		Statement st=con.createStatement();
		st.execute("create table Employee (id int,name varchar(30),dname varchar(30),address varchar(50),primary key(id))");
		System.out.println("Table Successfully Created");
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Id Number");
		id1=sc.nextInt();
		System.out.println("Enter Your Name");
		name1=sc.next();
		System.out.println("Enter Department Number");
		dname1=sc.next();
		System.out.println("Enter Your Adress");
		address1=sc.next();
		
		PreparedStatement ps=con.prepareStatement("insert into employee values(?,?,?,?)");
		ps.setInt(1, id1);
		ps.setString(2, name1);
		ps.setString(3, dname1);
		ps.setString(4, address1);
		ps.execute();
		System.out.println("Data Added Successfully");
		
		
	}
}
