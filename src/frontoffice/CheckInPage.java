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

import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;

import reservations.ReservationHandler;

public class CheckInPage {

    public CheckInPage() {

    }

    public static VBox getContent() {
        VBox pane = new VBox();

        TableView table = new TableView();
        ReservationHandler handler = new ReservationHandler();

        TableColumn column_id = new TableColumn("ID");
        TableColumn column_fname = new TableColumn("First name");
        TableColumn column_lname = new TableColumn("Last name");
        TableColumn column_in = new TableColumn("Date in");

        table.getColumns().addAll(column_id, column_fname, column_lname, column_in);

        pane.getChildren().addAll(table);

        return pane;
    }
}