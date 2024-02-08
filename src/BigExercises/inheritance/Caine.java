package BigExercises.inheritance;

public class Caine extends Animal{
    private String rasa;

    public Caine(String rasa, String specie){
        super(specie);
        this.rasa = rasa;
    }

    public String getRasa() {
        return rasa;
    }

    public void setRasa(String rasa) {
        this.rasa = rasa;
    }


    public void latra(){
        System.out.println("Cainele face HAM, HAM");
    }

    public void seJoaca(String jucarie){
        System.out.println("Cainele se joaca cu: "+jucarie+"");
    }
}
