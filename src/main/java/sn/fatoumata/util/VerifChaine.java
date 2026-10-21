package sn.fatoumata.util;

public class VerifChaine {
    public static boolean isNullOrBlank(String chaine) {
        if (chaine == null || chaine.isBlank()) {
            return true;
        }
        return false;
    }
}
