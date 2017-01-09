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

public class Reservation {

    private int _ID;
    private Client _client;
    private String _dateIn;
    private String _dateOut;

    public Reservation(int ID, Client client, String dateIn, String dateOut) {
        _ID = ID;
        _client = client;
        _dateIn = dateIn;
        _dateOut = dateOut;
    }

    public int getID() {
        return _ID;
    }

    public Client getClient() {
        return _client;
    }

    public String getDateIn() {
        return _dateIn;
    }

    public String getDateOut() {
        return _dateOut;
    }
}