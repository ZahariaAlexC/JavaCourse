package BigExercises.recapitularegrpixxel.mostenire;

public class Constructori {
    public int a;
    public int b;
    public String c;

    public Constructori(){
        this.a = 100;
        this.b  = 200;
        this.c = "Ana are mere";
    }

    public Constructori(int a){
        this.a = a;
        this.b  =20;
        this.c = "Ana ";
    }

    public Constructori(int a, int b, String c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Constructori(int a, int b){
        this(a);
        this.b = b;
        this.c = "Ana are";
    }


    public static void main(String[] args) {
        Constructori constructori = new Constructori();
        Constructori constructori1 = new Constructori(12);
        Constructori constructori2 = new Constructori(100, 25);
        Constructori constructori3 =  new Constructori(25, 35, "popescu");

        System.out.println(constructori1.a);
        System.out.println(constructori2.a);
        System.out.println(constructori3.a);
    }

}
