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

	protected Color _panelBackgroundColor;
	
	/**
	 * The constructor
	 * @return void 
	 */
	public GUI() {
		_panelBackgroundColor = new Color(227, 236, 249);
		_panelMain = new JPanel();
		_frame = new JFrame(Configuration.config.getProperty("window_title"));
	}
	
	/**
	 * Display the window
	 * @return false
	 */
	public void display() {
		
		mainCl = new CardLayout();

		_panelMain.setLayout(mainCl);

		mainCl.show(_panelMain, "1");

		Home home = new Home();
		home.display();
		
		// Display the navigation bar
		Menu menu = new Menu();
		menu.display();
		_frame.setJMenuBar(menu._menuBar);

		// Create a new window
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
		_frame.pack();
		_frame.setVisible(true);
	}
}