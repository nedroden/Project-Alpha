/**
 * PROJECT ALPHA | Open source hotel management software
 *
 * Loader.java
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
 * This class loads the required files to start the software.
 */
public class Loader {
	
	/**
	 * This class is called automatically
	 * @param args
	 */
	public static void main(String[] args) {
		ProjectAlpha projectAlpha = new ProjectAlpha();
		projectAlpha.init();
	}
}