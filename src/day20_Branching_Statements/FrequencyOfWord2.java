package day20_Branching_Statements;

public class FrequencyOfWord2 {
    public static void main(String[] args) {

        String sentence = "I love books, I purchased a lot of books books books books books";
        String word = "book";

        int count = 0;

        for (int i = 0; i <= sentence.length()-word.length(); i++) {
            String word1 = sentence.substring(i,i+word.length());
            if (word1.equals(word)){
                count++;
            }
        }
        System.out.println(count);

    }
}
