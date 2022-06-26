package view;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;

public class MainWindow extends BorderPane {
    public static final int WINDOW_HEIGHT = 500;
    public static final int WINDOW_WIDTH = 800;
    private Button button1;
     
 
    public MainWindow() throws IOException{
        try {
          Parent root = FXMLLoader.load(getClass().getResource("D:/OOP/project/assets/MainWindow.fxml"));
          Scene sc = new Scene(root, 800, 500);
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
