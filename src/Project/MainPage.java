package Project;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainPage extends Application {
	  
public static void main(String[] args) {
	        launch(args);
	    }
	
public void start (Stage primaryStage) throws IOException{                                                                                                                                                                                                                                                                                                  
	        Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
		Scene scene = new Scene(root);
	        primaryStage.setTitle("RESTAURANTE"); 
	        primaryStage.setScene(scene); 
	        primaryStage.show(); 
}
}