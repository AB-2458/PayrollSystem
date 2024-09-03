package com.payrollsystem.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class PUtility {
	public static Connection getMySQLConnection()
	{
		Connection connection = null;
		 try {
	            // below two lines are used for connectivity.
			 Class.forName("com.mysql.cj.jdbc.Driver");
	            connection = DriverManager.getConnection(
	                "jdbc:mysql://localhost:3306/ems",
	                "root", "Ab@2458#");
	           
		 }
	        catch (Exception exception) {
	            System.out.println(exception);
	        }
		 return connection;
	}

	public static void main(String[] args) {
		Connection connection = null;
        try {
            // below two lines are used for connectivity.
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/ems",
                "root", "Ab@2458#");
 
            // sts is database
            // root is name of database
            // root is password of database
 
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery(
                "select * from tbluser");
            int userId;
            String userName;
            while (resultSet.next()) {
            	userId = resultSet.getInt("userId");
            	userName = resultSet.getString("userName").trim();
                System.out.println("userId : " + userId
                                   + " userName : " + userName);
            }
            resultSet.close();
            statement.close();
            connection.close();
        }
        catch (Exception exception) {
            System.out.println(exception);
        }

	}


}
