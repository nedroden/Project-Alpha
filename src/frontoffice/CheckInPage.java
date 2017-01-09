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

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;

import reservations.Client;
import reservations.Reservation;
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
        TableColumn column_out = new TableColumn("Date out");
        TableColumn column_adults = new TableColumn("Adults");
        TableColumn column_children = new TableColumn("Children");
        TableColumn column_babies = new TableColumn("Babies");
        TableColumn column_comments = new TableColumn("Observations");

        DateFormat format = new SimpleDateFormat("dd-MM-yy");
        Date date = new Date();
        try {
            handler.getReservations(format.format(date));
        }
        catch (SQLException e) {
            System.out.print("Could not load reservations.");
            e.printStackTrace();
            System.exit(1);
        }

        ObservableList<Reservation> reservations = FXCollections.observableArrayList();

        table.setPlaceholder(new Text("No pending check-ins."));
        table.getColumns().addAll(column_id, column_fname, column_lname, column_in, column_out, column_adults, column_children, column_babies, column_comments);

        pane.getChildren().addAll(table);

        return pane;
    }
}