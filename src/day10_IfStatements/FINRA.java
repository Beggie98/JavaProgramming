package day10_IfStatements;

public class FINRA {

    public static void main(String[] args) {

        int number = 15;
        String result = "";

        if (number%3 == 0 && number%5 == 0){
            result = "FINRA";
        }else if (number%3==0){
            result = "FIN";
        }else if (number%5 == 0){
            result = "RA";
        }else {
            result = "" + number;//"15"
        }

        System.out.println(result);



    }


}
