package app;

public class professeur extends personne {
    private String etablissement;

    professeur(String n, String p, int a) {
        super(n, p, a);

    }

    professeur(String n, String p, String prof, int a) {
        super(n, p, prof, a);

    }

    @Override
    void sePresenter() {

        super.sePresenter();
        System.out.println(" et je suis " + getProfission());
    }

    @Override
    String getNom() {

        return super.getNom();
    }

    @Override
    String getProfission() {

        return super.getProfission();
    }

    String getEtablissement() {
        return etablissement;
    }

    void setEtablissement(String Etab) {
        etablissement = Etab;

    }
}