package org.example;

import java.io.IOException;
import javafx.fxml.FXML;

public class LogInController
{

    @FXML
    private void switchToRegister() throws IOException
    {
        App.setRoot("Register");
    }

    @FXML
    private void switchToLogIn() throws IOException
    {
        App.setRoot("LogIn");
    }

}
