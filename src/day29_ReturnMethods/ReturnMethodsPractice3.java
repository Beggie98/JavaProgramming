package day29_ReturnMethods;

public class ReturnMethodsPractice3 {
    public static void main(String[] args) {
        String str = "AAABBBCCCC";
        System.out.println(removeDuplicates(str));
    }

    public static String removeDuplicates(String str){
        String result = "";

        for (String each : str.split("")){//{"A", "A"....."C"}
            if (!result.contains(each)){
                result+=each;
            }
        }

        return result;
    }

    /*
    "AAAABBBBBBBCCCCCCCCC"
    "ABC"
     */
}
