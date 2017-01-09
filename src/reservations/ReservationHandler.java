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
 * @package     Reservations
 * @since       1.0 Alpha 1
 * @author      Project Alpha development team
 */
package reservations;

import java.sql.*;
import java.util.ArrayList;

import main.Database;

public class ReservationHandler {

    private ArrayList<Reservation> _reservations;

    public ReservationHandler() {

    }

    public ArrayList getReservations(String dateIn) throws SQLException {
        // !!! NOTE: DATES SHOULD BE CONVERTED TO SQL FORMAT
        String query = "SELECT ID, client, date_in, date_out, room, comments, status FROM pa_reservations WHERE date_in = '" + dateIn + "'";
        Statement statement = null;

        try {
            statement = Database.connection.createStatement();
            ResultSet result = statement.executeQuery(query);
            while (result.next()) {
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
        }
        finally {
            if (statement != null) statement.close();
        }
        return null;
    }
}