package day34_LocalDateTime_Wrapper;

public class WrapperClassIntro {
    public static void main(String[] args) {
        short s = 10;
        int num = 10;
        //Integer num2 = s; //Integer wrapper class only accepts int primitive
        Integer num2 = (int)s;//Autoboxing: converting primitive value to wrapper class value

        char ch = '@';
        Character ch2 = (Character) ch;//implicitly casted: Autoboxing

        Byte b1 = 10;
        byte b2 = b1;// unboxing: converting wrapper class to primitive value
        short b3 = b1;
        int b4 = b1;
        long b5 = b1;
        float b6 = b1;
        double b7 = b1;

        System.out.println("-------------------------------------------");

        byte c1 = 10;
        Byte c2 = c1;//Autoboxing : wrapper class only accepts its own primitive
        //Short c3 = c1;//Short wrapper class only accepts Short primitive
        //Integer c4 = c1;//Integer wrapper class only accepts int primitive
        //Long c5 = c1;//Long wrapper class only accepts long primitive
        //Float c6 = c1;//Float wrapper class only accepts float primitive
        //Double c7 = c1;//Double wrapper class only accepts float primitive
    }
}
