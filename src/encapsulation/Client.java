package encapsulation;

public class Client {

    public static void main(String[] args) {
       Cont popescu = new Cont();
       popescu.contBancar = 1100;
       popescu.depunere(1000);
        System.out.println(popescu.getContBancar());
        popescu.retragereNumerar(1000);
        System.out.println(popescu.getContBancar());
        popescu.retragereNumerar(100);
        System.out.println(popescu.getContBancar());

        popescu.depunere(2000);
        System.out.println(popescu.getContBancar());
        popescu.retragereNumerar(200);
        System.out.println(popescu.getContBancar());


    }
}
