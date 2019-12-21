package question2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class Controller1 {

	// fields
	@FXML
	private TextField Input;
	@FXML
	private TextField Output;

	String input;

	// count letters
	public void countLetters(ActionEvent event) {

		input = Input.getText();
		int num = input.length();
		Output.setText(Integer.toString(num));

	}

	// reverse letters
	public void reverseLetters(ActionEvent event) {

		input = Input.getText();

		StringBuilder sb = new StringBuilder();

		for (int i = input.length() - 1; i >= 0; i--) {
			sb.append(input.charAt(i));
		}

		Output.setText(sb.toString());

	}

	// remove duplicates
	public void removeDuplicates() {

		Set<Character> cSet = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();

		input = Input.getText();

		for (int i = 0; i < input.length(); i++) {
			Character c = input.charAt(i);
			cSet.add(c);
		}

		for (Character c : cSet) {
			sb.append(c);
		}

		Output.setText(sb.toString());

	}

}
