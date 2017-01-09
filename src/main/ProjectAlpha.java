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

import user.User;

public class ProjectAlpha {

    public static User user;

    private Database _db;
    private static String _version = "1.0 Alpha 1";
    private static String _copyright = "Project Alpha development team, 2016-2017";

    public ProjectAlpha() {

    }

    public void init() {
        Configuration config = new Configuration();
        config.load();
        _db = new Database();
        _db.connect();
    }

    public static void setUser(User user) {
        ProjectAlpha.user = user;
    }

    public static String getVersion() {
        return _version;
    }

    public static String getCopyright() {
        return _copyright;
    }
}