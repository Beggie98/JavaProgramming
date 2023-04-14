package day23_Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //DataType[] variableName = {data1, data2, data3 ...};

        String[] group1 = {"Feruza", "Yuliang", "Tamara", "Ahmet"};//ordered data structure
        //            index: 0           1         2         3

        //retrieve data from array - variableName[index]
        System.out.println(group1[0]);
        System.out.println(group1[1]);// Yuliang
        System.out.println(group1[2]);//Tamara
        System.out.println(group1[3]);

        System.out.println("------------------------------------");
        //loop is used to retrieve all the elements in an array
        for (int i=0; i<=3; i++){
            System.out.println(group1[i]);
        }



    }
}
