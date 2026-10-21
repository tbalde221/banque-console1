package sn.fatoumata.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import sn.fatoumata.config.ConnexionDB;
import sn.fatoumata.model.Client;

public class ClientDao {
    public void creer(Client c) throws IOException, SQLException {

        String sql = """
                INSERT INTO clients
                    (nom,prenom,email)
                VALUES
                    (?,?,?)
                """;
        ConnexionDB connexionDB = new ConnexionDB();
        try (Connection conn = connexionDB.getConnection(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, c.getNom());
            ps.setString(2, c.getPrenom());
            ps.setString(3, c.getEmail());
            ps.executeUpdate();
        }

    }

}
