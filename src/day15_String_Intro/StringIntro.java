package day15_String_Intro;




public class StringIntro {

    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);

        String str1 = "Cybertek";//String literal ==> Java Heap ==> String Pool
        String str2 = new String("Cybertek");//using new keyword ==> Java Heap

        String s1 = "Cat";
        String s2 = "CAt";
        String s3 = "Cat";// "Cat" , "CAt"

        System.out.println(s1 == s2);//false
        System.out.println(s1 == s3);//true
        System.out.println("------------------------");

        String s4 = new String("Dog");
        String s5 = new String("Dog");
        String s6 = new String("Dog");
        String s7 = s4;

        System.out.println(s4 == s5);//false
        System.out.println(s5 == s6);//false
        System.out.println(s7 == s4);//true

    }

}
