package day20_Branching_Statements;

public class DogCat {
    public static void main(String[] args) {
        String sentence = "cat dog dog cat dog cat";
        int countCat = 0;
        int countDog = 0;

        for (int i = 0; i <= sentence.length()-3; i++) {
            String word = sentence.substring(i,i+3);
            if (word.equals("cat")){
                countCat++;
            }
            if (word.equals("dog")){
                countDog++;
            }

        }
        boolean sameNumber = countCat == countDog;

        System.out.println("countCat = " + countCat);
        System.out.println("countDog = " + countDog);

        System.out.println(sameNumber);

    }
}
