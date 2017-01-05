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

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;

public class WelcomePage {

    public WelcomePage() {

    }

    public static BorderPane getContent() {
        BorderPane pane = new BorderPane();

        Image logo = new Image("resources/images/logo.png");
        ImageView logoView = new ImageView(logo);

        pane.setCenter(logoView);

        return pane;
    }
}