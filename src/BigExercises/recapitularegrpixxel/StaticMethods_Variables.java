package BigExercises.recapitularegrpixxel;

public class StaticMethods_Variables {
    int a = 10;
    public static int d = 100;
    public static String c = "Alex";

    public void displayAttributes(){
        System.out.println(a + " - " + d + " - " + c);
    }



    public static String returnNewValuestaticMethod(String val){
        return val + " ce mai faci";
    }

    public String returnNewValueNonStaticMethod(String val){
        return val + "am inceput cursul de QA automation";
    }


    public static void main(String[] args) {
        StaticMethods_Variables v1 = new StaticMethods_Variables();
        StaticMethods_Variables v2 = new StaticMethods_Variables();
        StaticMethods_Variables v3 = new StaticMethods_Variables();

        /* variabila a va fi clonata in memorie pentru fiecare obiect in parte si variabile
        a va fi independenta fata de celelalte obiecte
        v1.a != v2.a daca v1 ii schimba val lui a si se aplica aceiasi logica si pentru noile
        obiecte create.
        */

        System.out.println(v1.a);
        System.out.println(v2.a);
        System.out.println(v3.a);

        System.out.println(d);
        // ii schimbam val variabilei statice b cu 200 si va fi vizibila pentru orice obiect
        d = 200;
        System.out.println(d);
        System.out.println(c);
        // ii schimbam val variabilei statice b cu 200 si va fi vizibila pentru orice obiect
        c = "Popescu";
        System.out.println(c);

        /*
        noua val pentru var a va fi vizibila doar pentru obiect respectiv adica
        v1 are acces doar la var a din memorie specifica obiectului creat si acelasi lucru se
        intampla si penbtru celelalte obiecte  create.
         */
        v1.a = 25;
        v1.displayAttributes();
        v2.a = 3000;
        v2.displayAttributes();
        v3.a = 10000;
        v3.displayAttributes();


        System.out.println(v1.returnNewValueNonStaticMethod("Azi"));
        System.out.println(StaticMethods_Variables.returnNewValuestaticMethod("Alex"));
        System.out.println(returnNewValuestaticMethod("Popescu"));

    }
}
