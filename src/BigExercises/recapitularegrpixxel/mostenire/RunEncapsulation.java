package BigExercises.recapitularegrpixxel.mostenire;

public class RunEncapsulation {

    public static void main(String[] args) {
        Encapsulation encapsulation = new Encapsulation("Popescu", "iulian", "12345678", 23);
        encapsulation.datePersoana();
        encapsulation.displayNume();
        encapsulation.setNume("Gigel");
        encapsulation.displayNume();
        System.out.println(encapsulation.getCnp());
        encapsulation.setPrenume("Mirel");
        encapsulation.datePersoana();


    }
}
