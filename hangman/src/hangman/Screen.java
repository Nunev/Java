package hangman;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Screen extends Application{
	
	Label lb_text;
	Button btn_start;
	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		lb_text = new Label("Welcome to HangMan");
		btn_start = new Button("START");
		
		btn_start.setOnAction(new EventHandler<ActionEvent>() {
			
			@Override
			public void handle(ActionEvent event) {
				
			}
		});
		
		VBox root = new VBox();
		root.getChildren().add(lb_text);
		
		Scene scene = new Scene(root, 500,500);
		stage.setScene(scene);
		
		stage.show();
		
	}

}
