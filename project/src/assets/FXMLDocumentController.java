package assets;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ResourceBundle;

import javafx.scene.Node;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class FXMLDocumentController implements Initializable{
	@FXML
    private Text hieudang;

    @FXML
    private ImageView img1;

    @FXML
    private Button login_btn;

    @FXML
    private PasswordField password;

    @FXML
    private Text resume;

    @FXML
    private Hyperlink signup_btn;

    @FXML
    private TextField username;
    
    private Stage stage;
    private Scene scene;
    private Parent root;
    
    public void switchToScene(ActionEvent event) throws IOException {
    	Parent root = FXMLLoader.load(getClass().getResource("CV.fxml"));
    	stage = (Stage)((Node)event.getSource()).getScene().getWindow();
    	scene = new Scene(root);
    	stage.setScene(scene);
    	stage.show();
    }
    
   
   
    
    public void exit() {
    	System.exit(0);
    }
    public void textfield(MouseEvent event) {
    	if(event.getSource() == username) {
    		username.setStyle("-fx-background-color:#fff;" + "-fx-border-width:2.5px;" + "-fx-border-color: #35E2F7");
    		password.setStyle("-fx-background-color:#eef3ff; "+ "-fx-border-width: 1px;" + "-fx-border-color: #35E2F7");
    	}
    	else if(event.getSource() == password) {
    		password.setStyle("-fx-background-color:#fff;" + "-fx-border-width:2.5px;" + "-fx-border-color: #35E2F7");
    		username.setStyle("-fx-background-color:#eef3ff; "+ "-fx-border-width: 1px;" +  "-fx-border-color: #35E2F7");
    	}
    }
    @Override
    public void initialize(URL url, ResourceBundle rb ) {
		username.setStyle("-fx-background-color:#eef3ff; "+ "-fx-border-width: 1px;" +  "-fx-border-color: #35E2F7");

		password.setStyle("-fx-background-color:#eef3ff; "+ "-fx-border-width: 1px;" + "-fx-border-color: #35E2F7");

    	DropShadow original = new DropShadow(50, Color.valueOf("#6a9ae7"));
    	hieudang.setEffect(original);
    	resume.setEffect(original);
    	hieudang.setOnMouseEntered((MouseEvent event) -> {
    		DropShadow shadow = new DropShadow(100, Color.valueOf("#6a9ae7"));
    		hieudang.setStyle("-fx-text-fill:#fff");
    		hieudang.setEffect(shadow);
    		resume.setEffect(shadow);
    	});
    	
    	hieudang.setOnMouseExited((MouseEvent event) -> {
    		DropShadow shadow = new DropShadow(20, Color.valueOf("#6a9ae7"));
    		hieudang.setStyle("-fx-text-fill: #6a9ae7");
    		hieudang.setEffect(shadow);
    		resume.setEffect(shadow);
    	});
        
    	
    		
    		
    }

}
