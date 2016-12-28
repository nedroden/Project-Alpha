/**
 * PROJECT ALPHA
 * Open source hotel management software
 *
 * @version     1.0 Alpha 1
 * @author      Rick Nieborg, Mark Nieborg, Robert Monden
 * @copyright   Project Alpha, 2016
 * @license     MIT
 *
 * Class information:
 * @package     Main
 * @since       1.0 Alpha 1
 * @author      Project Alpha development team
 */
package main;

import java.sql.*;

public class Database {
	
	public static Connection connection;

	public Database() {
		
	}

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

	public static void execute() {
		
	}

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