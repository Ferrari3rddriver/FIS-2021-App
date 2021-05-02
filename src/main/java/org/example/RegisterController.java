package org.example;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class RegisterController implements Initializable
{
    @FXML
    private void switchToLogIn() throws IOException
    {
        App.setRoot("LogIn");
    }


    @FXML
    private ComboBox mycombobox;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
        mycombobox.getItems().add("Teacher");
        mycombobox.getItems().add("Student");

    }
}
