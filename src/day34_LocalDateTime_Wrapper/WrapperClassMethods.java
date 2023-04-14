package day34_LocalDateTime_Wrapper;

public class WrapperClassMethods {
    public static void main(String[] args) {
        //parse() - converting String to primitives, returns primitive

        String str = "123";
        int num = Integer.parseInt(str);//convert "123" string to 123 integer

        //valueOf() - converting String to wrapper class, returns wrapper class

        int num1 = Integer.valueOf(str);//Integer wrapper class - unboxing

        System.out.println(num - 1);//122
        System.out.println(num1 - 1);//122

        Integer num2 = Integer.parseInt(str);//autoboxing
        //              int primitive

        int num3 = Integer.parseInt(str);
        //           int primitive

        Integer num4 = Integer.valueOf(str);
        //              wrapper class

        String str2 = "true";

        boolean r1 = Boolean.parseBoolean(str2);
        //           primitive

        boolean r2 = Boolean.valueOf(str2);//unboxing
        //           wrapper

        Boolean r3 = Boolean.parseBoolean(str2);//autoboxing
        //           primitive

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);

        String str3 = "2.5";

        double d1 = Double.parseDouble(str3);

        System.out.println("--------------------------------------");


        char ch = '4';
        boolean isDigit = Character.isDigit(ch);
        boolean isLetter = Character.isLetter(ch);
        boolean isSpecialChar = !Character.isLetterOrDigit(ch);
        System.out.println("isDigit = " + isDigit);
        System.out.println("isLetter = " + isLetter);
        System.out.println("isSpecialChar = " + isSpecialChar);

        System.out.println("-------------------------------------");

        String s = "a1b2c3";
        int sum = 0;
        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)){
               sum += Integer.parseInt("" + each);
            }
        }

        System.out.println("sum = " + sum);

        System.out.println("-----------------------------------------------");

        String s2 = "AAABBBBCCCCCCCCC!@#$##$%^&^%15278456";

        String letters = "",
                digits = "",
                specialChars = "";

        for (char each : s2.toCharArray()) {

            if (Character.isDigit(each)){
                digits += each;
            }else if (Character.isLetter(each)){
                letters += each;
            }else {
                specialChars += each;
            }

        }
        System.out.println("letters = " + letters);
        System.out.println("digits = " + digits);
        System.out.println("specialChars = " + specialChars);

    }
}
