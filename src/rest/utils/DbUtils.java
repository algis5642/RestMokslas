package rest.utils;



import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class DbUtils {

    public Connection createConnection(){
        Properties prop = new Properties();
        Connection connection = null;
        try {
            prop.load(getClass().getResourceAsStream("../../../properties/pro.properties"));
            getClass().forName(prop.getProperty("db.driver"));

            connection = DriverManager.getConnection(prop.getProperty("db.url"), prop.getProperty("db.username"),
                    prop.getProperty("db.password"));
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}
