package JavaTheory.VariablesOperators;

public class Persoana {
    //variabile globale/variabile de instanta/ atribute ale clasei
    public String nume;
    public String prenume;
    public String cnp;
    public int varsta;


    public Persoana(String nume, String prenume){
        this.nume = nume;
        this.prenume = prenume;
    }

    public Persoana(String nume, String prenume, String cnp){
        this.nume = nume;
        this.prenume = prenume;
        this.cnp =cnp;
        varsta = 33;
    }

    public Persoana(){
        nume = "Cosmin";
        prenume = "Coman";
        cnp = "34567898765432";
        varsta = 23;
    }



    public void nume(String nume, String gender){
        this.nume = nume;
        System.out.println(this.nume);
    }

    public void prenume(String prenume){
        this.prenume = prenume;
        System.out.println(this.prenume);
    }

    public void cnp(String cnp){
        this.cnp = cnp;
        System.out.println(this.cnp);
    }

    public void varsta(int varsta){
        this.varsta = varsta;
        System.out.println(this.varsta);
    }


//    public static void main(String[] args) {
//        Persoana p1 = new Persoana();
//        System.out.println(p1.nume);
//        p1.nume("Gigel", "jh dvb bndchj");
//        p1.prenume("popescu");
//        p1.cnp("1234567890");
//        p1.varsta(33);
//
//        Persoana p2 = new Persoana();
//        System.out.println("ref obiect p2: " + p2
//        + " "+p2.nume+" + "+p2.prenume+" + "+p2.varsta+" + "+p2.cnp+"");
//
//        Persoana p3 =  new Persoana("Popescu", "Ionel");
//        p3.nume("c3456789","kfjvhjdf");
//
//    }


}
