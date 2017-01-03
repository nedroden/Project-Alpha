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

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Configuration {

    public static Properties config;

    public Configuration() {
        config = new Properties();
    }

    public void load() {
        try {
            config.load(new FileInputStream("config.properties"));
        }
        catch (IOException e) {
            System.out.printf("Could not load configuration file. Detailed error message: %s", e.getMessage());
            System.exit(0);
        }
    }
}