package BigExercises.inheritance;

public class Sarpe extends Animal{
    public String culoare;
    public String rasa;

    public Sarpe(String specie) {
        super(specie);
    }

    public Sarpe(String specie, String rasa,String culoare){
        this(specie);
        this.culoare = culoare;
        this.rasa = rasa;
    }

    public Sarpe(String specie, String culoare){
        super(specie);
        this.culoare = culoare;
    }

    @Override
    public void merge(){
        super.merge();
        System.out.println("Sarpele se taraste, nu merge ca un caine");
    }
}
