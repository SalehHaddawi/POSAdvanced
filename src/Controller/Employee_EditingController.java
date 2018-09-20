package Controller;

import Model.Employee_Editing_TableView;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
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
    ObservableList<Employee_Editing_TableView> observableListFor_employeeEditingTableView = FXCollections.observableArrayList();
    @FXML
    private TableView<Employee_Editing_TableView> employeeEditingTableView;
    @FXML
    private TableColumn<Employee_Editing_TableView, String> nameTableColumn;
    @FXML
    private TableColumn<Employee_Editing_TableView, Integer> employeeIDTableColumn;
    @FXML
    private TableColumn<Employee_Editing_TableView, String> usernameTableColumn;
    @FXML
    private TableColumn<Employee_Editing_TableView, Integer> ageTableColumn;
    @FXML
    private TableColumn<Employee_Editing_TableView, String> accessToAdminOrEmployeeTableColumn;
    @FXML
    private TableColumn<Employee_Editing_TableView, String> emailTableColumn;
    
    Employee_Editing_TableView selected_Item;
    @FXML
    private TextField nameTextField;
    @FXML
    private PasswordField passwordPasswordField;
    @FXML
    private TextField emailTextField;
    @FXML
    private ToggleButton employeeToggleButton;
    @FXML
    private ToggleGroup type;
    @FXML
    private ToggleButton adminToggleButton;
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
        this.employeeEditingTableView.setItems(observableListFor_employeeEditingTableView);
        
        this.nameTableColumn.setCellValueFactory(new PropertyValueFactory<Employee_Editing_TableView, String>("name"));
        this.employeeIDTableColumn.setCellValueFactory(new PropertyValueFactory<Employee_Editing_TableView, Integer>("employeeID"));
        this.usernameTableColumn.setCellValueFactory(new PropertyValueFactory<Employee_Editing_TableView, String>("username"));
        this.ageTableColumn.setCellValueFactory(new PropertyValueFactory<Employee_Editing_TableView, Integer>("age"));
        this.emailTableColumn.setCellValueFactory(new PropertyValueFactory<Employee_Editing_TableView, String>("email"));
        this.accessToAdminOrEmployeeTableColumn.setCellValueFactory(new PropertyValueFactory<Employee_Editing_TableView, String>("accessToAdminOrEmployee"));
        
        this.employeeEditingTableView.getSelectionModel().selectedItemProperty().addListener(c -> {

            selected_Item = employeeEditingTableView.getSelectionModel().getSelectedItem();

        });
    }    

    @FXML
    private void backButtonAction(ActionEvent event) {
    }

    @FXML
    private void deleteButtonAction(ActionEvent event) {
    }

    @FXML
    private void showDataButtonAction(ActionEvent event) {
    }

    @FXML
    private void addButtonAction(ActionEvent event) {
    }

    @FXML
    private void editButtonAtion(ActionEvent event) {
    }
    
}
