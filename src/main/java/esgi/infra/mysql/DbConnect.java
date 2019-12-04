package esgi.infra.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnect {

    public static java.sql.Connection connection = null;

    public static java.sql.Connection getConnection() {
        //String url = "jdbc:mysql://us-cdbr-iron-east-05.cleardb.net/heroku_bab9f081f17abbf?reconnect=true"; //jdbc:"+System.getenv( "DB_RDS");//"jdbc:mysql://localhost:3306/cowork?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        String url = System.getenv( "DB_RDS");
        //String url = "jdbc:mysql://localhost:3306/cowork?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        //String username = "b78ab6ae03f754";//System.getenv("JDBC_DATABSE_USERNAME");
        String username = System.getenv( "DB_USERNAME_RDS");
        //String username = "root";
        //String password = "358baaea";//System.getenv("JDBC_DATABSE_PASSWORD");
        String password = System.getenv( "DB_PASSWORD_RDS");//System.getenv("JDBC_DATABSE_PASSWORD");
        //String password = "root";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = java.sql.DriverManager.getConnection(url, username, password);
        } catch (java.sql.SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;

    }

    public static void closeConnection(java.sql.Connection connection) {
        try {
            connection.close();
        } catch (java.sql.SQLException e) {
            e.printStackTrace();
        }
    }
}
