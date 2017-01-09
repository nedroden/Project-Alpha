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
import java.util.HashMap;

import user.Login;

public class GUI extends Application {

    private Stage mainWindow;
    private Scene mainScene;
    private BorderPane mainLayout;

    private NavBar _navBar;
    private MenuBar _menuBar;
    private Sidebar _sidebar;
    private VBox _sidebarBox;

    private HashMap<String, BorderPane> _sectionsBP;
    private HashMap<String, VBox> _sectionsVB;

    public GUI() {
        _navBar = new NavBar(this);
        _menuBar = _navBar.getMenu();

        _sidebar = new Sidebar(this);
        _sidebarBox = _sidebar.getSidebar();

        _sectionsBP = new HashMap<>();
        _sectionsVB = new HashMap<>();
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

        setCenter("WelcomePage", WelcomePage.getContent());

        mainScene = new Scene(mainLayout, 400, 250);

        mainScene.getStylesheets().add("resources/CSS/main.css");
        mainWindow.setScene(mainScene);
        mainWindow.setMaximized(true);
        mainWindow.setTitle(Configuration.config.getProperty("window_title"));
        mainWindow.show();
    }

    public BorderPane getLayout() {
        return this.mainLayout;
    }

    public void setCenter(String className, BorderPane pane) {
        if (_sectionsBP.containsKey(className)) {
            BorderPane tempObject = _sectionsBP.get(className);
            mainLayout.setCenter(tempObject);
        }
        else {
            _sectionsBP.put(className, pane);
            mainLayout.setCenter(pane);
        }
    }

    public void setCenter(String className, VBox pane) {
        if (_sectionsVB.containsKey(className)) {
            VBox tempObject = _sectionsVB.get(className);
            mainLayout.setCenter(tempObject);
        }
        else {
            _sectionsVB.put(className, pane);
            mainLayout.setCenter(pane);
        }
    }
}