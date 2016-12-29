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
package help;

import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import main.ProjectAlpha;

public class About {

    public About() {

    }

    public static void displayScreen() {
        Stage window = new Stage();
        HBox layout = new HBox();

        layout.getStylesheets().add("resources/CSS/about.css");

        Text text = new Text("Project Alpha " + ProjectAlpha.getVersion() + " | " + ProjectAlpha.getCopyright() + "\n" +
                "Icons by Fatcow (http://www.fatcow.com/free-icons)");
        layout.getChildren().addAll(text);

        Scene scene = new Scene(layout, 500, 550);
        window.initModality(Modality.APPLICATION_MODAL);
        window.setResizable(false);
        window.setScene(scene);
        window.setTitle("Software information");
        window.showAndWait();
    }
}