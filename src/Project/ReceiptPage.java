package Project;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class ReceiptPage extends Application {
	  
public static void main(String[] args) {
	        launch(args);
	    }
	
public void start (Stage primaryStage) throws IOException {
	        
	        Parent root = FXMLLoader.load(getClass().getResource("Receipt.fxml"));
			Scene scene = new Scene(root);
	        primaryStage.setTitle("FACTURA"); 
	        primaryStage.setScene(scene); 
	        primaryStage.show(); 
}
}


