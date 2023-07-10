/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 *
 * @author Ishti
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private TextField employeeIdFxid;
    @FXML
    private TextField emloyeeSalaryFxId;
    @FXML
    private TextField employeeNameFxid;
    @FXML
    private ComboBox<String> designationFxid;
    @FXML
    private TextArea showEmployeeTextAreaFxId;
    @FXML
    private RadioButton maleIfxId;
    @FXML
    private RadioButton femlaeFxid;
    
    
    //model class will help controller class
    //controller class will help to run fxml
    ArrayList<Employee>employeeList;
    // Integer Float Double 
    Employee m;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        employeeList=new ArrayList();
        ToggleGroup group = new ToggleGroup();
        maleIfxId.setToggleGroup(group);
        femlaeFxid.setToggleGroup(group);
        designationFxid.getItems().addAll("Accountant","Manager");
        
    }    

    @FXML
    private void addEmployeeButtonOnClick(ActionEvent event) {
        showEmployeeTextAreaFxId.setText("");
        m=new Employee(Integer.parseInt(employeeIdFxid.getText()),
              employeeNameFxid.getText(),designationFxid.getValue().toString(),
              maleIfxId.isSelected() ? "Male" : "Female",
              Float.parseFloat(emloyeeSalaryFxId.getText())                        
        
        );
        employeeList.add(m);
        
        for( int i=0;i<employeeList.size();i++)
        {
            
            showEmployeeTextAreaFxId.appendText(employeeList.get(i).toString());
            
        }
        
        
    }
    
}
