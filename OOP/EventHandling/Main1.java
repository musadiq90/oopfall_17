package EventHandling;

import javafx.application.Application;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import java.awt.*;
import java.util.Collection;
import java.util.EventListener;

public class Main1 extends Application implements EventHandler{
    Button button;

    public static void main(String[] args) {
        launch(args); // this is inside the application class, first it launch then it satrt()
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
         primaryStage.setTitle("title of the window");
         button = new Button("Click me");

        StackPane layout = new StackPane();
      //  layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300,250);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

    @Override
    public void handle(Event event) {

    }
}
