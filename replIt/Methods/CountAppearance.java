package Methods;

public class CountAppearance {
    public static void main(String[] args) {
        String[] array = {"a","foo","bar","foo","bla"};
        System.out.println(countAppearance(array, "foo"));

    }

    public static int countAppearance(String[] array, String str){
        int count=0;

        for (int i = 0; i < array.length; i++) {
            String each = array[i];
            if (each == str){
                count++;
            }
        }

        return count;

    }


}
