/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class abc implements Initializable {
    
    
    ArrayList<Product>pList;
    ArrayList<Product>cPList;

    @FXML
    private ComboBox<String> productListComboBox;
    @FXML
    private TextField addProductsTextField;
    @FXML
    private TextField productPrice;
    @FXML
    private TextField nameTextFieldFxid;
    @FXML
    private TextField phoneNoTextFieldFxId;
    @FXML
    private TextArea productPriceListTextFieldFxid;
    @FXML
    private TextArea displayTotalBillTextArea;
    @FXML
    private ComboBox<String> changeProductPriceComboBoxfxid;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       
        pList=new ArrayList();
        cPList=new ArrayList();
        // TODO
    }    

    @FXML
    private void addProductsButton(ActionEvent event) {
        
        pList.add(new Product(addProductsTextField.getText(),Double.parseDouble(productPrice.getText())));
        
        productListComboBox.getItems().add(addProductsTextField.getText());
        
    }

    @FXML
    private void printBillOnAction(ActionEvent event) {
    }

    @FXML
    private void customerProductAddOnAction(ActionEvent event) {
        float tempPrice=0f;
        Product p;
        for(int i=0;i<pList.size();i++){
            if(productListComboBox.getValue().equals(pList.get(i).productName))
            {
            
                p=new Product(pList.get(i).productName,pList.get(i).productPrice);
                cPList.add(p);
                tempPrice+=p.productPrice;
                productPriceListTextFieldFxid.setText(p.productName+": " + Float.toString(tempPrice));
            }
        }
        
        
        
        
    }
    
}
