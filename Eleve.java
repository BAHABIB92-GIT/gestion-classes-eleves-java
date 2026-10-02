import java.util.Scanner;

public class Eleve {
    private String nom;
    private String prenom;
    // private Sexe sexe;
    private char sexe;
    private double noteInfo;
    private double noteMath;
    private double noteAnglais;

    public Eleve() {

    }

    // public Eleve(String v_nom, String v_prenom, String v_sexe, 
    //             double v_info, double v_math, double v_anglais) {
    //     nom = v_nom;
    //     prenom = v_prenom;
    //     setSexe(v_sexe);
    //     setNoteInfo(v_info);
    //     setNoteMath(v_math);
    //     setNoteAnglais(v_anglais);
    // }

    public Eleve(String v_nom, String v_prenom, char v_sexe,
                double v_info, double v_math, double v_anglais) {
        nom = v_nom;
        prenom = v_prenom;
        setSexe(v_sexe);
        setNoteInfo(v_info);
        setNoteMath(v_math);
        setNoteAnglais(v_anglais);
    }

    // Getters
    public String getNom() { 
        return nom; 
    }

    public String getPrenom() { 
        return prenom; 
    }

    // public Sexe getSexe() { 
    //     return sexe; 
    // }

    public char getSexe() { 
        return sexe; 
    }

    public double getNoteInfo() { 
        return noteInfo; 
    }

    public double getNoteMath() { 
        return noteMath; 
    }

    public double getNoteAnglais() { 
        return noteAnglais; 
    }

    // Setters notes (validation 0-20)
    public void setNoteInfo(double v_noteInfo) {
        if (v_noteInfo >= 0 && v_noteInfo <= 20){
            noteInfo = v_noteInfo;
        }
        else{
            System.out.println("Note Info invalide !");
        }
    }

    public void setNoteMath(double v_noteMath) {
        if (v_noteMath >= 0 && v_noteMath <= 20) noteMath = v_noteMath;
        else System.out.println("Note Math invalide !");
    }

    public void setNoteAnglais(double v_noteAnglais) {
        if (v_noteAnglais >= 0 && v_noteAnglais <= 20) noteAnglais = v_noteAnglais;
        else System.out.println("Note Anglais invalide !");
    }

    // // Setter sexe avec validation String -> enum
    // public void setSexe(String v_sexe) {
    //     if (v_sexe != null) {
    //         v_sexe = v_sexe.toUpperCase();

    //         if (v_sexe.equals("M")) {
    //             sexe = Sexe.M;
    //         }
    //         else if (v_sexe.equals("F")) {
    //             sexe = Sexe.F;
    //         }
    //         else {
    //             System.out.println("Sexe invalide !");
    //         }
    //     }
    // }

    // Setter sexe avec validation char
    public void setSexe(char v_sexe) {
        v_sexe = Character.toUpperCase(v_sexe);

        if (v_sexe == 'M' || v_sexe == 'F') {
            sexe = v_sexe;
        } else {
            System.out.println("Sexe invalide !");
        }
    }

    // Initialisation
    public static void initialiserEleve(Eleve e) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nom: ");
        e.nom = sc.nextLine();

        System.out.print("Prenom: ");
        e.prenom = sc.nextLine();

        // System.out.print("Sexe (M/F): ");
        // e.setSexe(sc.next());

        System.out.print("Sexe (M/F): ");
        e.setSexe(sc.next().charAt(0));

        System.out.print("Note Info: ");
        e.setNoteInfo(sc.nextDouble());

        System.out.print("Note Math: ");
        e.setNoteMath(sc.nextDouble());

        System.out.print("Note Anglais: ");
        e.setNoteAnglais(sc.nextDouble());

        sc.nextLine();
    }
}
