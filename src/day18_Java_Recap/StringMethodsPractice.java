package day18_Java_Recap;

public class StringMethodsPractice {
    public static void main(String[] args) {
        String str = "abcd";
        int indexOfK = str.indexOf("k");

        System.out.println(indexOfK);

        if (indexOfK >= 0){
            System.out.println("the string has character k");
        }else {
            System.out.println("the string doesn't have character k");
        }

        System.out.println("------------------------------------------------");

        String sentence = "I like to learn C#, C# is cool";
        // verify if tge sentence has "Java", not using contains()

        if (sentence.indexOf("Java") >= 0){
            System.out.println("sentence has java");
        }else{
            System.out.println("sentence does not have java");
        }

        System.out.println("------------------------------------------");

        String sentence1 = "I love Java, Java is cool";
        //                         7     13
        boolean isUnique = sentence1.indexOf("Java") == sentence1.lastIndexOf("Java");
                            //              7               13       ==> false

        System.out.println("------------------------------------");
        String schoolName = "Cybertek School";
        String name = schoolName.substring(0,schoolName.indexOf(" "));

        System.out.println(name);

        String sentence2 = "I live in Virginia, I go to Cybertek School";
        String name2 = sentence2.substring(sentence2.indexOf("C"), sentence2.lastIndexOf(" "));

        System.out.println("name2 = " + name2);

        System.out.println("------------------------------------------------");

        String str2 = "Dog Cat Dog Cat";
        str2 = str2.replace("Cat","Dog");

        System.out.println("str2 = " + str2);

        str2 = str2.replaceFirst("Dog", "Cat");
        System.out.println(str2);

        String sentence3 = "Java Java Java";
        //sentence3 = sentence3.replaceFirst("Java", "C#").replaceFirst("Java", "Python");//C# Python Java

        sentence3 = sentence3.replace("Java Java ", "C# Python");
        System.out.println(sentence3);

        System.out.println("-----------------------------------------");

        System.out.println("Yes".equals("yes"));//false
        System.out.println("Yes".equalsIgnoreCase("yes"));//true




    }
}
