package Project;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.control.cell.TextFieldTableCell;
import javafx.stage.Stage;

public class MainPageController implements Initializable {
	
	static ArrayList<String> menu = new ArrayList<>();
	static ArrayList<Integer> quant = new ArrayList<>();
	static ArrayList<Double> price = new ArrayList<>();
 	
    @FXML private TableView<Burger> tableView1;
    @FXML private TableColumn<Burger, String> OrderItemColumn1;
    @FXML private TableColumn<Burger, Integer> QuantityColumn1;
    
    @FXML private TableView<Drink> tableView2;
    @FXML private TableColumn<Drink, String> OrderItemColumn2;
    @FXML private TableColumn<Drink, Integer> QuantityColumn2;
    
    @FXML private RadioButton CB;
    @FXML private RadioButton CC;
    @FXML private RadioButton ENC;
    @FXML private RadioButton CH;
    @FXML private RadioButton PE;
    @FXML private RadioButton TC;
    @FXML private RadioButton ARR;
    @FXML private RadioButton SF;
    @FXML private RadioButton SA;    
    
    
    @FXML private RadioButton coke;
    @FXML private RadioButton C_M;
    
    @FXML private RadioButton C_C;
    @FXML private RadioButton lemonade;
    @FXML private RadioButton A_O;
    @FXML private RadioButton A_S;
    @FXML private RadioButton ice;
    @FXML private RadioButton PS;
    @FXML private RadioButton PAY;
    @FXML private RadioButton GL;


    @FXML private Button AddBurger;
    @FXML private Button AddDrink;
    @FXML private Button DeleteBtn;
    @FXML private Button ProceedBtn;
    
    @FXML private TextField quantityBurger;
    @FXML private TextField quantityDrink;
    
    @FXML private Label quantityLabel1;
    @FXML private Label quantityLabel2;
	
    @Override
    public void initialize(URL url, ResourceBundle rb) {
		
		OrderItemColumn1.setCellValueFactory(new PropertyValueFactory<Burger, String>("menuBurger"));
		QuantityColumn1.setCellValueFactory(new PropertyValueFactory<Burger, Integer>("quantity"));
		
		OrderItemColumn1.setCellFactory(TextFieldTableCell.forTableColumn());
		
		tableView1.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
		
		OrderItemColumn2.setCellValueFactory(new PropertyValueFactory<Drink, String>("menuDrink"));
		QuantityColumn2.setCellValueFactory(new PropertyValueFactory<Drink, Integer>("quantity"));
		
		OrderItemColumn2.setCellFactory(TextFieldTableCell.forTableColumn());
		
		tableView2.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
	}
    
    @FXML
    public void newBurgerButtonPushed()
    {
    	
    	
    	if(CB.isSelected()){
    		 Integer value = Integer.valueOf(quantityBurger.getText());
    		 
    	     Burger newBurger = new Burger("H.pollo" ,value);
    	     tableView1.getItems().add(newBurger);
    	     
    	     menu.add("H.pollo");
    	     quant.add(value);
    	     price.add(value*25.00);
    	     
    	     Menu.calculateOrder(25.00*value);
    	}
    	
    	else if(CC.isSelected()){
   		 Integer value = Integer.valueOf(quantityBurger.getText());
   		 
   	     Burger newBurger = new Burger("Caldo de camaron" ,value);
   	     tableView1.getItems().add(newBurger);
   	     
	     menu.add("Caldo de camaron");
	     quant.add(value);
	     price.add(value*45.00);
	     
	     Menu.calculateOrder(45.00*value);
   	}
    	
    	else if(ENC.isSelected()){
   		 Integer value = Integer.valueOf(quantityBurger.getText());
   		 
   	     Burger newBurger = new Burger("Enchiladas" ,value);
   	     tableView1.getItems().add(newBurger);
   	     
	     menu.add("Enchiladas");
	     quant.add(value);
	     price.add(value*25.00);
	     
	     Menu.calculateOrder(25.00*value);
   	}
    	
    	else if(CH.isSelected()){
   		 Integer value = Integer.valueOf(quantityBurger.getText());
   		 
   	     Burger newBurger = new Burger("Chilaquiles" ,value);
   	     tableView1.getItems().add(newBurger);
   	     
	     menu.add("P.empanizada");
	     quant.add(value);
	     price.add(value*25.00);
	     
	     Menu.calculateOrder(25.00*value);
   	}
    	
    	else if(PE.isSelected()){
   		 Integer value = Integer.valueOf(quantityBurger.getText());
   		 
   	     Burger newBurger = new Burger("P.empanizada" ,value);
   	     tableView1.getItems().add(newBurger);
   	     
	     menu.add("P.empanizada");
	     quant.add(value);
	     price.add(value*35.00);
	     
	     Menu.calculateOrder(35.00*value);
   	}
        
                   else if(TC.isSelected()){
   		 Integer value = Integer.valueOf(quantityBurger.getText());
   		 
   	     Burger newBurger = new Burger("T.Camaron" ,value);
   	     tableView1.getItems().add(newBurger);
   	     
	     menu.add("T.Camaron");
	     quant.add(value);
	     price.add(value*15.00);
	     
	     Menu.calculateOrder(15.00*value);
   	 } 
        
                   else if(ARR.isSelected()){
                    Integer value = Integer.valueOf(quantityBurger.getText());
   		 
   	     Burger newBurger = new Burger("Arroz" ,value);
   	     tableView1.getItems().add(newBurger);
   	     
	     menu.add("Arroz");
	     quant.add(value);
	     price.add(value*20.00);
	     
	     Menu.calculateOrder(15.00*value);
   	 }       
                  else if(SF.isSelected()){
   		 Integer value = Integer.valueOf(quantityBurger.getText());
   		 
   	     Burger newBurger = new Burger("S.fria" ,value);
   	     tableView1.getItems().add(newBurger);
   	     
	     menu.add("S.fria");
	     quant.add(value);
	     price.add(value*15.00);
	     
	     Menu.calculateOrder(15.00*value);
   	 }      
                  else if(SA.isSelected()){
   		 Integer value = Integer.valueOf(quantityBurger.getText());
   		 
   	     Burger newBurger = new Burger("S.aguada" ,value);
   	     tableView1.getItems().add(newBurger);
   	     
	     menu.add("S.aguada");
	     quant.add(value);
	     price.add(value*17.00);
	     
	     Menu.calculateOrder(17.00*value);
   	 }               
        

}
    
    
    
    
    
    
 
   
    
