package day19_Loops;

public class OddAndEven {
    public static void main(String[] args) {
        String result = "";
        for (int i = 1; i <=32; i++){
            if (i%2==0){
                result += i + " ";
            }
        }
        System.out.print(result);
    }
}
