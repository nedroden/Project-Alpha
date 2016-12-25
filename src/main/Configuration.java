/**
 * PROJECT ALPHA | Open source hotel management software
 *
 * Configuration.java
 * @since December 8, 2016
 * @package main
 * 
 * @version 1.0.0
 * @authors Rick Nieborg, Mark Nieborg & Robert Monden
 * @copyright 2016 Project Alpha
 * 
 * @license MIT
 */

package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This class loads the configuration file and makes sure the settings
 * in that file can be used by the software.
 */
public class Configuration {
	
	public static Properties config;
	
	/**
	 * Create a new instance of the settings
	 * @return void
	 */
	public Configuration() {
		config = new Properties();
	}
	
	/**
	 * Get the configuration file and the settings it contains.
	 * Then, make sure we can use them.
	 * @return void
	 */
	public void load() {
		try {
			config.load(new FileInputStream("config.properties"));
		}
		catch (IOException e) {
			System.out.printf("Could not load configuration file. Detailed error message: %s", e.getMessage());
			System.exit(0);
		}		
	}
}