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

import javafx.application.Application;
import javafx.scene.control.MenuBar;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import user.Login;

public class GUI extends Application {

    private Stage mainWindow;
    private Scene mainScene;
    private BorderPane mainLayout;

    private NavBar _navBar;
    private MenuBar _menuBar;
    private Sidebar _sidebar;
    private VBox _sidebarBox;

    public GUI() {
        _navBar = new NavBar();
        _menuBar = _navBar.getMenu();

        _sidebar = new Sidebar();
        _sidebarBox = _sidebar.getSidebar();
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
        mainLayout = new BorderPane();

        mainLayout.setTop(_menuBar);
        mainLayout.setLeft(_sidebarBox);

        WelcomePage welcome = new WelcomePage();
        BorderPane welcomePage = welcome.getContent();
        mainLayout.setCenter(welcomePage);

        mainScene = new Scene(mainLayout, 400, 250);

        mainWindow.setScene(mainScene);
        mainWindow.setMaximized(true);
        mainWindow.setTitle(Configuration.config.getProperty("window_title"));
        mainWindow.show();
    }

    public BorderPane getLayout() {
        return this.mainLayout;
    }

    public void setScene(Scene scene) {
        mainWindow.setScene(scene);
    }
}