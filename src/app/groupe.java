package app;

public class groupe {
    public static void main(final String[] args) {

        personne Med = new personne("mohmed", "diallo", 25);
        Med.sePresenter();
        personne Sidi = new personne("sidi", "abdellah");
        Sidi.sePresenter();
        System.out.println(Sidi.getNom());
        System.out.println(Med.getNom());
        professeur prof=new professeur("ahmed", "sejad", "professeur", 26);
        prof.sePresenter();
        System.out.println(prof.getNom());
        prof.setEtablissement("FST");
        System.out.println(prof.getEtablissement());
        

        
    }
}

// EXO1:
// Class moyenne1 return 12.5  
// Class moyenne2 return 13  

// Ce sont des opérateurs pré-incrément et post-incrément dans les langages de programmation.

// Le pré-incrément signifie qu'il augmente la valeur de la variable avant de l'utiliser.

// Post-incrément signifie qu'il augmente la valeur de la variable après s'être utilisé