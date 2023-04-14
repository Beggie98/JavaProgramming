package day30_Recap;

public class LoopsReview3 {
    public static void main(String[] args) {
        String sentence = "I love Java, Java is fun";

        String word = "Java";
        int count = 0;

        while (sentence.contains(word)){
            count++;
            sentence = sentence.replaceFirst(word,"");
        }

        System.out.println(count);
        System.out.println(sentence);

        System.out.println("-----------------------------");

        for (int i = 1; i <= 10 ; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        System.out.println("------------------------------------");

        String str = "aaabccd";

        char ch = 'a';


        for (int i = 0; i <= str.length()-1 ; i++) {
            ch = str.charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == ch){
                    frequency++;
                }
            }
            if (frequency == 1){
                System.out.println(ch);
            }
        }

    }
}
