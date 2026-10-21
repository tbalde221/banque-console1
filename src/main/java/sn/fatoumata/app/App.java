package sn.fatoumata.app;

import java.sql.Connection;

import sn.fatoumata.config.ConnexionDB;
import sn.fatoumata.service.ClientService;

public class App {
    public static void main(String[] args) {
        ClientService service = new ClientService();
        try {
            service.ajouter("DIOP", "Fatoumata", "diop@gmail.com");
            System.out.println("Client ajouter avec succés");
        } catch (Exception e) {
            System.out.println("Echec de l'ajout !!!");
            e.printStackTrace();
        }
    }
}
