/**
 * PROJECT ALPHA
 * Open source hotel management software
 *
 * @version     1.0 Alpha 1
 * @author      Rick Nieborg, Mark Nieborg, Robert Monden
 * @copyright   Project Alpha, 2016-2017
 * @license     MIT
 *
 * Class information:
 * @package     Main
 * @since       1.0 Alpha 1
 * @author      Project Alpha development team
 */
package main;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;

public class Sidebar {

    public Sidebar() {

    }

    public VBox getSidebar() {

        VBox sidebar = new VBox(10);

        Button button_home = new Button();
        button_home.setId("button_home");

        Button button_checkin = new Button();
        button_checkin.setId("button_checkin");

        Button button_checkout = new Button();
        button_checkout.setId("button_checkout");

        Button button_newreservation = new Button();
        button_newreservation.setId("button_newreservation");

        Button button_reservations = new Button();
        button_reservations.setId("button_reservations");

        Button button_preferences = new Button();
        button_preferences.setId("button_preferences");

        Button button_quit = new Button();
        button_quit.setId("button_quit");
        button_quit.setOnAction(e -> System.exit(1));

        sidebar.setPadding(new Insets(10, 10, 10, 10));
        sidebar.setId("sidebar");
        sidebar.getStylesheets().add("resources/CSS/sidebar.css");
        sidebar.getChildren().addAll(
                button_home, button_checkin, button_checkout, button_newreservation,
                button_reservations, button_preferences, button_quit
        );

        return sidebar;
    }
}