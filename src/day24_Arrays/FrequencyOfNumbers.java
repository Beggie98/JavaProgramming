package day24_Arrays;

public class FrequencyOfNumbers {
    /*
    write a program that can print out the unique numbers from an array of integers
        Ex:
            int[] arr ={1,1,2,3,3,4}

            output:
                2 4
     */
    public static void main(String[] args) {
        int[] arr ={1,1,2,3,3,4};


        for (int j = 0; j < arr.length; j++) {
            int element = arr[j];
            int count = 0;//to store frequency

            for (int i = 0; i < arr.length; i++) {
                if (element == arr[i]){
                    count++;
                }
            }

            if (count == 2){
                System.out.print(element + " ");
            }
        }




        /*
        for (int i = 0; i < arr.length; i++) {
            int each = arr[i];
            str += each;
        }


        for (int i = 0; i < str.length(); i++) {
            String each = str.substring(i,i+1);
            if (str.indexOf(each) == str.lastIndexOf(each) ){
                System.out.print(each + " ");
            }
        }

         */


    }
}
