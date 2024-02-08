package BigExercises.recapitularegrpixxel.abstractizare;

import java.sql.SQLOutput;

public class Catel extends AbstractClass implements InterfaceClass {
    @Override
    public void displayNumber() {
        System.out.println("varsta este : 20");
    }

    @Override
    public void numeFamilie() {
        System.out.println("Ciobanesc Mioritic");
    }

    @Override
    public void mananca() {
        System.out.println("cainele mananca foarte mult");

    }

    @Override
    public void canta() {
        System.out.println("nu este cazul, este caine nu pasare");
    }

    @Override
    public void seJoaca(String who) {
        System.out.println("cainele cu numele "+who+" se joaca afara");

    }
}
