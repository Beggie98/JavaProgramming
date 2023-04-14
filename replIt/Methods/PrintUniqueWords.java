package Methods;

public class PrintUniqueWords {
    public static void main(String[] args) {
        String[] array = {"java", "code", "python", "code", "rust", "code", "rust"};

        printUniqueWords(array);

    }

    public static void printUniqueWords(String[] array){
        for (int i = 0; i < array.length; i++) {
            int count = 0;
            String word = array[i];
            for (int j = 0; j < array.length; j++) {
                String each = array[j];
                if (each.equals(word)){
                    count++;
                }
            }
            if (count==1){
                System.out.println(word);
            }
        }
    }


}
