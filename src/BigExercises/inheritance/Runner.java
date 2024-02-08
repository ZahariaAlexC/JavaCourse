package BigExercises.inheritance;

public class Runner {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.mananca();

        Animal a1 = new Caine("ciobanesc", "cainel de talie mare");
        System.out.println(a1.getSpecie());

        Caine caine1 = new Caine("ciobanesc", "cainel de talie mare");
        System.out.println(caine1.getRasa());

        Animal a2 = new Caine("Mioritic", "cainel de talie mare");
        System.out.println(a1.getSpecie());

        Caine caine2 = (Caine) a2;
        caine2.latra();
        ((Caine) a2).seJoaca("cu mingea");
        System.out.println(caine2.getRasa());
        Animal a3 = new Caine("Ciobanesc german", "talie medie");
        ((Caine) a3).latra();
        System.out.println(((Caine) a3).getRasa());


        Sarpe s1 = new Sarpe("sarpe boa", "gri");
        s1.merge();

        Animal a4 = new Sarpe("sarpe de casa", "verde");
        Sarpe s2 = (Sarpe) a4;
        ((Sarpe) a4).merge();
        s2.merge();


        Caine caine5 = new Caine("", "");
        caine5.getSpecie();

        Animal a6 = new Sarpe("", "");

        AbstractImplementation abstractMethods = new AbstractImplementation();
        abstractMethods.afisareMesaj();
        abstractMethods.display();
        abstractMethods.returnBoolean();





    }
}
