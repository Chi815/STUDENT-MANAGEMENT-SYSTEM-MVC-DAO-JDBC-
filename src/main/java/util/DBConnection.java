package util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static final String URL = "jdbc:postgresql://ep-broad-firefly-ao1zov5j-pooler.c-2.ap-southeast-1.aws.neon.tech/neondb?sslmode=require";
    private static final String USER =  "neondb";
    private static final String PASSWORD = "passsword";

    public static Connection getConnection() {

        try {
            Class.forName("org.postgresql.Driver");

            return DriverManager.getConnection(URL, USER, PASSWORD);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}