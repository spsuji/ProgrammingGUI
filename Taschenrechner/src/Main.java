import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("CalculatorGUI.fxml"));

        System.out.println(getClass().getResource("Backup"));

        Parent root = (Parent) loader.load();

        Calculator model = new Calculator();
        loader.<Controller>getController().init(model);

        Scene scene = new Scene(root);
        stage.setTitle("Test");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
