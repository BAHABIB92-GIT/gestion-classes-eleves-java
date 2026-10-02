public class Test {
    public static void main(String[] args) {

        Classe c = new Classe();

        // Initialisation (UNE seule variable)
        Classe.initialiserClasse(c);

        System.out.println("\n===== RECAPITULATIF =====");
        System.out.println("Classe: " + c.getNomClasse());
        System.out.println("Nombre d'eleves: " + c.getNombreEleves());
        System.out.println("Promotion: " + c.getPromotion());

        Eleve[] tab = c.getEleves();

        for (int i = 0; i < tab.length; i++) {
            System.out.println("\n--- Eleve " + (i + 1) + " ---");
            System.out.println("Nom: " + tab[i].getNom());
            System.out.println("Prenom: " + tab[i].getPrenom());
            System.out.println("Sexe: " + tab[i].getSexe());
            System.out.println("Info: " + tab[i].getNoteInfo());
            System.out.println("Math: " + tab[i].getNoteMath());
            System.out.println("Anglais: " + tab[i].getNoteAnglais());
        }
    }
}
