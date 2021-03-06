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

    public ReservationHandler() {

    }

    public ArrayList getReservations(String dateIn) throws SQLException {
        ArrayList<Reservation> _reservations = new ArrayList();
        // !!! NOTE: DATES SHOULD BE CONVERTED TO SQL FORMAT
        String query = "SELECT ID, client, date_in, date_out, adults, children, babies, room, comments, status FROM pa_reservations;";
        Statement statement = null;

        try {
            statement = Database.connection.createStatement();
            ResultSet result = statement.executeQuery(query);

            while (result.next()) {
                Client client = new Client(1, "John", "Doe");
                Reservation reservation = new Reservation(result.getInt("ID"), client, result.getString("date_in"), result.getString("date_out"));

                reservation.setAdults(result.getInt("adults"));
                reservation.setChildren(result.getInt("children"));
                reservation.setBabies(result.getInt("babies"));
                reservation.setComments(result.getString("comments"));

                _reservations.add(reservation);
            }
        }
        catch (SQLException e) {
            e.printStackTrace();
            System.exit(0);
        }
        finally {
            statement.close();
        }

        return _reservations;
    }
}