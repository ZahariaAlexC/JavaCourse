package encapsulation;

import java.lang.annotation.ElementType;
import java.sql.SQLOutput;
import java.util.*;

public class CollectionsExercises {

    public static void main(String[] args) {
//        List<String> elements = new ArrayList<>();
//        Scanner scanner =  new Scanner(System.in);
//        for(int i = 0; i<10;i++){
//            elements.add(scanner.nextLine());
//        }
//
//        System.out.println(Arrays.toString(elements.toArray()));
//
//        elements.add(6, "Sorina");
//        System.out.println(Arrays.toString(elements.toArray()));
//        elements.set(6, "alexandra");
//        System.out.println("List: "+ Arrays.toString(elements.toArray()));
//
//        ArrayList<String> values = new ArrayList<>(elements);
//        values.addAll(elements);
//
//        for(String value : elements){
//            values.add(value);
//        }
//
//        for(int i =0 ; i<elements.size();i++){
//            values.add(elements.get(i));
//        }
//        System.out.println("arrayList : " + Arrays.toString(values.toArray()));



        Map<String, Integer> masini = new HashMap<>();
        masini.put("Dacia", 2021);
        masini.put("BMW",1998);
        masini.put("Audi", 2004);

        System.out.println("map: " + masini.get("Dacia"));


        masini.put("Dacia", masini.get("Dacia") + 23);

        System.out.println("map:" + masini.get("Dacia"));

        List<Integer> a = new ArrayList<>();
        int[] numere = {1,2,3,4,5};

        for(int i = 0; i<numere.length;i++){
            a.add(numere[i]);
        }


        int suma = a.get(2) + a.get(4);
        int sumaPrimara = a.get(1) + 23;
        int z = a.get(4) + numere[3];
        System.out.println(a.get(0).equals(numere[0]));
        System.out.println(suma + "-" + sumaPrimara + "-" + z);







    }
}
