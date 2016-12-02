/**
 * PROJECT ALPHA | Open source hotel management software
 *
 * GUI.java
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

import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * This class generates the GUI used by the software.
 */
public class GUI {
	
	private JFrame _frame;
	private JPanel _panel;	
	
	/**
	 * The constructor
	 * @return void 
	 */
	public GUI() {
		
	}
	
	/**
	 * Display the window
	 * @return false
	 */
	public void displayFrame() {
		
		// Create a new window and make sure it's visible
		_frame = new JFrame("Just testing");
		_frame.setVisible(true);
		_frame.setSize(1200, 800);
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}