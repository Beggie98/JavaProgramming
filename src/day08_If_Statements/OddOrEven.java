package day08_If_Statements;

public class OddOrEven {

    public static void main(String[] args) {

        int num = 10;
        boolean isEven = num % 2 == 0;
        boolean isOdd = num % 2 != 0;

        if (isEven){
            System.out.println(num + " is an even number");
        }
        if (isOdd){//or if(!isEven){}
            System.out.println(num + " is an odd number");
        }




    }


}
