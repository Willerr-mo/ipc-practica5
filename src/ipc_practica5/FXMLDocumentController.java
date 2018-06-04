/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc_practica5;

import java.awt.BorderLayout;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ChoiceDialog;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Label;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.RadioMenuItem;
import javafx.scene.control.TextInputDialog;
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
    private RadioMenuItem amazonCheck;

    @FXML
    private RadioMenuItem ebayCheck;

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
    private Label label;

    @FXML
    void buttonAction(ActionEvent event) {

        String idButton = ((Node) event.getSource()).getId();
        switch (idButton) {
            case "amazon":
                check("Amazon");
                break;

            case "blogger":
                seleccionarBlogger();
                break;

            case "ebay":
                check("Ebay");
                break;

            case "facebook":
                mensaje("Facebook");
                break;

            case "googleplus":
                mensaje("Google+");
                break;

            default:
                System.out.println("error");
        }

    }

    @FXML
    void salir(ActionEvent event) {
        Stage stage = (Stage) myMenuBar.getScene().getWindow();
        stage.close();
    }

    @FXML
    void menuLanzar(ActionEvent event) {
        String idItem = ((MenuItem) event.getSource()).getId();
        switch (idItem) {
            case "amazonItem":
                check("Amazon");
                break;

            case "bloggerItem":
                seleccionarBlogger();
                break;

            case "ebayItem":
                check("Ebay");
                break;

            case "facebookItem":
                mensaje("Facebook");
                break;

            case "googleItem":
                mensaje("Google+");
                break;

            default:
                System.out.println("error: menuItem no reconozido...");
        }

    }

    public void check(String id) {

        switch (id) {
            case "Amazon":
                if (amazonCheck.isSelected()) {
                    compraRealizada(id);
                } else {
                    error(id);
                }
                break;
            case "Ebay":
                if (ebayCheck.isSelected()) {
                    compraRealizada(id);
                } else {
                    error(id);
                }
                break;
            default:
                error(id);
                break;
        }

    }

    public void compraRealizada(String id) {

        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Confirmación");
        alert.setHeaderText("Compra realizada correctamente");
        alert.setContentText("Has comprado en " + id);
        alert.showAndWait();
    }

    public void error(String id) {
        Alert alert = new Alert(AlertType.INFORMATION);
        alert.setTitle("Error en la selección");
        alert.setHeaderText("No puede comprar en " + id);
        alert.setContentText("Por favor, cambie la selección en el menú Opciones");
        alert.showAndWait();
    }

    public void seleccionarBlogger() {

        List<String> choices = new ArrayList<>();
        choices.add("El blog de Athos");
        choices.add("El blog de Porthos");
        choices.add("El blog de Aramis");
        ChoiceDialog<String> dialog = new ChoiceDialog<>("El blog de Athos", choices);
        dialog.setTitle("Selecciona un blog");
        dialog.setHeaderText("¿Qué blog quieres visitar?");
        dialog.setContentText("Elige:");
        Optional<String> result = dialog.showAndWait();

        if (result.isPresent()) {
            label.setText("Visitando " + result.get());
        }
    }

    public void mensaje(String id) {

        TextInputDialog dialog = new TextInputDialog("Pepe"); // Por defecto
        dialog.setTitle("Introduce tu nombre");
        dialog.setHeaderText("¿Con qué usuario quieres escribir en " + id + "?");
        dialog.setContentText("Introduce tu nombre:");
        Optional<String> result = dialog.showAndWait();
        if (result.isPresent()) {
            label.setText("Mensaje enviado como " + result.get());
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
    }

}
