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
package user;

import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Login {

    private Stage _stage;
    private GridPane _layout;
    private Scene _scene;

    public void Login() {

    }

    public Stage getStage(Stage stage) {
        _stage = stage;
        _layout = new GridPane();
        _scene = new Scene(_layout, 500, 350);

        _stage.setScene(_scene);
        _stage.setTitle("Project Alpha | Employee login");
        return _stage;
    }
}