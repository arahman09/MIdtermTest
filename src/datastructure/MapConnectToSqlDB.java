package datastructure;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class MapConnectToSqlDB {


    public static Connection sqlConnection = null;
    public static PreparedStatement preparedStatement = null;

    public static Properties loadProperties() throws IOException
    {
        Properties properties = new Properties();
        InputStream inputStream = new FileInputStream("/Volumes/D/midTerm/MidtermMarch2020/src/secret.properties");
        properties.load(inputStream);
        inputStream.close();
        return properties;
    }

    public static Connection connectToSQLDatabase() throws IOException, SQLException, ClassNotFoundException
    {
        Properties properties = loadProperties();

        String driverClass = properties.getProperty("MYSQLJDBC.driver");
        String url = properties.getProperty("MYSQLJDBC.url");
        String userName = properties.getProperty("MYSQLJDBC.userName");
        String password = properties.getProperty("MYSQLJDBC.password");

        Class.forName(driverClass);
        sqlConnection = DriverManager.getConnection(url,userName,password);
        System.out.println("Database is connected");
        return sqlConnection;
    }

    public static void insertProfileToSQLTable(String tableName, String columnName1, String columnName2)

    {
        try

        {
            connectToSQLDatabase();

            preparedStatement = sqlConnection.prepareStatement("INSERT INTO " + tableName + " ( " + columnName1 + ","
                    + columnName2+")VALUES(?,?)");

            preparedStatement.setString(1,"WorldTrade Centre");
            preparedStatement.setString(2, "Robert Moses State Park");
//            preparedStatement.setString(1, "Bon");
//                preparedStatement.setString(4,"110 Cortelyou Rd");
//                preparedStatement.setString(5,"Brooklyn");
//                preparedStatement.setString(6,"11219");
            preparedStatement.executeUpdate();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
    }

    public static List<User> readUserProfileFromSQLTable()throws IOException, SQLException, ClassNotFoundException
    {
        List<User> list = new ArrayList<>();
        User user = null;

        try
        {
            Connection connection = connectToSQLDatabase();
            String query = "SELECT * FROM LandmarkOfNY";

            // create the java statement
            Statement connectionStatement = connection.createStatement();

            // execute the query, and get a java resultset
            ResultSet resultSet = connectionStatement.executeQuery(query);

            // iterate through the java resultset
            while (resultSet.next())
            {
                String city = resultSet.getString("CityLandmark");
                String state = resultSet.getString("StateLandmark");
                System.out.format("%s, %s\n",city, state);
                user = new User(city,state);
                list.add(user);

            }
            connectionStatement.close();
        }
        catch (Exception e)
        {
            System.err.println("Got an exception! ");
            System.err.println(e.getMessage());
        }
        return list;
    }

    public static void main(String[] args)throws IOException, SQLException, ClassNotFoundException
    {
        insertProfileToSQLTable("LandmarkOfNY","CityLandmark", "StateLandmark");

        List<User> list = readUserProfileFromSQLTable();

        for(User user:list)
        {
            System.out.println(user.getCityLandmark() + "      " + user.getStateLandmark());
        }
    }
}

