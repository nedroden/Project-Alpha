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
package user;

public class User {

    private String _username;
    private int _rank;

    public User(String username, int rank) {
        this._username = username;
        this._rank = rank;
    }

    public String getUsername() {
        return this._username;
    }

    public int getRank() {
        return this._rank;
    }
}