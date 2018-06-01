/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc_practica5;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ContentDisplay;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;


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
    private Button amazon;

    @FXML
    private Button hola;

    @FXML
    private Button hola1;

    @FXML
    private Button hola2;

    @FXML
    private Button hola3;

    @FXML
    void buttonAction(ActionEvent event) {
        System.out.println("holaaaaaaaaaaa");
    }
    
     @FXML
    void menuAction(ActionEvent event) {
         System.out.println("menuaction");
    }
    
    @FXML
    void menuLanzar(ActionEvent event) {
        System.out.println("lanzar");
    }

    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        /** Image image = new Image(getClass().getResourceAsStream("amazonLogo.jpg"));
         ImageView imageView = new ImageView();
    
       imageView.setImage(image);
       amazon= new Button("oyoyoy", imageView);
       amazon.setContentDisplay(ContentDisplay.TOP);
        */
    }    

    
}


