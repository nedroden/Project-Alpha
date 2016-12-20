/**
 * PROJECT ALPHA | Open source hotel management software
 *
 * ProjectAlpha.java
 * @since December 2, 2016
 * @package main
 * 
 * @version 1.0.0
 * @authors Rick Nieborg, Mark Nieborg & Robert Monden
 * @copyright 2016 Project Alpha
 * 
 * @license MIT
 */

package main;

/**
 * This class initializes the application
 */
public class ProjectAlpha {
	
	private GUI gui;
	
	public static String softwareVersion = "1.0.0";
	
	/**
	 * The constructor.
	 * @return void
	 */
	public ProjectAlpha() {

	}
	
	/**
	 * Initialize the program by calling the necessary classes
	 * @return void
	 */
	public void init() {
		
		// Get the settings and load the database
		Configuration config = new Configuration();
		config.load();
		Database db = new Database();
		db.connect();

		gui = new GUI();
		gui.display();
	}
}