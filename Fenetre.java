import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.scene.paint.Color;
 
public class Fenetre extends Application {
    
    @Override
    public void start(Stage primaryStage) {
	/*
	 Button btn = new Button();
        btn.setText("Say 'Hello World'");
        btn.setOnAction(new EventHandler<ActionEvent>() {
 
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Hello World!");
            }
	    });
	*/
        StackPane root = new StackPane();
        //root.getChildren().add(btn);
       
	Scene scene = new Scene(root, 1200, 800, Color.BLACK);

        primaryStage.setTitle("Album Photo");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
 public static void main(String[] args) {
        launch(args);
    }
}

