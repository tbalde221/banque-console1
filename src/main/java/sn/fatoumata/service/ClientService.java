package sn.fatoumata.service;

import java.io.IOException;
import java.sql.SQLException;

import sn.fatoumata.dao.ClientDao;
import sn.fatoumata.model.Client;

public class ClientService {
    public void ajouter(String nom, String prenom, String email) throws IOException, SQLException {
        if (nom == null || nom.isBlank()) {
            throw new IllegalArgumentException("Le nom est obigatoire.");
        }
        if (prenom == null || prenom.isBlank()) {
            throw new IllegalArgumentException("Le prenom est obigatoire.");
        }

        String emailNettoye = (email == null || email.isBlank()) ? null : email.trim();
        Client c = new Client(nom.trim(), prenom.trim(), emailNettoye);
        ClientDao dao = new ClientDao();
        dao.creer(c);
    }
}
