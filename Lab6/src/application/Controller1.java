package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller1 {
	
	//fields
	@FXML
	private TextField name;
	@FXML
	private TextField street;
	@FXML
	private TextField city;
	@FXML
	private TextField state;
	@FXML
	private TextField zip;
	@FXML
	private TextField Input;
	@FXML
	private TextField Output;
	
	
	String Name;
	String Street;
	String City;
	String State;
	String Zip;
	String input;
	
	
	
	//display fields
	public void display(ActionEvent event ) {
		
		/*Dave Smith
		123 North B
		Fairfield, Iowa 52556
		 */
		
		Name = name.getText();
		Street = street.getText();
		City = city.getText();
		State = state.getText();
		Zip = zip.getText();
		
		System.out.println(Name + "\n" +
						   Street + "\n" +
						   City + ", " + State + " " + Zip
		);
		
	}
	
	//count letters
	public void countLetters(ActionEvent event) {
		
		int num = input.length();
		Output.setText(Integer.toString(num));
				
	}
	
	
	
	
}
