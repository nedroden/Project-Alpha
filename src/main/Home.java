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

import javax.swing.*;

/**
 * This class displays the index page
 */
public class Home extends GUI {
	
	private JLabel _labelOne = new JLabel("Test");

	protected JPanel _layoutHomePage;
	
	/**
	 * The constructor
	 * @return void
	 */
	public Home() {
		_layoutHomePage = new JPanel();
	}
	
	/**
	 * This method displays the index page itself
	 * @return void
	 */
	public void display() {
		_layoutHomePage.setBackground(super._panelBackgroundColor);
		_layoutHomePage.setVisible(true);
		super._panelMain.add(_layoutHomePage);
	}
}