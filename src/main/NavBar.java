/**
 * PROJECT ALPHA
 * Open source hotel management software
 *
 * @version     1.0 Alpha 1
 * @author      Rick Nieborg, Mark Nieborg, Robert Monden
 * @copyright   Project Alpha, 2016
 * @license     MIT
 *
 * Class information:
 * @package     Main
 * @since       1.0 Alpha 1
 * @author      Project Alpha development team
 */

package main;

import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;

public class NavBar {

	public NavBar() {

	}

	public MenuBar getMenu() {

		// [FILE]
		Menu file = new Menu("_File");

		MenuItem file_preferences = new MenuItem("Preferences...");
		MenuItem file_exit = new MenuItem("Exit");

		file_exit.setOnAction(e -> System.exit(1));

		file.getItems().addAll(file_preferences, file_exit);

		// [FRONT OFFICE]
		Menu frontoffice = new Menu("Front _office");

		MenuItem frontoffice_checkin = new MenuItem("Check-in");
		MenuItem frontoffice_checkout = new MenuItem("Check-out");
		MenuItem frontoffice_occupied_rooms = new MenuItem("Occupied rooms");
		MenuItem frontoffice_view_room = new MenuItem("View room...");

		frontoffice.getItems().addAll(frontoffice_checkin, frontoffice_checkout, frontoffice_occupied_rooms, frontoffice_view_room);

		// [RESERVATIONS]
		Menu reservations = new Menu("_Reservations");

		MenuItem reservations_view = new MenuItem("View reservations");
		MenuItem reservations_create = new MenuItem("New reservation");
		MenuItem reservations_modify = new MenuItem("Modify reservation");

		reservations.getItems().addAll(reservations_view, reservations_create, reservations_modify);

		// [MANAGE HOTEL]
		Menu manage = new Menu("_Manage hotel");

		// [HELP]
		Menu help = new Menu("_Help");

		MenuItem help_about = new MenuItem("About");
		MenuItem help_docs = new MenuItem("Documentation");

		help.getItems().addAll(help_about, help_docs);


		MenuBar menuBar = new MenuBar();
		menuBar.getMenus().addAll(file, frontoffice, reservations, manage, help);

		return menuBar;
	}
}