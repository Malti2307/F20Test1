import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

import java.net.URL;
import java.util.ResourceBundle;

public class AtheleteViewController implements Initializable {

    @FXML
    private TableView<Athelete> tableView;

    @FXML
    private TableColumn<Athelete, Integer> idColumn;

    @FXML
    private TableColumn<Athelete, Integer> bibColumn;

    @FXML
    private TableColumn<Athelete, String> nameColumn;

    @FXML
    private TableColumn<Athelete, String> genderColumn;

    @FXML
    private TableColumn<Athelete, String> clubColumn;

    @FXML
    private TableColumn<Athelete, Integer> yearColumn;

    @FXML
    private TableColumn<Athelete, Float> run1Column;

    @FXML
    private TableColumn<Athelete, Float> run2Column;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
