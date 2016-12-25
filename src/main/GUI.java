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
public class GUI extends JFrame {

	public static Color _panelBackgroundColor;

	/**
	 * The constructor
	 * @return void
	 */
	public GUI() {
		super(Configuration.config.getProperty("window_title"));
		setExtendedState(JFrame.MAXIMIZED_BOTH);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		_panelBackgroundColor = new Color(227, 236, 249);;
	}
	
	/**
	 * Display the window
	 * @return void
	 */
	public void display() {
		setContentPane(Home.displaySection());

		Menu menu = new Menu(this);

		setJMenuBar(menu.display());
		setVisible(true);
	}

	/**
	 * Switch panels
	 * @return void
	 */
	public void switchPanel(JPanel panel) {
		setContentPane(panel);
	}
}