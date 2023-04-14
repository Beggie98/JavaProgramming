package day16_String_Continue;

public class StringMethods {
    public static void main(String[] args) {
        //replace(old value, new value) - replaces all old values with a new one

        String email = "cybertek@yahoo.com";
        email = email.replace("yahoo", "gmail");//yahoo has been replaced with gmail

        System.out.println(email);

        String sentence = "C# is cool, C# is fun";
        sentence = sentence.replace("C#","Java");//all C# s have been replaced with Java

        System.out.println(sentence);

        //replaceFirst() - replaces first matching string

        sentence = sentence.replaceFirst("C#","Java");

        System.out.println(sentence);//Java is cool, C# is fun

        System.out.println("=======================================");

        String s = "Cat Dog Cat Dog Cat";
        //s = s.replace("Cat", "Dog");

        //System.out.println(s);//Dog Dog Dog Dog Dog

        s = s.replaceFirst("Cat", "Dog");
        System.out.println(s);//Dog Dog Cat Dog Cat
        System.out.println("-----------------------------------------------");

        //indexOf("character"): returns the index number of the first occured character
        String sentence2 = "Java is a cool language";
        int indexOfFirstA = sentence2.indexOf("a");//first a
        int indexOfSecondA = sentence2.indexOf("a ");//second a
        int indexOfThirdA = sentence2.indexOf("a c");//third a
        int indexOfFourthA = sentence2.indexOf("an");//fourth a
        int indexOfFifthA = sentence2.indexOf("ag");//fifth a
        int indexOfLastA = sentence2.lastIndexOf("a");
        //the character should come first while putting it in the indexOf()
        System.out.println(indexOfFirstA);
        System.out.println(indexOfSecondA);
        System.out.println(indexOfThirdA);
        System.out.println(indexOfFourthA);
        System.out.println(indexOfFifthA);
        System.out.println(indexOfLastA);

        System.out.println("---------------------------------------------");
        //isEmpty() - checks if a String is empty or not. returns boolean (true or false)

        String s2 = "Hello";
        boolean r1 = s2.isEmpty();//false
        System.out.println("r1 = " + r1);

        String s3 = "";
        boolean r2 = s3.isEmpty();//true
        System.out.println("r2 = " + r2);
        
        String s4 = "        ";
        boolean r3 = s4.isEmpty();//false
        System.out.println("r3 = " + r3);

        s4 = s4.trim();
        boolean r4 = s4.isEmpty();//true
        System.out.println("r4 = " + r4);

        System.out.println("------------------------------------");
        //equals() or equalsIgnoreCase()
        //equals() - checks if the two string has the same text. returns boolean. case sensitive
        //DO NOT USE == to compare two strings. use equals()


        String str1 = "Cat";//String pool
        String str2 = new String("Cat");//Java Heap
        String str3 = new String("Cat");//Java Heap

        System.out.println(str1 == str2);//false ==> compares location
        System.out.println(str1.equals(str2));//true ==> compares String texts not their memory location
        System.out.println(str3 == str2);//false
        System.out.println(str3.equals(str2));//true

        System.out.println("----------------------------------------");
        //equalsIgnoreCase() - ignores case sensitivity
        String word1 = "Java";
        String word2 = "java";

        System.out.println(word1 == word2);//false: two different objects
        System.out.println(word1.equals(word2));//false: case sensitivity

        System.out.println(word1.equalsIgnoreCase(word2));//true: ignores case sensitivity




    }
}
