package BigExercises;

public class ScrabbleScore {
    private String value;
    private int score;

    public ScrabbleScore(String word) {
        this.value= word;
    }

    public static void main(String[] args) {
        ScrabbleScore score = new ScrabbleScore("abcdefghijklmnopqrstuvwxyz");
        System.out.println(score.getScore());
    }

    public int getScore() {
        int suma = 0;
        for(int i = 0;i<value.length();i++){
            suma = suma + returnNumber(String.valueOf(value.charAt(i)).toUpperCase());
        }
        return suma;
    }

    public int returnNumber(String value) {
        switch (value) {
            case "A":
            case "E":
            case "I":
            case "O":
            case "U":
            case "L":
            case "N":
            case "R":
            case "S":
            case "T":
                return 1;
            case "D":
            case "G":
                return 2;
            case "B":
            case "C":
            case "M":
            case "P":
                return 3;
            case "F":
            case "H":
            case "V":
            case "W":
            case "Y":
                return 4;
            case "K":
                return 5;
            case "J":
            case "X":
                return 8;
            case "Q":
            case "Z":
                return 10;

            default:
                return -1;
        }
    }
}
