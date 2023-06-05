package BigExercises;

public class ReverseSentence {

    public void reverseSentence(String sentence){
        String[] words = sentence.split(" ");

        for(int i = words.length-1; i>=0; i--){
            System.out.print(words[i] + " ");
        }
    }

    public static void main(String[] args) {
        ReverseSentence sentence = new ReverseSentence();
        sentence.reverseSentence("I like QA automation");
    }
}
