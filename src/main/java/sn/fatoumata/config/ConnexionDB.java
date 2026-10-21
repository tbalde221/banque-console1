package sn.fatoumata.config;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class ConnexionDB {
    String URL;
    String USER;
    String PASSWORD;

    public ConnexionDB() throws IOException {
        Properties config = new Properties();
        try (InputStream fichier = Files.newInputStream(Path.of("config.properties"))) {
            config.load(fichier);
        }
        URL = config.getProperty("URL");
        USER = config.getProperty("USER");
        PASSWORD = config.getProperty("PASSWORD");

    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }

}
