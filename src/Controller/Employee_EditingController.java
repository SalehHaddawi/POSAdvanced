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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;

/**
 * FXML Controller class
 *
 * @author mohamedalghamdi
 */
public class Employee_EditingController implements Initializable {

    @FXML
    private ImageView workerPhoto;
    @FXML
    private TableView<?> employeeEditingTableView;
    @FXML
    private TableColumn<?, ?> nameTableColumn;
    @FXML
    private TableColumn<?, ?> employeeIDTableColumn;
    @FXML
    private TableColumn<?, ?> usernameTableColumn;
    @FXML
    private TableColumn<?, ?> ageTableColumn;
    @FXML
    private TableColumn<?, ?> accessToAdminOrEmployeeTableColumn;
    @FXML
    private TableColumn<?, ?> emailTableColumn;
    @FXML
    private HBox add_product;
    @FXML
    private TextField nameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private TextField emailTextField;
    @FXML
    private TextField accessToAdminOrEmployeeTextField;
    @FXML
    private TextField employeeIDTextField;
    @FXML
    private TextField usernameTextField;
    @FXML
    private TextField ageTextField;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    

    @FXML
    private void backButtonAction(ActionEvent event) {
    }

    @FXML
    private void showDataButtonAction(ActionEvent event) {
    }

    @FXML
    private void editButtonAtion(ActionEvent event) {
    }

    @FXML
    private void deleteButtonAction(ActionEvent event) {
    }

    @FXML
    private void addButtonAction(ActionEvent event) {
    }
    
}
