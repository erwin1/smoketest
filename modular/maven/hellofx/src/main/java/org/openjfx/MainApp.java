package org.openjfx;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class MainApp extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("scene.fxml"));
        
        Scene scene = new Scene(root);
        scene.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();

        if (System.getProperty("javafx.platform") == null) {
            PauseTransition pause = new PauseTransition(Duration.seconds(2));
            pause.setOnFinished(f -> System.exit(0));
            pause.play();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
