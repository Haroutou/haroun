import java.util.*;

interface Activity {
    String realiserActivite(); // Méthode abstraite
}

abstract class Pers {
    String id, name;

    public Pers(String id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract void sePresenter(); // Abstract method to introduce oneself

    @Override
    public String toString() {
        return "Pers{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' + '}';
    }
}

class Etudiant extends Pers implements Activity {
    private String diplome;

    public Etudiant(String id, String name, String diplome) {
        super(id, name);
        this.diplome = diplome;
    }

    @Override
    public void sePresenter() {
        System.out.println("Je suis l'étudiant " + id + " " + name + " Diplomé en " + diplome);
    }

    @Override
    public String realiserActivite() {
        return "L'étudiant " + name + " participe à un cours.";
    }

    @Override
    public String toString() {
        return super.toString() + " Etudiant{" + "diplome='" + diplome + '\'' + '}';
    }
}

class Enseignant extends Pers implements Activity {
    int numBureau;

    public Enseignant(String id, String name, int numBureau) {
        super(id, name);
        this.numBureau = numBureau;
    }

    @Override
    public void sePresenter() {
        System.out.println("Je suis l'enseignant " + id + " " + name + " affecté au bureau n° " + numBureau);
    }

    @Override
    public String realiserActivite() {
        return "L'enseignant " + name + " donne un cours de " + id + ".";
    }
}

public class TestHeritage {
    public static void main(String[] args) {

        Vector<Pers> T = new Vector<Pers>();
        T.add(new Etudiant("Et1", "Ahmed", "EEA"));
        T.add(new Enseignant("E1", "Achref", 1));
        T.add(new Enseignant("E2", "Achref", 2));

        // Iterate through all Pers objects in the vector
        for (Pers p : T) {
            // Call sePresenter from Pers class directly
            p.sePresenter();  // Call sePresenter directly on the Pers object
            
            // Cast to Activity and call realiserActivite() if p is of type Activity
            ((Activity) p).realiserActivite();  // Cast to Activity and call realiserActivite
        }
    }
}