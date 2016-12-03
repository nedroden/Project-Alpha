/**
 * PROJECT ALPHA | Open source hotel management software
 *
 * SoftwareInfo.java
 * @since December 3, 2016
 * @package help
 * 
 * @version 1.0.0
 * @authors Rick Nieborg, Mark Nieborg & Robert Monden
 * @copyright 2016 Project Alpha
 * 
 * @license MIT
 */

package help;

import javax.swing.JOptionPane;

/**
 * This class is used for displaying software information, such as the about page.
 */
public class SoftwareInfo {
	
	private String _softwareVersion;
	
	/**
	 * The constructor
	 * @return void
	 */
	public SoftwareInfo() {
		_softwareVersion = main.ProjectAlpha.softwareVersion;
	}
	
	/**
	 * This method displays a popup with software information.
	 * @return void
	 */
	public void show() {
		JOptionPane.showMessageDialog(null, "Project Alpha - Hotel management system\nCreated by Rick Nieborg, Mark Nieborg and Robert Monden\nCurrent version: " + _softwareVersion);
	}
}