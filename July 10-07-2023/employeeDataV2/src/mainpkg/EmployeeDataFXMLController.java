/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

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
    @FXML
    private TextField expectedDesigNation;
    @FXML
    private TextField showNumberOfEmployee;
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
        //showEmployeeTextAreaFxid.setText("");
         
       
        m=new Employee(Integer.parseInt(employeeIDFxid.getText()),
        employeeNameFxId.getText(),designationFxid.getValue().toString(),
            maleRadioButtonFxid.isSelected() ? "Male" : "Female",
            Float.parseFloat( employeeSalaryFxid.getText())
           
        );
        empList.add(m);
        designationFxid.setValue(null);
        showEmployeeTextAreaFxid.appendText(m.toString());
        /*
        for(int i=0;i<empList.size();i++)
        {
            showEmployeeTextAreaFxid.appendText(empList.get(i).toString());
        }
        */
        
    }

    @FXML
    private void searchOnAction(ActionEvent event) {
        int count=0;
        
        for(int i=0;i<empList.size();i++)
        {
            if(empList.get(i).getDesigNation().equals(expectedDesigNation.getText()))
            {
                count++;
            }
            
        }
        
        showNumberOfEmployee.setText(Integer.toString(count));
    }

    @FXML
    private void sceneSwitch(ActionEvent event) throws IOException {
        Parent scene2Parent = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene scene2 = new Scene(scene2Parent);
        
               
        Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
        
        
        stg2.setScene(scene2);
        stg2.show();

    }

    @FXML
    private void windowSwitch(ActionEvent event) throws IOException {
        Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource("window1.fxml"));
        Scene fileChooserViewScene = new Scene(fileChooserViewParent);
        //Stage window = (Stage)((Node)event.getSource()).getScene().getWindow();
        Stage newWindow  = new Stage();
        
        newWindow.setTitle("File Chooser Test Stage");
        newWindow.setScene(fileChooserViewScene);
        newWindow.show();
    }
    
}
