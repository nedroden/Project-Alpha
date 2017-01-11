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

import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Preferences {

    public Preferences() {

    }

    public static void displayScreen() {
        Stage window = new Stage();
        BorderPane layout = new BorderPane();

        Text text = new Text("Test");
        layout.setCenter(text);

        Scene scene = new Scene(layout, 500, 550);

        window.initModality(Modality.APPLICATION_MODAL);
        window.setResizable(false);
        window.setScene(scene);
        window.setTitle("Preferences");
        window.showAndWait();
    }
}