package sn.fatoumata.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

import sn.fatoumata.service.ClientService;

class ClientServiceTest {
    private final ClientService service = new ClientService();

    @Test
    void refuseUnNomVide() {
        IllegalArgumentException erreur = assertThrows(
                IllegalArgumentException.class,
                () -> service.ajouter("   ", "Thierno", null));

        assertEquals("Le nom est obigatoire.", erreur.getMessage());
    }

    @Test
    void refuseUnNomAbsent() {
        assertThrows(
                IllegalArgumentException.class,
                () -> service.ajouter(null, "Thierno", null));
    }

    @Test
    void refuseUnPrenomVide() {
        IllegalArgumentException erreur = assertThrows(
                IllegalArgumentException.class,
                () -> service.ajouter("BALDE", " ", null));

        assertEquals("Le prenom est obigatoire.", erreur.getMessage());
    }

    @Test
    void refuseUnPrenomAbsent() {
        assertThrows(
                IllegalArgumentException.class,
                () -> service.ajouter("BALDE", null, null));
    }
}