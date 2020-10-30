import java.sql.*;
import java.util.ArrayList;

public class DBUtility {

    private static String user = "student";
    private static String password = "student";


    public static ArrayList<Athelete> getAtheletes() throws SQLException {
        ArrayList<Athelete> Atheletes = new ArrayList<>();

        //1.define connection, preparedstatement
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try {

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/F20COMP1011Test1",
                    user, password);

            statement = conn.createStatement();


            resultSet = statement.executeQuery("SELECT * FROM raceResults");


            while (resultSet.next()) {
                Athelete newAthelete = new Athelete(
                        resultSet.getInt("id"),
                        resultSet.getInt("bib"),
                        resultSet.getString("fullName"),
                        resultSet.getString("gender"),
                        resultSet.getString("club"),
                        resultSet.getInt("yearOfBirth"),
                        resultSet.getFloat("run1"),
                        resultSet.getFloat("run2")
                );
                Atheletes.add(newAthelete);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null)
                conn.close();
            if (statement != null)
                statement.close();
            if (resultSet != null)
                resultSet.close();
            return Atheletes;
        }
    }

    public static ArrayList<Athelete> getFemales() throws SQLException {
        ArrayList<Athelete> females = new ArrayList<>();


        //1.define connection, preparedstatement
        Connection conn1 = null;
        Statement statement1 = null;
        ResultSet resultSet1 = null;

        try {

            conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/F20COMP1011Test1",
                    user, password);

            statement1 = conn1.createStatement();


            resultSet1 = statement1.executeQuery("SELECT * FROM raceResults where gender ='Female';");


            while (resultSet1.next()) {
                Athelete newAthelete = new Athelete(
                        resultSet1.getInt("id"),
                        resultSet1.getInt("bib"),
                        resultSet1.getString("fullName"),
                        resultSet1.getString("gender"),
                        resultSet1.getString("club"),
                        resultSet1.getInt("yearOfBirth"),
                        resultSet1.getFloat("run1"),
                        resultSet1.getFloat("run2")
                );
                females.add(newAthelete);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn1 != null)
                conn1.close();
            if (statement1 != null)
                statement1.close();
            if (resultSet1 != null)
                resultSet1.close();
            return females;
        }

    }


    public static ArrayList<Athelete> getMales() throws SQLException {
        ArrayList<Athelete> males = new ArrayList<>();


        //1.define connection, preparedstatement
        Connection conn1 = null;
        Statement statement1 = null;
        ResultSet resultSet1 = null;

        try {

            conn1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/F20COMP1011Test1",
                    user, password);

            statement1 = conn1.createStatement();


            resultSet1 = statement1.executeQuery("SELECT Top 10 FROM raceResults;");


            while (resultSet1.next()) {
                Athelete newAthelete = new Athelete(
                        resultSet1.getInt("id"),
                        resultSet1.getInt("bib"),
                        resultSet1.getString("fullName"),
                        resultSet1.getString("gender"),
                        resultSet1.getString("club"),
                        resultSet1.getInt("yearOfBirth"),
                        resultSet1.getFloat("run1"),
                        resultSet1.getFloat("run2")
                );
                males.add(newAthelete);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn1 != null)
                conn1.close();
            if (statement1 != null)
                statement1.close();
            if (resultSet1 != null)
                resultSet1.close();
            return males;
        }

    }
}