    @FXML
    public void newDrinkButtonPushed()
    {
    	if(coke.isSelected()){
    		 Integer value = Integer.valueOf(quantityDrink.getText());
    		 
    	     Drink newDrink = new Drink("Coca 600ml" ,value);
    	     tableView2.getItems().add(newDrink);
    	     
    	     menu.add("Coca 600ml");
    	     quant.add(value);
    	     price.add(value*20.00);
    	     
    	     Menu.calculateOrder(20.00*value);
    	}
    	
    	else if(C_M.isSelected()){
   		 Integer value = Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("Modelo" ,value);
   	     tableView2.getItems().add(newDrink);
   	     
	     menu.add("Modelo");
	     quant.add(value);
	     price.add(value*35.00);
	     
	     Menu.calculateOrder(35.00*value);
   	}
    	else if(C_C.isSelected()){
   		 Integer value = Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("Corona" ,value);
   	     tableView2.getItems().add(newDrink);
   	     
	     menu.add("Corona");
	     quant.add(value);
	     price.add(value*35.00);
	     
	     Menu.calculateOrder(35.00*value);
   	}
    	else if(lemonade.isSelected()){
   		 Integer value = Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("A.limon" ,value);
   	     tableView2.getItems().add(newDrink);
   	     
	     menu.add("A.limon");
	     quant.add(value);
	     price.add(value*25.00);
	     
	     Menu.calculateOrder(25.00*value);
   	}
    	else if(A_O.isSelected()){
   		 Integer value= Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("A.orchata" ,value);
   	     tableView2.getItems().add(newDrink);
   	     
	     menu.add("A.orchata");
	     quant.add(value);
	     price.add(value*25.00);
	     
	     Menu.calculateOrder(25.00*value);
   	}
 
                  else if(A_S.isSelected()){
   		 Integer value= Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("A.sandia" ,value);
   	     tableView2.getItems().add(newDrink);
   	     
	     menu.add("A.sandia");
	     quant.add(value);
	     price.add(value*25.00);
	     
	     Menu.calculateOrder(25.00*value);
   	}
        
        
        
                   else if(ice.isSelected()){
   		 Integer value= Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("ice" ,value);
   	     tableView2.getItems().add(newDrink);
   	     
	     menu.add("ice");
	     quant.add(value);
	     price.add(value*15.00);
	     
	     Menu.calculateOrder(15.00*value);
   	}
        
                  else if(PS.isSelected()){
   	 Integer value= Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("Pastel" ,value);
   	     tableView2.getItems().add(newDrink);
   	     
	     menu.add("Pastel");
	     quant.add(value);
	     price.add(value*20.00);
	     
	     Menu.calculateOrder(20.00*value);
   	}
        
                   else if(PAY.isSelected()){
   	 Integer value= Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("Pay" ,value);
   	     tableView2.getItems().add(newDrink);
   	     
	     menu.add("Pay");
	     quant.add(value);
	     price.add(value*20.00);
	     
	     Menu.calculateOrder(20.00*value);
   	}
        
    
                   else if(GL.isSelected()){
   	 Integer value= Integer.valueOf(quantityDrink.getText());
   		 
   	     Drink newDrink = new Drink("Gelatina" ,value);
   	     tableView2.getItems().add(newDrink);
   	     
	     menu.add("Gelatina");
	     quant.add(value);
	     price.add(value*15.00);
	     
	     Menu.calculateOrder(15.00*value);
   	}
        
      
        
        
}
    @FXML
	public void proceedBtn(ActionEvent event) throws IOException{
		Parent receiptPage = FXMLLoader.load(getClass().getResource("Receipt.fxml"));
		Scene receiptPageScene = new Scene(receiptPage);
		
		Stage window = (Stage)((Node) event.getSource()).getScene().getWindow();
		
		window.setScene(receiptPageScene);
		window.show();
	}
    @FXML
    public void deleteButtonPushed()
    {
        ObservableList<Burger> selectedRows1, allOrder1;
        allOrder1 = tableView1.getItems();
        
        selectedRows1 = tableView1.getSelectionModel().getSelectedItems();
        
        for (Burger burger: selectedRows1)
        {
            allOrder1.remove(burger);
        }
        
        ObservableList<Drink> selectedRows2, allOrder2;
        allOrder2 = tableView2.getItems();
        
        selectedRows2 = tableView2.getSelectionModel().getSelectedItems();
        
        for (Drink drink: selectedRows2)
        {
            allOrder2.remove(drink);
        }
    }
    
    public static ArrayList<String> getMenu(){
    	return menu;
    }
    
    public static ArrayList<Integer> getQuant(){
    	return quant;
    }
    
    public static ArrayList<Double> getPrice(){
    	return price;
    }
}