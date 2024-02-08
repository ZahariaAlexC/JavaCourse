package BigExercises.inheritance;

public class Animal {
    private String specie;

    public Animal(){
    }
    public Animal(String specie){
        this.specie = specie;
    }

    public String getSpecie() {
        return specie;
    }

    public void setSpecie(String specie) {
        this.specie = specie;
    }

    public void mananca(){
        System.out.println("Animalul mananca ce vaneaza");
    }

    public void merge(){
        System.out.println("Animalul merge pe camp");
    }
}
