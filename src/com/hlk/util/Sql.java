package com.hlk.util;
import java.sql.*;
public class Sql
{
	
	public ResultSet rsexecuteQuery(String Sql) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/dictionary","root","");
		Statement stmt=con.createStatement();
		ResultSet rs=stmt.executeQuery(Sql);
		return rs;
	}
	public int rsexecuteUpdate(String Sql) throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","");
		Statement stmt=con.createStatement();
		return stmt.executeUpdate(Sql);
		
	}
}