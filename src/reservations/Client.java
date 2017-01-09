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

public class Client {

    private int _ID;
    private String _firstName;
    private String _lastName;
    private String _email;

    public Client() {

    }

    public int getID() {
        return _ID;
    }

    public String getFirstName() {
        return _firstName;
    }

    public String getLastName() {
        return _lastName;
    }

    public String getEmail() {
        return _email;
    }
}