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
 * @package     Front Office
 * @since       1.0 Alpha 1
 * @author      Project Alpha development team
 */
package frontoffice;

import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import reservations.ReservationHandler;

public class CheckInPage {

    public CheckInPage() {

    }

    public static VBox getContent() {
        VBox pane = new VBox();

        ReservationHandler handler = new ReservationHandler();
        Text text = new Text("This is where you'll be able to handle remaining check-ins.");

        pane.getChildren().addAll(text);

        return pane;
    }
}