package day15_String_Intro;

public class SubstringPractice {

    public static void main(String[] args) {

        String sentence = "My favourite TV series is The Walking Dead";
        String tvSeries = sentence.substring(26);

        System.out.println("tvSeries = " + tvSeries);

        String sentence2 = "Java is a fun language";
        String s1  = sentence2.substring(10,13);//fun
        String s2 = sentence2.substring(14);//language

        System.out.println(s1);
        System.out.println(s2);


    }


}
