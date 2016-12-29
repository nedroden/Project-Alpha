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
package main;

import user.User;

public class ProjectAlpha {

    public static User user;

    public ProjectAlpha() {

    }

    public void init() {
        Configuration config = new Configuration();
        config.load();
        Database db = new Database();
        db.connect();
    }

    public static void setUser(User user) {
        ProjectAlpha.user = user;
    }
}