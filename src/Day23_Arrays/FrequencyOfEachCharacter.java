package Day23_Arrays;

public class FrequencyOfEachCharacter {
    public static void main(String[] args) {

        String str = "aabccc";

        String removeDup = ""; //abc

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (removeDup.contains(ch + "")) {//if the character is already contained in removeDup
                continue;// skip it
            }
            removeDup += ch;

        }


        String result = "";//a2b1c3
        //a b c
        //2 1 3


        for (int j = 0; j < removeDup.length(); j++) {//0 1 2, outer loop is used for getting each character from the string

            char ch = removeDup.charAt(j);// 'a', 'b', 'c'
            int frequency = 0;//for the frequencies of ch
            for (int i = 0; i < str.length(); i++) {
                char each = str.charAt(i);
                if (each == ch) {
                    frequency++;
                }

            }
            result += "" + ch + frequency;
        }


        System.out.println(result);

    }
}