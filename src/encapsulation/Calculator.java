package encapsulation;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Sa calculam niste numere!");
        System.out.println("Introduceti primul numar fractionar:");

        Scanner scanner= new Scanner(System.in);
        double numar1= scanner.nextDouble();

        System.out.println("Introduceti al doilea numar fractional:");
        double numar2=scanner.nextDouble();

        double rezultatInmultire = inmultire(numar1, numar2);
        double rezultatAdunare = adunare(numar1, numar2);
        double rezultatScadere = scadere(numar1, numar2);
        double rezultatImpartire = impartire(numar1, numar2);
        double rezultatModulo = modulo(numar1, numar2);

        double random = genereazaNumarRandom(rezultatScadere, rezultatInmultire );

        System.out.println("Rezultatul inmultirii este " + rezultatInmultire);
        System.out.println("Rezultatul adunarii este: " + rezultatAdunare);
        System.out.println("Rezultatul scaderii este: " + rezultatScadere);
        System.out.println("Rezultatul impartirii este: " + rezultatImpartire);
        System.out.println("Rezultat modulo este: " + rezultatModulo);
        System.out.println("Rezultat random generat intre " + rezultatScadere + " si " + rezultatInmultire + " este: " + random);
    }

    public static double inmultire(double numar1, double numar2){
        double rezultat = numar1 * numar2;
        return rezultat;
    }

    public static Double adunare(double numar1, double numar2){
        double rezultat = numar1 + numar2;
        return rezultat;
    }

    public static double scadere( Double numar1, Double numar2){
        Double rezultat= numar1 - numar2;
        return rezultat;
    }

    public static Double impartire ( Double numar1, double numar2){
       return numar1/numar2;
    }

    public static double modulo (double numar1, double numar2){
        return numar1%numar2;
    }

    public static double genereazaNumarRandom(double minim, double maxim){
        return Math.random ()*(maxim-minim)+minim;
    }
}
