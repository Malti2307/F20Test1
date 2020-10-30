/*
Name - Malti
St Num -200434065
 */

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


            resultSet1 = statement1.executeQuery("SELECT * FROM raceResults where gender ='Female'");


            while (resultSet1.next()) {
                Athelete female = new Athelete(
                        resultSet1.getInt("id"),
                        resultSet1.getInt("bib"),
                        resultSet1.getString("fullName"),
                        resultSet1.getString("gender"),
                        resultSet1.getString("club"),
                        resultSet1.getInt("yearOfBirth"),
                        resultSet1.getFloat("run1"),
                        resultSet1.getFloat("run2")
                );
                females.add(female);
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
        Connection conn2 = null;
        Statement statement2 = null;
        ResultSet resultSet2 = null;

        try {

            conn2 = DriverManager.getConnection("jdbc:mysql://localhost:3306/F20COMP1011Test1",
                    user, password);

            statement2 = conn2.createStatement();


            resultSet2 = statement2.executeQuery("SELECT * FROM raceResults where gender ='Male'");


            while (resultSet2.next()) {
                Athelete newAthelete = new Athelete(
                        resultSet2.getInt("id"),
                        resultSet2.getInt("bib"),
                        resultSet2.getString("fullName"),
                        resultSet2.getString("gender"),
                        resultSet2.getString("club"),
                        resultSet2.getInt("yearOfBirth"),
                        resultSet2.getFloat("run1"),
                        resultSet2.getFloat("run2")
                );
                males.add(newAthelete);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn2 != null)
                conn2.close();
            if (statement2 != null)
                statement2.close();
            if (resultSet2 != null)
                resultSet2.close();
            return males;
        }

    }

    public static ArrayList<Athelete> getFemalestop10() throws SQLException {
        ArrayList<Athelete> femalestop10 = new ArrayList<>();


        //1.define connection, preparedstatement
        Connection conn3 = null;
        Statement statement3 = null;
        ResultSet resultSet3 = null;

        try {

            conn3 = DriverManager.getConnection("jdbc:mysql://localhost:3306/F20COMP1011Test1",
                    user, password);

            statement3 = conn3.createStatement();


            resultSet3 = statement3.executeQuery("SELECt * FROM raceResults where gender = 'Female'order by run1+run2 Desc limit 10;");


            while (resultSet3.next()) {
                Athelete newAthelete = new Athelete(
                        resultSet3.getInt("id"),
                        resultSet3.getInt("bib"),
                        resultSet3.getString("fullName"),
                        resultSet3.getString("gender"),
                        resultSet3.getString("club"),
                        resultSet3.getInt("yearOfBirth"),
                        resultSet3.getFloat("run1"),
                        resultSet3.getFloat("run2")
                );
                femalestop10.add(newAthelete);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn3 != null)
                conn3.close();
            if (statement3 != null)
                statement3.close();
            if (resultSet3 != null)
                resultSet3.close();
            return femalestop10;
        }

    }

   public  static ArrayList<Athelete> getMalestop10() throws SQLException {
        ArrayList<Athelete> malestop10 = new ArrayList<>();


        //1.define connection, preparedstatement
        Connection conn4 = null;
        Statement statement4 = null;
        ResultSet resultSet4 = null;

        try {

            conn4 = DriverManager.getConnection("jdbc:mysql://localhost:3306/F20COMP1011Test1",
                    user, password);

            statement4 = conn4.createStatement();


            resultSet4 = statement4.executeQuery("SELECt * FROM raceResults where gender = 'Male'order by run1+run2 Desc limit 10;");


            while (resultSet4.next()) {
                Athelete newAthelete = new Athelete(
                        resultSet4.getInt("id"),
                        resultSet4.getInt("bib"),
                        resultSet4.getString("fullName"),
                        resultSet4.getString("gender"),
                        resultSet4.getString("club"),
                        resultSet4.getInt("yearOfBirth"),
                        resultSet4.getFloat("run1"),
                        resultSet4.getFloat("run2")
                );
                malestop10.add(newAthelete);
            }


        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn4 != null)
                conn4.close();
            if (statement4 != null)
                statement4.close();
            if (resultSet4 != null)
                resultSet4.close();
            return malestop10;
        }

    }
}


