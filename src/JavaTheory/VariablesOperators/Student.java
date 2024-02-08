package JavaTheory.VariablesOperators;

public class Student {
    public String nume;
    public String prenume;
    public String cnp;

    public String returnNume(String nume){
        return nume;
    }

    public Persoana createPersoana(){
        return new Persoana();
    }


    public void fillOutAttributes(){
        this.nume = createPersoana().nume;
        this.prenume = createPersoana().prenume;
        this.cnp = createPersoana().cnp;

        System.out.println("nume student: " + nume + " prenume student: "
                + prenume + " cnp student: " + cnp);
    }


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.fillOutAttributes();
        s1.returnNume("Soricel");
        Persoana p2 = new Persoana();
        System.out.println(" "+p2.nume+" + "+p2.prenume+" + "+p2.varsta+" + "+p2.cnp+"");
    }
}
