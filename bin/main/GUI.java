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
import java.awt.Event.*;
import javax.swing.*;

/**
 * This class generates the GUI used by the software.
 */
public class GUI {
	
	private JFrame _frame;
	private JPanel _panel;
	private JMenuBar _menu;
	
	// Settings
	private Color _panelBackgroundColor = new Color(227, 236, 249);
	
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
		_frame = new JFrame("Project Alpha | Hotel management software");
		_frame.setVisible(true);
		_frame.setSize(1200, 800);
		_frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		_panel = new JPanel();
		_panel.setBackground(_panelBackgroundColor);
		_panel.setVisible(true);
		
		displayNavbar();
		
		_frame.add(_panel);
		_frame.setJMenuBar(_menu);
	}
	
	/**
	 * Display the menu bar
	 * @todo Replace with sidebar menu
	 * @return void
	 */
	private void displayNavbar() {

		_menu = new JMenuBar();
		
		// Top level menu bar buttons should be added here
		JMenu index = new JMenu("Index");
		JMenu frontOffice = new JMenu("Front Office");
		JMenu reservations = new JMenu("Reservations");
		JMenu help = new JMenu("Help");
		
		// Drop-down menu items should be added here
		JMenuItem exit = new JMenuItem("Exit");
		JMenuItem about = new JMenuItem("About");

		// Add the panel items to the menu
		_menu.add(index);
		_menu.add(frontOffice);
		_menu.add(reservations);
		_menu.add(help);
		
		// Add all sub-menu items to their respective parent items
		index.add(exit);
		help.add(about);
	}
}