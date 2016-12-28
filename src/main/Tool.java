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
 * @package     Login
 * @since       1.0 Alpha 1
 * @author      Project Alpha development team
 */
package main;

import javax.xml.bind.annotation.adapters.HexBinaryAdapter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Tool {

    public static String hash(String text) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            md.update(text.getBytes());

            byte[] hashBytes = md.digest();

            String hashedText = (new HexBinaryAdapter().marshal(hashBytes));
            return hashedText.toLowerCase();
        }
        catch (NoSuchAlgorithmException e) {
            System.out.println("Algorithm not found.");
        }
        return null;
    }
}