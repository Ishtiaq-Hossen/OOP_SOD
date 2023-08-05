/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;

/**
 * FXML Controller class
 *
 * @author IT BD
 */
public class MenuBarController implements Initializable {

    @FXML
    private BorderPane studentRegistration;
    @FXML
    private MenuItem courseRegistration;
    @FXML
    private MenuItem offerCourses;
    @FXML
    private MenuItem prerequisiteCourses;
    @FXML
    private MenuItem AddNewFaculty;

    /**
     * Initializes the controller class.
     */
    public void load(String a) throws IOException
    {
        Parent parent=FXMLLoader.load(getClass().getResource(a+".fxml"));
        studentRegistration.setCenter(parent);
    }
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void RegistrationOnAction(ActionEvent event) throws IOException {
        load("RegistrationCourse");
        
    }
    
    @FXML
    private void OffercourcesOnAction(ActionEvent event) throws IOException {
        load("OfferCourses");
    }

    @FXML
    private void PrerequisiteOnAction(ActionEvent event) {
        try{ load("PrerequisiteCourses1"); }
        catch(IOException e){
            /*
            Alert a=new Alert(AlertType.ERROR);
            a.setContentText("Eroor ");
            a.wait();
            */
        }
        
    }

    @FXML
    private void AddNewFacultyOnAction(ActionEvent event) throws IOException {
        load("AddNewFaculty");
    }
    
}
