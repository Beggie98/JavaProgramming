package Methods;

public class getDuplicates {
    public static void main(String[] args) {
        String[] array = {"1","1","2","2","b","b"};
        System.out.println(getDuplicates(array));
    }
    
    public static int getDuplicates(String[] array){

        int countDup = 0;
        for (int i = 0; i < array.length; i++) {
            int count=0;
            String each = array[i];
            for (int j = 0; j < array.length; j++) {
                String each1 = array[j];
                if (each1.equals(each)){
                    count++;
                }
            }
            if (count>1) {
                countDup++;
            }
        }
        return countDup;
    }
    
}
