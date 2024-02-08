package BigExercises.recapitularegrpixxel;

import static BigExercises.recapitularegrpixxel.StaticMethods_Variables.*;

public class Variables {
    int a = 5;
    int b = 10;

    public void suma(int c ,  int d){
        int a = c;
        int b = d;
        System.out.println("suma dintre a si b = " + (a+b));
        System.out.println("suma din var de instanta = " + (this.a + b));

        //Varianta 1 cu i initializat in for
        for(int i = 0;i<5;i++){
            System.out.println("val lui i in interiorul for -ului versiunea 1 = " + i);
        }

        //Varianta 2 cu i initializat inafara for-ului
        int i = 0;
        for(;i<5;i++){
            System.out.println("val lui i in interiorul for -ului versiunea 2 = " + i);
        }
        System.out.println("val lui i in exteriorul for -ului versiunea 2 = " + i);

        //Varianta 3 cu i declarat inafara for-ului si initializat in for
        int j;
        for(j = 0;j<5;j++){
            System.out.println("val lui j in interiorul for -ului versiunea 3 = " + j);
        }
        System.out.println("val lui j in exteriorul for -ului versiunea 3 = " + j);
    }

    public static void main(String[] args) {
        Variables variables =  new Variables();
        variables.suma(100, 1);
        System.out.println(returnNewValuestaticMethod("Alex din alta clasa") + d + c);
    }
}
