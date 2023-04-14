package day30_Recap;

public class LoopsReview {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        System.out.println("-------------------------");
        String str = "Java";

        for (int i = 0; i < 4; i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
        System.out.println("-----------------------------------------");

        for (int i = 1, ch=65; i <= 26 ; i++, ch++) {
            System.out.println(i + ". " + (char)ch);
        }
        System.out.println("----------------------------------");

        for (int i = 26, ch = 90; i >=1 ; i--,ch--) {
            System.out.println(i + ". " + (char)ch);
        }
        System.out.println("------------------------------------");

        for (char i = 'A', ch = 'a'; i <= 'Z' ; i++,ch++) {
            System.out.println(i + " - " + ch);
        }

        System.out.println("-------------------------------------------");

        String word = "level";
        String reverse = "";

        for (int i = word.length()-1; i >= 0; i--) {
            reverse += word.charAt(i);
        }

        boolean isPalindrome = reverse.equalsIgnoreCase(word);

        System.out.println("Palindrome: " + isPalindrome);

    }
}
