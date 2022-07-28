package jm.task.core.jdbc.util;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    static String userName = "root";
    static String password = "myroot123";
    static String connectionURL = "jdbc:mysql://localhost:3306/my_db_113";
    static Connection conn = null;

    public static Connection getSQLConnection() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            return conn = DriverManager.getConnection(connectionURL, userName,
                    password);
        } catch (SQLException | ClassNotFoundException e) {
            System.out.println("Ошибка при подключении к БД!");
        }
        return null;
    }

    public static Connection closeSQLConnection() {
        try {
            conn.close();
        } catch (SQLException e) {
            System.out.println("Ошибка при закрытии БД!");
        }
        return null;
    }
}

