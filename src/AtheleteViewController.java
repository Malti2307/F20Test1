/*
Name - Malti
St Num -200434065
 */

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
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

    @FXML
    private Label rowsReturnedLabel;

    @FXML
    private Label headingLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        idColumn.setCellValueFactory(new PropertyValueFactory<Athelete, Integer>("id"));
        bibColumn.setCellValueFactory(new PropertyValueFactory<Athelete, Integer>("bib"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<Athelete, String>("fullName"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<Athelete, String>("gender"));
        clubColumn.setCellValueFactory(new PropertyValueFactory<Athelete, String>("club"));
        yearColumn.setCellValueFactory(new PropertyValueFactory<Athelete, Integer>("yearOfBirth"));
        run1Column.setCellValueFactory(new PropertyValueFactory<Athelete, Float>("run1"));
        run2Column.setCellValueFactory(new PropertyValueFactory<Athelete, Float>("run2"));

        try {

            tableView.getItems().addAll(DBUtility.getAtheletes());
        } catch (
                SQLException e) {
            e.printStackTrace();
        }


    }

    public void allRacersButton() {
        headingLabel.setText("All Racers");
        try {

            tableView.getItems().addAll(DBUtility.getAtheletes());
        } catch (
                SQLException e) {
            e.printStackTrace();
        }

    }

    public void allFemalesButton() {
        headingLabel.setText("All Females");

        try {

            tableView.getItems().addAll(DBUtility.getFemales());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void allMalesButton() {
        headingLabel.setText("All Males");

        try {

            tableView.getItems().addAll(DBUtility.getFemales());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void top10females() {
        headingLabel.setText("Top 10 Females");

        try {

            tableView.getItems().addAll(DBUtility.getFemalestop10());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public void top10males() {
        headingLabel.setText("Top 10 males");

        try {

            tableView.getItems().addAll(DBUtility.getMalestop10());
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
