/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXML2.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

/**
 *
 * @author Ishti
 */
public class FXMLDocumentController implements Initializable {
    
    @FXML private Label label;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    public void sceneSwitch(ActionEvent event,String a)
    {
        
        try{
            
          Parent scene2Parent = FXMLLoader.load(getClass().getResource(a+".fxml"));//here switching scene fxml should be attached
          Scene scene2 = new Scene(scene2Parent);
          Stage stg2 = (Stage)((Node)event.getSource()).getScene().getWindow();  
          stg2.setTitle("File Chooser Test Stage");
          stg2.setScene(scene2);
          stg2.show();
        }
        catch(IOException ex){
            System.out.println(ex.toString());
        }
    }
     public void stageSwitch(ActionEvent event,String a)
    {
        
        try{
            
          Parent fileChooserViewParent = FXMLLoader.load(getClass().getResource(a+".fxml"));//here switching stage fxml should be attached
          Scene fileChooserViewScene = new Scene(fileChooserViewParent);
          Stage newWindow  = new Stage();
          newWindow.setTitle("File Chooser Test Stage");
          newWindow.setScene(fileChooserViewScene);
          newWindow.show();
        }
        catch(IOException ex){
            System.out.println(ex.toString());
        }
    }
     
     
    @FXML
    private void sceneSwitchButtonOnClick(ActionEvent event){
        sceneSwitch(event,"scene01");        
    }

    @FXML
    private void stageSwitchButtonOnClick(ActionEvent event) {

        stageSwitch(event,"stage01");
        
    }
    
}
