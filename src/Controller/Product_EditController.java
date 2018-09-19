/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.Product_Edit_TableView;
import java.net.URL;
import java.time.format.DateTimeFormatter;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
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
    private HBox add_product;
    @FXML
    private HBox edit_product;

    ObservableList<Product_Edit_TableView> observableListFor_productTableView = FXCollections.observableArrayList();

    @FXML
    private TableView<Product_Edit_TableView> productTableView;
    @FXML
    private TableColumn<Product_Edit_TableView, String> dateOfEntering;
    @FXML
    private TableColumn<Product_Edit_TableView, Double> pricePerItem;
    @FXML
    private TableColumn<Product_Edit_TableView, Integer> totalNumberOfItems;
    @FXML
    private TableColumn<Product_Edit_TableView, Double> weightPerItem;
    @FXML
    private TableColumn<Product_Edit_TableView, String> weightType;
    @FXML
    private TableColumn<Product_Edit_TableView, String> specialtype;
    @FXML
    private TableColumn<Product_Edit_TableView, String> generalType;
    @FXML
    private TableColumn<Product_Edit_TableView, String> nameOfProduct;
    @FXML
    private TableColumn<Product_Edit_TableView, Integer> barCode;

    Product_Edit_TableView selected_Item;
    @FXML
    private TextField ui_productName_TextField;
    @FXML
    private ComboBox<String> ui_specialType_Combobx;
    @FXML
    private TextField ui_weightPerItem_TextField;
    @FXML
    private TextField ui_pricePerItem_TextField;
    @FXML
    private TextField ui_BarCode_TextField;
    @FXML
    private ComboBox<String> ui_generalType_Combobx;
    @FXML
    private ComboBox<String> ui_weightType_Combobx;
    @FXML
    private TextField ui_totalNumberOfItems_TextField;
    @FXML
    private DatePicker ui_EnteringDate_TextField;
    @FXML
    private ToggleButton ui_Edit_toggleButton;
    @FXML
    private ToggleButton ui_Add_toggleButton;
    @FXML
    private ToggleGroup theoperaton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
<<<<<<< HEAD

        //adding values to general type
        ui_generalType_Combobx.getItems().addAll("عطور", "دهن عود");
        
          //adding values to special type
        ui_specialType_Combobx.getItems().addAll("بورمي", "كمبودي");
        
        //adding values to special type
        ui_weightType_Combobx.getItems().addAll("قرام", "مل");

        //linking ovserableList with table View
        this.productTableView.setItems(observableListFor_productTableView);

        //linking object(Product_Edit_TableView) values with tableView       
        this.barCode.setCellValueFactory(new PropertyValueFactory<Product_Edit_TableView, Integer>("barCode"));

        this.nameOfProduct.setCellValueFactory(new PropertyValueFactory<Product_Edit_TableView, String>("productName"));

        this.generalType.setCellValueFactory(new PropertyValueFactory<Product_Edit_TableView, String>("generalType"));

        this.specialtype.setCellValueFactory(new PropertyValueFactory<Product_Edit_TableView, String>("specialType"));

        this.weightType.setCellValueFactory(new PropertyValueFactory<Product_Edit_TableView, String>("weightType"));

        this.weightPerItem.setCellValueFactory(new PropertyValueFactory<Product_Edit_TableView, Double>("weightPerItem"));

        this.totalNumberOfItems.setCellValueFactory(new PropertyValueFactory<Product_Edit_TableView, Integer>("totalNumberOfItems"));

        this.pricePerItem.setCellValueFactory(new PropertyValueFactory<Product_Edit_TableView, Double>("pricePerItem"));

        this.dateOfEntering.setCellValueFactory(new PropertyValueFactory<Product_Edit_TableView, String>("dateOfEntering"));

        //this for getting item object from table view when selected 
        this.productTableView.getSelectionModel().selectedItemProperty().addListener(c -> {

            selected_Item = productTableView.getSelectionModel().getSelectedItem();

        });

    }
=======
        // TODO i'm ghamdi
        
    }    
>>>>>>> 0a270ab77179b266eda033ff5e34afe33a9b162c

    @FXML
    private void show_edit_atrribute(ActionEvent event) {
        //this to show the valid fields for editing an item( some of them valid)
        add_product.setVisible(false);
        edit_product.setVisible(true);
    }

    @FXML
    private void show_add_atrribute(ActionEvent event) {
        //this to show the valid fields for inserting new item( all of them valid)
        add_product.setVisible(true);
        edit_product.setVisible(false);
    }

    @FXML
    private void addToTable(ActionEvent event) {

        if (ui_Add_toggleButton.isSelected()) {
            Product_Edit_TableView newItem = new Product_Edit_TableView();

            newItem.setBarCode(Integer.parseInt(ui_BarCode_TextField.getText()));
            newItem.setProductName(ui_productName_TextField.getText());
            newItem.setGeneralType(ui_generalType_Combobx.getSelectionModel().getSelectedItem().toString());
            newItem.setSpecialType(ui_specialType_Combobx.getSelectionModel().getSelectedItem().toString());
            newItem.setWeightType(ui_weightType_Combobx.getSelectionModel().getSelectedItem().toString());
            newItem.setWeightPerItem(Double.parseDouble(ui_weightPerItem_TextField.getText()));
            newItem.setTotalNumberOfItems(Integer.parseInt(ui_totalNumberOfItems_TextField.getText()));
            newItem.setPricePerItem(Double.parseDouble(ui_pricePerItem_TextField.getText()));
            newItem.setDateOfEntering(ui_EnteringDate_TextField.getValue().format(DateTimeFormatter.ISO_DATE));

            observableListFor_productTableView.add(newItem);
            return;
        }

    }

    @FXML
    private void addToTable(MouseEvent event) {
    }

   

}
