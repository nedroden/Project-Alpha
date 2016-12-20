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
	
	JLabel labelOne = new JLabel("Test");
	
	/**
	 * The constructor
	 * @return void
	 */
	public Home() {
		JPanel _layoutHomePage = new JPanel();
		super._panelMain.setLayout(mainCl);
		super._panelMain.setBackground(_panelBackgroundColor);
		super._panelMain.setVisible(true);
		_layoutHomePage.setVisible(true);
		super._frame.add(_layoutHomePage);
	}
	
	/**
	 * This method displays the index page itself
	 * @return void
	 */
	public void display() {
		super._panelMain.add(labelOne);
	}
}