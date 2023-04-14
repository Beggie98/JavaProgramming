package day20_Branching_Statements;



public class FrequencyOfAWord {
    public static void main(String[] args) {
        String sentence = "Java Java Java";
        int count = 0;
/*
        String str1 = sentence.substring(0,4);//"Java"
        String str2 = sentence.substring(1,5);//"ava "
        String str3 = sentence.substring(2,6);//"va J"
        String str4 = sentence.substring(3,7);//"a Ja"
 */
        for (int i = 0; i <= sentence.length()-4; i++ ){
            String word = sentence.substring(i,i+4);//represents each 4 characters

            if (word.equals("Java")){
                count++;
            }
        }
        System.out.println("count = " + count);


    }
}
