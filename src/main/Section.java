/**
 * PROJECT ALPHA | Open source hotel management software
 *
 * Home.java
 * @since December 14, 2016
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
 * This class loads the desired section and replaces the previous panel.
 */
public class Section {
	
	private String _section;
	
	/**
	 * The constructor
	 * @param String section The class name of the section you want to load (without the .java extension)
	 * @return void
	 */
	public Section(String section) {
		this._section = section;
	}
}