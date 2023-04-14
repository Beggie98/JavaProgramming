package day19_Loops;

public class UniqueCharacters {
    public static void main(String[] args) {

        String word = "aabcccccdeeeeefggg";
        String result = "";

        for (int i =0; i<word.length();i++){
            if (word.indexOf(word.charAt(i)) == word.lastIndexOf(word.charAt(i))){
                result += word.charAt(i) + " ";
            }
        }
        System.out.println(result);

    }
}
