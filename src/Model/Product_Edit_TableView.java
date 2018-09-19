/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javafx.beans.property.DoubleProperty;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

/**
 *
 * @author abdlmjeed
 */
public class Product_Edit_TableView {
    
    

    private final IntegerProperty barCode = new SimpleIntegerProperty();

    public int getBarCode() {
        return barCode.get();
    }

    public void setBarCode(int value) {
        barCode.set(value);
    }

    public IntegerProperty barCodeProperty() {
        return barCode;
    }
    private final StringProperty productName = new SimpleStringProperty();

    public String getProductName() {
        return productName.get();
    }

    public void setProductName(String value) {
        productName.set(value);
    }

    public StringProperty productNameProperty() {
        return productName;
    }
    private final StringProperty generalType = new SimpleStringProperty();

    public String getGeneralType() {
        return generalType.get();
    }

    public void setGeneralType(String value) {
        generalType.set(value);
    }

    public StringProperty generalTypeProperty() {
        return generalType;
    }
    private final StringProperty specialType = new SimpleStringProperty();

    public String getSpecialType() {
        return specialType.get();
    }

    public void setSpecialType(String value) {
        specialType.set(value);
    }

    public StringProperty specialTypeProperty() {
        return specialType;
    }
    private final StringProperty weightType = new SimpleStringProperty();

    public String getWeightType() {
        return weightType.get();
    }

    public void setWeightType(String value) {
        weightType.set(value);
    }

    public StringProperty weightTypeProperty() {
        return weightType;
    }
    private final DoubleProperty weightPerItem = new SimpleDoubleProperty();

    public double getWeightPerItem() {
        return weightPerItem.get();
    }

    public void setWeightPerItem(double value) {
        weightPerItem.set(value);
    }

    public DoubleProperty weightPerItemProperty() {
        return weightPerItem;
    }
    private final IntegerProperty totalNumberOfItems = new SimpleIntegerProperty();

    public int getTotalNumberOfItems() {
        return totalNumberOfItems.get();
    }

    public void setTotalNumberOfItems(int value) {
        totalNumberOfItems.set(value);
    }

    public IntegerProperty totalNumberOfItemsProperty() {
        return totalNumberOfItems;
    }
    private final DoubleProperty pricePerItem = new SimpleDoubleProperty();

    public double getPricePerItem() {
        return pricePerItem.get();
    }

    public void setPricePerItem(double value) {
        pricePerItem.set(value);
    }

    public DoubleProperty pricePerItemProperty() {
        return pricePerItem;
    }
    private final StringProperty dateOfEntering = new SimpleStringProperty();

    public String getDateOfEntering() {
        return dateOfEntering.get();
    }

    public void setDateOfEntering(String value) {
        dateOfEntering.set(value);
    }

    public StringProperty dateOfEnteringProperty() {
        return dateOfEntering;
    }

    
    
    
    
    
}
