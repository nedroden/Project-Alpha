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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
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
        _stage.setResizable(false);

        _layout = new GridPane();
        _layout.setVgap(10);
        _layout.setHgap(10);

        // Labels should go below this line
        Label labelUsername = new Label("Username:");
        GridPane.setConstraints(labelUsername, 3, 3);

        Label labelPassword = new Label("Password:");
        GridPane.setConstraints(labelPassword, 3, 4);

        // Input fields should go below this line
        TextField fieldUsername = new TextField();
        GridPane.setConstraints(fieldUsername, 4, 3);
        fieldUsername.setPromptText("Username");

        PasswordField fieldPassword = new PasswordField();
        GridPane.setConstraints(fieldPassword, 4, 4);

        Button submitButton = new Button("Log in");
        GridPane.setConstraints(submitButton, 4, 5);

        _layout.getChildren().addAll(labelUsername, labelPassword, fieldUsername, fieldPassword, submitButton);

        _scene = new Scene(_layout, 300, 150);
        _stage.setScene(_scene);
        _stage.setTitle("Employee login");
        return _stage;
    }
}