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

    private static JPanel _panel = new JPanel();

    /**
     * The constructor
     */
    public Home() {

    }

    /**
     * Display this section
     * @return void
     */
    public static JPanel displaySection() {
        _panel.setBackground(GUI._panelBackgroundColor);
        return _panel;
    }
}