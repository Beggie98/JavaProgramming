package day26_MultiDimensionalArray;

public class CommonNumbers {
    public static void main(String[] args) {
        /*
        Write a program that can print out the common elements from two integer array
          Ex:
              arr1: {1,2,3,4,5}
              arr2: {4,5,6,7,8}

          output:
              4 5
         */
        //solution 1: DO NOT use for each loop
        int[] arr1= {1,2,3,4,5},
                arr2= {4,5,6,7,8};

        for (int each2 : arr2){
            int count = 0;
            for (int each1 : arr1){
                if (each2 == each1){
                    count++;
                }
            }
            if (count == 1){
                System.out.print(each2 + " ");
            }
        }
        System.out.println();

        System.out.println("------------------------------");

        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]){
                    System.out.println(arr2[i]);
                }
            }
        }






















        /*
        int[] arr3 = new int[arr1.length + arr2.length];


        int j = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr3[j++]  = arr1[i];
        }
        for (int i = 0; i < arr2.length; i++) {
            arr3[j++] = arr2[i];
        }

        for (int i = 0; i < arr3.length; i++) {
            int count = 0;
            int result = arr3[i];
            for (int k = 0; k < arr3.length; k++) {
                int each = arr3[k];
                if (each == result){
                    count++;
                }
            }
            if (count==2){
                System.out.println(result);

            }
        }



         */



    }
}
