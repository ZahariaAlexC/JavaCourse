package JavaTheory.VariablesOperators;

public class TempAmbientala {
    public Persoana persoana;

    int umiditate;
    int temp;
    int aer;
    int sol;

    public TempAmbientala(){
        persoana = new Persoana();
    }

    public TempAmbientala(int umiditate, int aer){
        this.umiditate = umiditate;
        this.aer = aer;
    }


    public TempAmbientala(double sol, double temp){
        this();
        this.temp = (int) temp;
        this.sol = (int) sol;
    }



    public int temperatura(){
        return (aer + umiditate);
    }

    public int getUmiditate(){
        this.temperatura();
        temperatura();
        System.out.println(" "+persoana.nume+" + "+persoana.prenume+" + "+persoana.varsta+" + "+persoana.cnp+"");
        return (sol + temp);
    }


    public static void main(String[] args) {
        TempAmbientala t1 = new TempAmbientala();
        System.out.println("pentru obiectul  t1: " + t1.temp + "--" + t1.sol + "--"
        + t1.aer + "---" + t1.umiditate);

        TempAmbientala t2 = new TempAmbientala(10, 39);
        System.out.println("pentru obiectul  t2: " +t2.temp + "--" + t2.sol + "--"
                + t2.aer + "---" + t2.umiditate);
        System.out.println("val temperatura: " + t2.temperatura());


        TempAmbientala t3 = new TempAmbientala(12.2, 7678.9);
        System.out.println("pentru obiectul  t3: " +t3.temp + "--" + t3.sol + "--"
                + t3.aer + "---" + t3.umiditate);
        System.out.println("val umiditatea: " + t3.getUmiditate());

    }

}
