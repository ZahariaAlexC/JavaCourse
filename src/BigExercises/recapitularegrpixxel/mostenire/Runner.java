package BigExercises.recapitularegrpixxel.mostenire;

public class Runner extends Inheritance{

    public long cnp;

    public Runner(String nume, String prenume, long cnp){
        super(nume,prenume);
        this.cnp = cnp;
    }


    public void afiseazaDatePersoana(){
        System.out.println("nume: " + nume + "," +
                "prenume: " + prenume + "," + "cnp-ul este: " + cnp);
        super.compuneString();
    }


    public static void main(String[] args) {
        Runner runner = new Runner("Popescu", "Mircea", 150000000000000000L);
        runner.compuneString();
        runner.afiseazaDatePersoana();
        runner.afiseazaPrenume();
        runner.afiseazaNume();
    }


}
