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
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class MidSample01Controller implements Initializable {

    @FXML
    private TextField empIdTestField;
    @FXML
    private TextField empNameTextField;
    @FXML
    private TextField SalaryTextField;
    @FXML
    private RadioButton maleRadioButton;
    @FXML
    private RadioButton FemaleRadioButton;
    @FXML
    private ComboBox<String> desigNationCOmboBOx;
    @FXML
    private ComboBox<String> deptCombobox;
    @FXML
    private DatePicker dobDatePickerFxid;
    @FXML
    private DatePicker dojDatePickerFxid;
    @FXML
    private TextArea showEmployeeTextArea;
    @FXML
    private ComboBox<String> selectDeptComboBox;
    @FXML
    private TextField lowerSalaryBound;
    @FXML
    private TextField upperSalaryBound;
    @FXML
    private Label showAverageSalaryLabelFxid;
    @FXML
    private Label countLabel;
    ArrayList<Employee>empList;
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        empList=new ArrayList();
        ToggleGroup toggles=new ToggleGroup();
        maleRadioButton.setToggleGroup(toggles);
        FemaleRadioButton.setToggleGroup(toggles);      
        deptCombobox.getItems().addAll("Accounts","HR","Admin","Sales","Production");
        desigNationCOmboBOx.getItems().addAll("Executive","Junior Officer","Senior Officer","Accountant","HR Manager","Director","Engineer");
        selectDeptComboBox.getItems().addAll("Accounts","HR","Admin","Sales","Production");
                
    }    

    @FXML
    private void addEmployeeButtonOnCLick(ActionEvent event) {
        /*
        Employee a =new Employee(Integer.parseInt(empIdTestField.getText()),empNameTextField.getText(),
        maleRadioButton.isSelected()?"Male":"Female",deptCombobox.getValue().toString(),
        desigNationCOmboBOx.getValue().toString(),Float.parseFloat(SalaryTextField.getText()),
        dobDatePickerFxid.getValue(),dojDatePickerFxid.getValue()       
        );*/
      
        Alert a1 = new Alert(Alert.AlertType.WARNING);
        a1.setTitle("Warning Alert");
        a1.setContentText("This is a simple warning message!");
        a1.setHeaderText(null);
        a1.showAndWait(); 
        
    }

    @FXML
    private void showAverageSalaryButtonOnClick(ActionEvent event) {
    }
    
}
