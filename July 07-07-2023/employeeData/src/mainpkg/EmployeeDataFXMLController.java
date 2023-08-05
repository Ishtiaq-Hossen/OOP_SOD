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
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

/**
 * FXML Controller class
 *
 * @author Ishti
 */
public class EmployeeDataFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    Employee m;
    @FXML
    private TextField employeeIDFxid;
    @FXML
    private TextField employeeSalaryFxid;
    @FXML
    private TextField employeeNameFxId;
    @FXML
    private RadioButton maleRadioButtonFxid;
    @FXML
    private RadioButton femaleRadioButtonFxid;
    @FXML
    private ComboBox<String> designationFxid;   //wrapper class Integer Float Double Boolean
    @FXML
    private TextArea showEmployeeTextAreaFxid;
    ArrayList<Employee>empList;
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        empList=new ArrayList();
        ToggleGroup group =new ToggleGroup();
        maleRadioButtonFxid.setToggleGroup(group);
        femaleRadioButtonFxid.setToggleGroup(group);
        designationFxid.getItems().addAll("Accountant","Finance");
        
    }    

    @FXML
    private void addEmployeeButtonOnCLick(ActionEvent event) {
        showEmployeeTextAreaFxid.setText("");
        
        m=new Employee(Integer.parseInt(employeeIDFxid.getText()),
        employeeNameFxId.getText(),designationFxid.getValue().toString(),
            maleRadioButtonFxid.isSelected() ? "Male" : "Female",
            Float.parseFloat( employeeSalaryFxid.getText())
           
        );
        empList.add(m);
        showEmployeeTextAreaFxid.appendText(m.toString());
        /*
        for(int i=0;i<empList.size();i++)
        {
            showEmployeeTextAreaFxid.appendText(empList.get(i).toString());
        }
        */
        
    }
    
}
