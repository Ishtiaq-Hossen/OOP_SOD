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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


//Inheritance  => 

//parent class 
//child class 


/**
 *
 * @author Ishti
 */
public class FXMLDocumentController implements Initializable {
    ArrayList<String>ab;
    Student s;
    Faculty f;
       
    
    @FXML
    private AnchorPane personInfoTextFieldFxId;
    @FXML
    private TextArea personInfoTextArea;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
       s=new Student("DS",3.5f,"Shuvo RH","01-09-2000");
       f=new Faculty(35000f,"Adjunct Faculty","ABC","02-01-1990");
       
       personInfoTextArea.setText(s.toString()+"\n");
       personInfoTextArea.appendText(f.toString());
       
        
       
    }    
    
}
