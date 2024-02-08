package BigExercises.inheritance;

public class AbstractImplementation extends AbstractMethods {
    @Override
    public void display() {
        System.out.println("overrride din clasa abstracta");
    }

    @Override
    public boolean returnBoolean() {
        afisareMesaj();
        System.out.printf("metoda face override din clasa abstracta");
        return true;
    }
}
