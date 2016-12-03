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
	
	public JFrame frame;

	protected JPanel _panel;
	
	// Settings
	private Color _panelBackgroundColor = new Color(227, 236, 249);
	private String _windowTitle = "Project Alpha | Hotel management software";
	
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
		
		// Create a new window and make sure it's visible
		frame = new JFrame(_windowTitle);
		frame.setSize(1200, 800);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		_panel = new JPanel();
		_panel.setBackground(_panelBackgroundColor);
		_panel.setVisible(true);
		
		frame.add(_panel);
		
		// Display the navigation bar
		Menu menu = new Menu();
		menu.display();
		frame.setJMenuBar(menu._menuBar);
		
		frame.setVisible(true);
	}
}