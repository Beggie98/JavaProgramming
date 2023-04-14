package day23_Arrays;

import java.util.Arrays;

public class ArraysUtility {
    //                Arrays Utility: Arrays class is a utility of the array
    //                Arrays class is presented in "java.util"
    public static void main(String[] args) {
        //toString() - will display the elements of an array
        int[] array = {1,2,3,4,5,6};

        System.out.println(array);//hash code

        System.out.println(Arrays.toString(array));//[1,2,3,4,5,6]

        String[] array2 = new String[5];//default value null

        System.out.println(array2);//hash code

        System.out.println(Arrays.toString(array2));//[null, null, null, null, null]

        int[] nums = new int[5];//default value: 0

        System.out.println(Arrays.toString(nums));//[0,0,0,0,0]

        //sort(): sorts the elements of the array in ascending order

        String[] students = {"Boburbek", "Aysu", "Abbos", "Sabir"};

        System.out.println(Arrays.toString(students));//[Boburbek, Aysu, Abbos, Sabir]

        Arrays.sort(students);//this method does not return data, it does modification only
        //the array is sorted in ascending order (a to z)

        System.out.println(Arrays.toString(students));//[Abbos, Aysu, Boburbek, Sabir]


        int[] numbers = {9,10,4,1,3,-1,0,1,2};
        System.out.println(Arrays.toString(numbers));//[9, 10, 4, 1, 3, -1, 0, 1, 2]
        Arrays.sort(numbers);//sorts in ascending order

        System.out.println(Arrays.toString(numbers));//[-1, 0, 1, 1, 2, 3, 4, 9, 10]
        System.out.println("Minimum number: " + numbers[0]);
        System.out.println("Maximum number: " + numbers[numbers.length - 1]);


        char[] chars = {'z','b','k','a','c','y','x'};
        Arrays.sort(chars);

        System.out.println(Arrays.toString(chars));//[a, b, c, k, x, y, z]

        //equals(arr1,arr2) - compares two arrays, returns true or false
        // to get true output both arrays should have same values in the same indexes
        int[] num1 = {1,2,3};
        int[] num2 = {1,2,3};

        int[] num3 = {3,2,1};
        int[] num4 = {2,3,1};

        boolean r1 = Arrays.equals(num1,num2);
        boolean r2 = Arrays.equals(num2,num3);

        Arrays.sort(num3);//{1,2,3}
        Arrays.sort(num4);//{1,2,3}

        boolean r3 = Arrays.equals(num3,num4);

        System.out.println("r1 = " + r1);//true
        System.out.println("r2 = " + r2);//false
        System.out.println("r3 = " + r3);//true


    }
}
