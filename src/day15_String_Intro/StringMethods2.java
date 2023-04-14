package day15_String_Intro;

public class StringMethods2 {
    public static void main(String[] args) {
        /*
        String "Java Programming Language"
        Substring "Java"

        substring(beginning index, ending index) - creates substring of the string from beginning index to ending index

         */
        String sentence = "Java Programming Language";
        //index:           0123456789101112
        String name = sentence.substring(0,3);//Jav
        String name1 = sentence.substring(0,3+1);//Java
        //substring range excludes the ending index
        System.out.println(name);
        System.out.println(name1);

        String s2 = "Cybertek School";
        //           012345678910

        String name2 = s2.substring(0,8);//7+1
        System.out.println(name2);

        //String name3 = s2.substring(9,15);
        String name3 = s2.substring(9);//substring(beginning index:) - it will create substring till the end by default == "School"
        System.out.println(name3);


        System.out.println("----------------------------");

        String sentence2 = "Java is a programming language";
        //index:            012345678910
        String name4 = sentence2.substring(10);
        System.out.println("name4 = " + name4);

        String name5 = sentence2.substring(10,21);
        System.out.println("name5 = " + name5);


        System.out.println("-----------------------------------");
        //replace() => replace(old value, new value) - replaces an old value with the new value
        // and returns a new String


        String sentence3 = "Python is an easy language";
        sentence3 = sentence3.replace("Python", "Java");//Java is an easy language

        System.out.println(sentence3);

        String sentence4 = "C# is a programming language, I like learning C#, C# is the best";
        sentence4 = sentence4.replace("C#", "Java");

        System.out.println(sentence4);

        String sentence5 = "Dog is friendly, Dog is loyal, I love Dogs";
        sentence5 = sentence5.replace("Dog", "Cat");

        System.out.println(sentence5);

        System.out.println("--------------------------------------");

        String str = "Batch 23";
        //index:      01234567

        char ch1 = str.charAt(6);
        System.out.println("ch1 = " + ch1);

        System.out.println(str.length());

        str = str.toUpperCase();

        System.out.println(str);

        str = str.toLowerCase();

        System.out.println(str);

        String str2 = "Cybertek is a great school";
        String s4 = str2.substring(14,19);

        System.out.println(s4);

    }
}
