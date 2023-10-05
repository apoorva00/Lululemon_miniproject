package com.lulu.testconn;
import java.sql.Connection;

import java.sql.DriverManager;

public class ConnectDB {
	static Connection connection;

	public static Connection setupConnection() {

 

		try {

			 Class.forName("com.mysql.cj.jdbc.Driver");//drive support sets up

 

	         connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/aa",

	            "root", "2029_Lulu_0501");

		}

		catch(Exception E) {

 

		}

		return connection;

	}
	

}
