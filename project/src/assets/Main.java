package assets;
import java.io.FileInputStream;
import java.io.InputStream;

import javafx.application.Application;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	 
	 private double x = 0;
	 private double y = 0;
	
     public void start(Stage stage) throws Exception {
 		
    	Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));
    	Scene scene  = new Scene(root);
    	root.setOnMousePressed((MouseEvent event) -> {
    		x = event.getSceneX();
    		y = event.getSceneY();
    	});
    	
    	root.setOnMouseDragged((MouseEvent event) -> {
    		stage.setX(event.getScreenX() - x);
    		stage.setY(event.getScreenY() - y);
    	});
    	
    	stage.initStyle(StageStyle.TRANSPARENT);
    	stage.setScene(scene);
    	stage.show();
     }
     
     public static void main(String[] args) {
    	 launch(args);
     }
}
