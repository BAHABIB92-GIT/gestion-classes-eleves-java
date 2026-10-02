import java.util.Scanner;
class Classe {
    private String nomClasse;
    private int nombreEleves;
    private int promotion;
    private Eleve[] eleves;

    // Constructeur sans paramètres
    public Classe() { 
    }

    // Constructeur avec paramètres (avec setters)
    public Classe(String v_nomClasse, int v_nombre, int v_promotion) {
        setNomClasse(v_nomClasse);
        setNombreEleves(v_nombre);
        setPromotion(v_promotion);
        eleves = new Eleve[nombreEleves]; 
    }

    // Getters
    public String getNomClasse() { 
        return nomClasse; 
    }

    public int getNombreEleves() { 
        return nombreEleves; 
    }

    public int getPromotion() { 
        return promotion; 
    }

    public Eleve[] getEleves() { 
        return eleves; 
    }

    // Setters avec validation
    public void setNomClasse(String v_nomClasse) {
        if (v_nomClasse != null) {
            nomClasse = v_nomClasse;
        } else {
            System.out.println("Nom de classe invalide !");
        }
    }

    public void setNombreEleves(int v_nombre) {
        if (v_nombre > 0) {
            nombreEleves = v_nombre;
        } else {
            System.out.println("Nombre d'élèves invalide !");
        }
    }

    public void setPromotion(int v_promotion) {
        if (v_promotion >= 1950 && v_promotion <= 2026) {
            promotion = v_promotion;
        } else {
            System.out.println("Promotion invalide ! (1950 - 2026)");
        }
    }


    // Initialisation de la classe + élèves
    public static void initialiserClasse(Classe c) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nom de la classe: ");
        c.setNomClasse(sc.nextLine());

        System.out.print("Nombre d'eleves: ");
        c.setNombreEleves(sc.nextInt());

        System.out.print("Promotion: ");
        c.setPromotion(sc.nextInt());

        c.eleves = new Eleve[c.nombreEleves];

        for (int i = 0; i < c.nombreEleves; i++) {
            System.out.println("\n--- Eleve " + (i + 1) + " ---");
            c.eleves[i] = new Eleve();
            Eleve.initialiserEleve(c.eleves[i]);
        }
    }
}
