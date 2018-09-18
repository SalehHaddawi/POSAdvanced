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
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author abdlmjeed
 */
public class Return_BackController implements Initializable {

    @FXML
    private ImageView workerPhoto;
    @FXML
    private ToggleGroup type;
    @FXML
    private HBox hBoxBehindeTheBarcode;
    @FXML
    private TextField QRCode;
    @FXML
    private GridPane numPad;
    @FXML
    private HBox hBoxBehindeTheBarcode1;
    @FXML
    private TextField QRCode1;
    @FXML
    private HBox hBoxBehindeTheBarcode11;
    @FXML
    private TextField QRCode11;
    @FXML
    private HBox change_table;
    @FXML
    private VBox return_table;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void changeBackgroundcolorback(MouseEvent event) {
    }

    @FXML
    private void changeBackgroundcolor(MouseEvent event) {
    }


    @FXML
    private void keyBoard(KeyEvent event) {
    }

    @FXML
    private void open_change_table(ActionEvent event) {
        
        change_table.setVisible(true);
        return_table.setVisible(false);
    }

    @FXML
    private void open_return_table(ActionEvent event) {
        
         change_table.setVisible(false);
        return_table.setVisible(true);
    }
    
}
