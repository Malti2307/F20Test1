import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.SQLException;
import java.util.ArrayList;


public class Main extends Application {
    public static void main(String[] args) {
        try {
            ArrayList<Athelete> Atheletes = DBUtility.getAtheletes();


        } catch (SQLException e) {
            e.printStackTrace();
        }
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("AtheleteView.fxml"));
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Athelete Data");
        stage.show();
    }
}
