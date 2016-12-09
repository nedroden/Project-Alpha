/**
 * PROJECT ALPHA | Open source hotel management software
 *
 * Database.java
 * @since December 5, 2016
 * @package main
 * 
 * @version 1.0.0
 * @authors Rick Nieborg, Mark Nieborg & Robert Monden
 * @copyright 2016 Project Alpha
 * 
 * @license MIT
 */

package main;

import java.sql.*;

public class Database {
	
	public static Connection connection;
	
	/**
	 * The constructor.
	 * @return void
	 */
	public Database() {
		
	}
	
	/**
	 * Establish a connection to the database
	 * @return void
	 */
	public void connect() {
		try {
			connection = DriverManager.getConnection(
				"jdbc:mysql://" + Configuration.config.getProperty("db_server")
					+ ":" + Configuration.config.getProperty("db_port")
					+ "/" + Configuration.config.getProperty("db_name")
					+ "?useSSL=false",
				Configuration.config.getProperty("db_username"),
				Configuration.config.getProperty("db_password"));
		}
		catch (SQLException e) {
			System.out.println("Could not establish a connection to the database. Detailed error message:");
			e.printStackTrace();
			System.exit(0);
		}
	}
	
	/**
	 * Run a query
	 * @return void
	 */
	public static void execute() {
		
	}
	
	/**
	 * Disconnect from the database
	 * @return void
	 */
	public void disconnect() {
		try {
			connection.close();
		}
		catch (SQLException e) {
			System.out.println("Could not disconnect from the database.");
			System.exit(0);
		}
	}
}