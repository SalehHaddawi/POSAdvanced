/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author abdlmjeed
 */
public class Product_EditController implements Initializable {

    @FXML
    private ImageView workerPhoto;
    @FXML
    private ToggleGroup type;
    @FXML
    private HBox add_product;
    @FXML
    private HBox edit_product;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void show_edit_atrribute(ActionEvent event) {
        add_product.setVisible(false);
        edit_product.setVisible(true);
    }

    @FXML
    private void show_add_atrribute(ActionEvent event) {
         add_product.setVisible(true);
        edit_product.setVisible(false);
    }
    
}
