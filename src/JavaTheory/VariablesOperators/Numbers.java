package JavaTheory.VariablesOperators;

public class Numbers {

    public int z;

    public Numbers(int z){
        this.z = z;
    }

    public static void main(String[] args) {
        Numbers numbers = new Numbers(1);
        int counter = 0;
        int i = 0;
        for(; i<=5;i++){
            if(i % 2 == 0){
                counter++;
                System.out.println("i din if" + i);
            }else {
                System.out.println("i din if" + i);
            }
        }
        System.out.println("i final :" + i);


    }


}
