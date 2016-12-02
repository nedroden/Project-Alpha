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
	
	private GUI gui = new GUI();
	
	/**
	 * The constructor. Currently, it doesn't do much.
	 * @return void
	 */
	public ProjectAlpha() {
		
	}
	
	/**
	 * Initialize the program by calling the necessary classes
	 * @return void
	 */
	public void init() {
		gui.displayFrame();
	}
}