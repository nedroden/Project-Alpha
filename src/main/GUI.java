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

import java.awt.*;
import javax.swing.*;

/**
 * This class generates the GUI used by the software.
 */
public class GUI {
	
	protected JFrame _frame;
	protected JPanel _panelMain;
	protected CardLayout mainCl;

	protected Color _panelBackgroundColor = new Color(227, 236, 249);
	
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
	public void display() {
		
		mainCl = new CardLayout();
		
		// Create a new window and make sure it's visible
		_frame = new JFrame(Configuration.config.getProperty("window_title"));
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		
		_panelMain = new JPanel();
		Section section = new Section();
		section.display();
		
		// Layouts
		JPanel _layoutHomePage = new JPanel();
		_layoutHomePage.setVisible(true);
		
		// The default section
		_frame.add(_panelMain);
		
		// Display the navigation bar
		Menu menu = new Menu();
		menu.display();
		_frame.setJMenuBar(menu._menuBar);
		
		_frame.setVisible(true);
	}
}