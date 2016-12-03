/**
 * PROJECT ALPHA | Open source hotel management software
 *
 * Menu.java
 * @since December 3, 2016
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
import java.awt.event.*;
import javax.swing.*;

/**
 * This class contains methods used for displaying the navigation bar.
 */
public class Menu extends GUI implements ActionListener {
	
	protected JMenuBar _menuBar;
	
	/**
	 * Set some important variables
	 * @return void
	 */
	public Menu() {
		_menuBar = new JMenuBar();
	}
	
	/**
	 * Display the menu bar
	 * @return void
	 */
	public void display() {
		
		// Top level menu bar buttons should be added here
		JMenu index = new JMenu("Index");
		JMenu frontOffice = new JMenu("Front Office");
		JMenu reservations = new JMenu("Reservations");
		JMenu hotel = new JMenu("Manage hotel");
		JMenu help = new JMenu("Help");
		
		// Drop-down menu items should be added here
		JMenuItem exit = new JMenuItem("Exit");
		exit.setActionCommand("exit");
		exit.addActionListener(this);

		JMenuItem preferences = new JMenuItem("Preferences");
		JMenuItem documentation = new JMenuItem("Documentation");
		JMenuItem about = new JMenuItem("About");

		// Add the panel items to the menu
		_menuBar.add(index);
		_menuBar.add(frontOffice);
		_menuBar.add(reservations);
		_menuBar.add(hotel);
		_menuBar.add(help);
		
		// Add all sub-menu items to their respective parent items
		index.add(preferences);
		index.add(exit);
		help.add(documentation);
		help.add(about);
	}
	
	/**
	 * This class' events are handled by this function.
	 * @param ActionEvent action The action that is being performed
	 * @return void
	 */
	public void actionPerformed(ActionEvent event) {
		executeEvent(event.getActionCommand());
	}
	
	/**
	 * This method makes sure the correct method is loaded when an
	 * event occurs.
	 * @return void
	 */
	private void executeEvent(String eventName) {
		switch (eventName) {
			case "exit":
				this.exitProgram();
				break;
		}
	}
	
	/**
	 * Exit the program
	 * @return void
	 */
	private void exitProgram() {
		System.exit(0);
	}
}