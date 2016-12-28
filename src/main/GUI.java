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

import javafx.application.Application;
import javafx.scene.layout.GridPane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import user.Login;

public class GUI extends Application {

    private Stage mainWindow;
    private Scene mainScene;
    private GridPane mainLayout;

    public GUI() {

    }

    public static void GUI(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage loginStage) throws Exception {
        Login loginScreen = new Login();
        loginStage = loginScreen.getStage(loginStage);
        loginStage.show();
    }

    public void showMainWindow() {
        mainWindow = new Stage();
        mainLayout = new GridPane();
        mainScene = new Scene(mainLayout, 400, 250);

        mainWindow.setScene(mainScene);
        mainWindow.setMaximized(true);
        mainWindow.setTitle(Configuration.config.getProperty("window_title"));
        mainWindow.show();
    }

    public void setScene(Scene scene) {
        mainWindow.setScene(scene);
    }
}