package euthware;

public class Runner {
    int x = 5;
    int getX() {
        return x;
    }

    public static void main(String[] args) {
//        Movable m = new Donkey();
//        Donkey d = (Donkey) m;
//        Donkey don = new Donkey();
//        d.move(10);
//        d.moveBack(20);
//        System.out.println(d.location);

        Base b = new Base2();
        Base c = new Base();
        System.out.println(b.getValue() + " " +  c.getValue());

//        char c;
//        final  int i = 4;
//        c = 'a';
//        //i = c;
//        //i++;
//        c = i;
//        c++;


//        String myStr = "good";
//        char[] myCharArr = {'g', 'o', 'o', 'd' };
//        String newStr = "";
//        for(char ch : myCharArr){
//            newStr = newStr + ch;
//        }
//
//        System.out.println((newStr.intern() == myStr)+ " " + (newStr.equals(myStr)));

//        Runner run = new Runner();
//        run.looper();
//        System.out.println(run.x);
//
//
//    }
//    public void looper() {
//        int x = 0;
//        while((x = getX()) != 0){
//            for(int m = 10; m>=0;m--){
//                x = m;
//            }
//        }
    }

}
