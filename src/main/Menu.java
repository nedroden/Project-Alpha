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
		JMenu frontOffice = new JMenu("Front office");
		JMenu reservations = new JMenu("Reservations");
		JMenu hotel = new JMenu("Manage hotel");
		JMenu help = new JMenu("Help");
		
		// Drop-down menu items should be added here
		JMenuItem exit = new JMenuItem("Exit");
		exit.setActionCommand("exit");
		exit.addActionListener(this);
		
		JMenuItem checkIn = new JMenuItem("Check-in");
		JMenuItem checkOut = new JMenuItem("Check-out");
		JMenuItem occupiedRooms = new JMenuItem("Occupied rooms");
		JMenuItem viewRoom = new JMenuItem("View room");
		
		JMenuItem viewReservations = new JMenuItem("View reservations");
		JMenuItem makeReservation = new JMenuItem("Create reservation");
		JMenuItem modifyReservation = new JMenuItem("Modify reservation");

		JMenuItem preferences = new JMenuItem("Preferences");
		JMenuItem documentation = new JMenuItem("Documentation");
		
		JMenuItem about = new JMenuItem("About");
		about.setActionCommand("about");
		about.addActionListener(this);

		// Add the panel items to the menu
		_menuBar.add(index);
		_menuBar.add(frontOffice);
		_menuBar.add(reservations);
		_menuBar.add(hotel);
		_menuBar.add(help);
		
		// Add all sub-menu items to their respective parent items
		index.add(preferences);
		index.add(exit);
		frontOffice.add(checkIn);
		frontOffice.add(checkOut);
		frontOffice.add(occupiedRooms);
		frontOffice.add(viewRoom);
		reservations.add(viewReservations);
		reservations.add(makeReservation);
		reservations.add(modifyReservation);
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
			case "about":
				help.SoftwareInfo about = new help.SoftwareInfo();
				about.show();
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