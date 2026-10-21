package sn.fatoumata.service;

import java.io.IOException;
import java.sql.SQLException;

import sn.fatoumata.dao.ClientDao;
import sn.fatoumata.model.Client;
import sn.fatoumata.util.VerifChaine;

public class ClientService {
    public void ajouter(String nom, String prenom, String email) throws IOException, SQLException {
        if (VerifChaine.isNullOrBlank(nom)) {
            throw new IllegalArgumentException("Le nom est obigatoire.");
        }
        if (VerifChaine.isNullOrBlank(prenom)) {
            throw new IllegalArgumentException("Le prenom est obigatoire.");
        }

        String emailNettoye = (VerifChaine.isNullOrBlank(email)) ? null : email.trim();
        Client c = new Client(nom.trim(), prenom.trim(), emailNettoye);
        ClientDao dao = new ClientDao();
        dao.creer(c);
    }
}
