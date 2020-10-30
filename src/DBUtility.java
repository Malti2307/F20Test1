import java.sql.*;
import java.util.ArrayList;

public class DBUtility
{

    private static String user = "student";
    private static String password = "student";



    public static ArrayList<Athelete> getAtheletes() throws SQLException {
        ArrayList<Athelete> Atheletes = new ArrayList<>();

        //1.define connection, preparedstatement
        Connection conn = null;
        Statement statement = null;
        ResultSet resultSet = null;

        try{

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/F20COMP1011Test1",
                    user, password);

            statement = conn.createStatement();


            resultSet = statement.executeQuery("SELECT * FROM chocolate_data");


            while(resultSet.next())
            {
                Athelete newAthelete = new Athelete(
                        resultSet.getInt("id"),
                        resultSet.getInt("bib"),
                        resultSet.getString("fullName"),
                        resultSet.getString("gender"),
                        resultSet.getString("club"),
                        resultSet.getInt("yearOfBirth"),
                        resultSet.getDouble("run1")
                );
                Atheletes.add(Athelete);
            }



        } catch (Exception e)
        {
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
}
