/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

/**
 *
 * @author Ishti
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML
    private Label label;
    @FXML
    private ComboBox<String> selectUserFxId;
    
   
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        
        selectUserFxId.getItems().addAll("Student","Faculty");
    }    

    @FXML
    private void sceneSwitchingOnCLick(ActionEvent event) throws IOException {
        
        String a=selectUserFxId.getValue().toString();
        
        
        if(a=="Student"){
            Parent sceneA=FXMLLoader.load(getClass().getResource("studentFXML.fxml"));
            Scene sceneB=new Scene(sceneA);
            Stage stg=(Stage)((Node)event.getSource()).getScene().getWindow();
            stg.setTitle("Student Scene");
            stg.setScene(sceneB);
            stg.show();
        }
        else if(a=="Faculty"){
            Parent sceneA=FXMLLoader.load(getClass().getResource("facultyFXML.fxml"));
            Scene sceneB=new Scene(sceneA);
            Stage stg=(Stage)((Node)event.getSource()).getScene().getWindow();
            stg.setTitle("Faculty Scene");
            stg.setScene(sceneB);
            stg.show();
        }
        else if(a==""){

        }
        

    }
}
