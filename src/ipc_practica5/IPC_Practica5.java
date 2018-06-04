/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ipc_practica5;

import java.util.Locale;
import java.util.ResourceBundle;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.stage.Stage;

/**
 *
 * @author guill
 */
public class IPC_Practica5 extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
        
        
        Locale locale = Locale.getDefault();
        ResourceBundle bundle = ResourceBundle.getBundle("ipc_practica5.strings", locale);
        
        Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"), bundle);
        
        Scene scene = new Scene(root);
        scene.setOnKeyPressed((KeyEvent ke) -> {
            if (ke.getCode() == KeyCode.ESCAPE) {
                stage.close();
            }
        });
        
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
