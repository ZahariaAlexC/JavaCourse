package BigExercises.recapitularegrpixxel;

import java.util.Arrays;

public class ArrayAndStrings {
    //initializarea directa a unui array unidimensional
    String[] fructe = {"Mere", "Pere", "Prune", "Cirese", "Visine", "Porumb"};
    //initializarea unui array adaugand dimensiunea lui si dupa se populeaza array ul cu val specifice
    String[] fructeExotice = new String[5];
    // se populeaza array-ul  prin compararea celor doua arrray uri de mai sus
    String[] fructeMixte;

    String[][] fructeVara =  new String[7][7];

    // popularea array ului fructeExotice
    public void fructeExotice(){
        fructeExotice[0] = "Ananas";
        fructeExotice[1] = "kiwi";
        fructeExotice[2] = "Avocado";
        fructeExotice[3] = "Portocale";
        fructeExotice[4] = "banane";
    }

    // popularea array-ului fructe mixte prin comparea celor 2 array-uri de mai sus
    public void fructeV2Loop(){
        if(fructeExotice.length == fructe.length){
            fructeMixte = new String[fructeExotice.length];
            for(int i = 0; i< fructeExotice.length;i++){
                if(i%2 == 0){
                    fructeMixte[i] = fructeExotice[i];
                }else {
                    fructeMixte[i] = fructe[i];
                }
            }
        }
        System.out.println(Arrays.toString(fructeMixte));
    }

    // popularea array ului fructe mixte fara verifcarea lungimii celor 2 array-uri
    public void fructeV3loop(){
        fructeMixte = new String[5];
        for(int i = 0; i< fructe.length;i++){
            if(i%2 == 0){
                fructeMixte[i] = fructeExotice[i];
            }else {
                fructeMixte[i] = fructe[i];
            }
        }
        System.out.println(Arrays.toString(fructeMixte));
    }

    /* adaugarea elementelor din array ul fructe in array ul fructe mixte cu
    cu ajutorul foreach ului dar initializand si o valoare bde contor pentru indexi
     */
    public void fructeV4loop(){
        int i = 0;
        fructeMixte = new String[fructe.length];
        for(String val : fructe){
            fructeMixte[i] = val;
            i++;
        }
        System.out.println("fructe mixte : " + Arrays.toString(fructeMixte));
    }

    // parcurgerea unui array cu functia stream si conditionarea lui
    public void variantaStreamLoop(){
        fructeMixte = new String[fructe.length];
        Arrays.stream(fructe).forEach(element ->{
                    if(element.equals("Porumb")){
                        System.out.println(element);
                    }
                }
        );
    }

    //pupularea unui array 2D sau parcurgerea lui cu ajutorul for ului in for
    public void populareArrayFructeVara(){

        for(int i = 0; i< fructeVara.length;i++){
            System.out.println("\n");
            for(int j = 0; j< fructeVara[i].length;j++){
                if(i % 2 ==0 && j % 2 == 0){
                    fructeVara[i][j] = "Banane";
                }else {
                    fructeVara[i][j] = "Portocale";
                }
                System.out.print(fructeVara[i][j] + " ");
            }
        }
        /*afisarea referintelor dintr-un array multidimensional
        si cu aceste referinte poti ajunge la informatia din memorie
         */
        for (String[] strings : fructeVara) {
            System.out.println(strings);
        }

        // afisarea elementelor dintr-un arrau 2D pe linie si coloana
        System.out.println(Arrays.deepToString(fructeVara));
    }


    public static void main(String[] args) {
        ArrayAndStrings arrayAndStrings = new ArrayAndStrings();
        arrayAndStrings.fructeExotice();
        arrayAndStrings.fructeV2Loop();
//        arrayAndStrings.fructeV3loop();
        arrayAndStrings.fructeV4loop();
        arrayAndStrings.variantaStreamLoop();
        arrayAndStrings.populareArrayFructeVara();
    }
}
