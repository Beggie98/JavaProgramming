package day27_Recap;

public class FirstUniqueCharacter {
    public static void main(String[] args) {
        String str = "aaa abbbccc ddef ggggh";
        /*
        for (char each : str.replace(" ","").toCharArray()){//each represents each character of str array
                if (str.indexOf(each) == str.lastIndexOf(each)){//if the character's first and last index numbers are same, then it is unique
                    System.out.println(each);
                    break;
                }
            }

         */




        for (int i = 0; i < str.length();i++){
            char character = str.replace(" ", "").charAt(i);
            int frequency = 0;
            for (int j = 0; j < str.length(); j++) {
                char each = str.replace(" ", "").charAt(j);
                if (character == each){
                    frequency++;
                }
            }
            if (frequency == 1){
                System.out.println(character);
                break;
            }
        }




    }
}
