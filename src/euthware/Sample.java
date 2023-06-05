package euthware;

public class Sample implements Iint {
    public static void main(String[] args) {
        Sample s = new Sample();
        int j = s.theValue;
        int k = Iint.theValue;
        int l = theValue;
        System.out.println(j + "- " + k + " " + l);
    }
}
