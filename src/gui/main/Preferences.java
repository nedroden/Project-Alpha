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
 * @package     Gui.Main
 * @since       1.0 Alpha 1
 * @author      Project Alpha development team
 */
package gui.main;

import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Preferences {

    public Preferences() {

    }

    public void displayScreen() {
        Stage window = new Stage();
        BorderPane layout = new BorderPane();

        TreeItem<String> pref_general = new TreeItem<>("Settings");
        TreeItem<String> pref_general_software = new TreeItem<>("Software settings");
        TreeItem<String> pref_general_hotel = new TreeItem<>("Hotel settings");

        pref_general.getChildren().addAll(pref_general_software, pref_general_hotel);
        pref_general.setExpanded(true);
        TreeView<String> categories = new TreeView(pref_general);

        layout.setLeft(categories);

        Scene scene = new Scene(layout, 700, 750);

        window.initModality(Modality.APPLICATION_MODAL);
        window.setResizable(false);
        window.setScene(scene);
        window.setTitle("PreferencesHandler");
        window.showAndWait();
    }
}