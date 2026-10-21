package sn.fatoumata.model;

import java.time.LocalDate;

public class Client {
    private int id;
    String nom;
    String prenom;
    String email;
    LocalDate creeLe;

    public Client(int id, String nom, String prenom, String email, LocalDate creeLe) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.creeLe = creeLe;
    }

    public Client(String nom, String prenom, String email) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreeLe() {
        return creeLe;
    }

    @Override
    public String toString() {
        return "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", creeLe=" + creeLe
                + "]";
    }

}
