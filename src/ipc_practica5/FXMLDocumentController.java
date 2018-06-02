/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc_practica5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.CheckMenuItem;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author guill
 */
public class FXMLDocumentController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    private MenuBar myMenuBar;

    @FXML
    private MenuItem salir;

    @FXML
    private MenuItem amazonItem;

    @FXML
    private MenuItem bloggerItem;

    @FXML
    private MenuItem ebayItem;

    @FXML
    private MenuItem facebookItem;

    @FXML
    private MenuItem googleItem;

    @FXML
    private CheckMenuItem amazonCheck;

    @FXML
    private CheckMenuItem ebayCheck;

    @FXML
    private Button amazon;

    @FXML
    private Button blogger;

    @FXML
    private Button ebay;

    @FXML
    private Button facebook;

    @FXML
    private Button googleplus;

    @FXML
    void buttonAction(ActionEvent event) {

        String id = ((Node) event.getSource()).getId();

        switch (id) {
            case "amazon":
                System.out.println("ousehgo");
                break;

            case "blogger":
                break;

            case "ebay":
                break;

            case "facebook":
                break;

            case "googleplus":
                break;

            default:
                System.out.println("default");
        }

    }

    @FXML
    void salir(ActionEvent event) {
        Stage stage = (Stage) myMenuBar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void menuLanzar(ActionEvent event) {
        System.out.println("lanzar");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
        
    }

}
