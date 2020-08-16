package app;

public class personne {
    private String nom;
     private String prenom;
     private String profession;
     private int age;

    personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        profession = "";
    }

    personne(String nom, String prenom, String profession) {
        this.nom = nom;
        this.prenom = prenom;
        age = -1;
        this.profession = profession;
    }

    personne(String nom, String prenom, String profession, int age) {
        this.nom = nom;
        this.prenom = prenom;
        this.age = age;
        this.profession = profession;
    }

    personne(String nom, String prenom) {
        this.nom = nom;
        this.prenom = prenom;
        age = -1;
    }

    void sePresenter() {
        if (age == -1)
            System.out.println("je m appelle " + prenom + " " + nom);
        else
            System.out.println("je m appelle " + prenom + " " + nom + " j ai " + age + " ans");
    }

    String getNom() {
        return nom;
    }
    String getProfission() {
        return profession;
    }
}