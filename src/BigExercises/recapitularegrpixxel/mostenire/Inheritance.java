package BigExercises.recapitularegrpixxel.mostenire;

public class Inheritance {

    public String nume;
    public String prenume;

    public Inheritance(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
    }

    public void afiseazaNume(){
        System.out.println("numele este: " + nume);
    }

    public void afiseazaPrenume(){
        System.out.println("prenumele este: " + prenume);
    }

    public final void compuneString(){
        System.out.println("string compus din: " + nume + "-" + prenume);
    }
}
