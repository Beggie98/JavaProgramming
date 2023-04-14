package day14_Java_Recap;

public class CharVariable {
/*
Given a  char variable determine if the character is letter or digit or special character.
            Ex: 'b'  --> letter
                '9'  --> digit
                '!'  --> special character
 */
    public static void main(String[] args) {

        char ch = '0';
        //                ch >= '0' && ch <= '9'
        boolean isDigit = ch >= 48 && ch <= 57;//0 ~ 9
        boolean isLetter = (ch >= 65 && ch <=90) || (ch >= 97 && ch <= 122);//if the character is uppercase or lowercase
        //                ch >= 'A' && ch <= 'Z' ||  ch >= 'a' && ch <= 'z'
//        String result = "";
//        if (isDigit){
//            result = ch + "is digit";
//        }else if (isLetter){
//            result = ch + "is letter";
//        }else{
//            result = ch + "is special character";
//        }
        String result = isDigit? "digit" :(isLetter)? "Letter" : "Special character";
        System.out.println(result);


    }


}
