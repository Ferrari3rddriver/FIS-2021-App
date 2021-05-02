package org.example;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * JavaFX App
 */

public class App extends Application
{

    private static Scene scene;

    @Override
    public void start(Stage stage) throws IOException
    {


        scene = new Scene(loadFXML("LogIn"), Double.MAX_VALUE, Double.MAX_VALUE);
        stage.setTitle("Online School Application 2021");
        stage.setScene(scene);

        Image img = new Image(new FileInputStream("C:\\Users\\jurca\\Desktop\\College\\AN II sem II\\FIS\\Labs\\N2\\src\\main\\resources\\org\\9.png"));
        stage.getIcons().add(img);

        stage.setHeight(835);
        stage.setWidth(1550);

        stage.centerOnScreen();

        stage.setResizable(false);
        stage.setMaximized(false);

        stage.show();

        stage.setMaximized(false);
        stage.setResizable(false);

    }

    static void setRoot(String fxml) throws IOException
    {
        scene.setRoot(loadFXML(fxml));
    }

    private static Parent loadFXML(String fxml) throws IOException
    {
        FXMLLoader fxmlLoader = new FXMLLoader(App.class.getResource(fxml + ".fxml"));
        return fxmlLoader.load();
    }

    public static void main(String[] args)
    {
        launch();
    }

}