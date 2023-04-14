package day25_ForEachLoop;

public class ForEachLoopIntro {
    //for each loop: a loop that's already iterated, iteration starts from index 0 till the last index (fixed), cannot be reversed

    //pre condition: there MUST be a data structure

    //syntax:
    //       for(DataType Variable : Collection of Data){
    //          }
    //      DataTypy must MATCH with the collection of data

    public static void main(String[] args) {



        int[] numbers = {1,2,3,4,5};
        //index:         0 1 2 3 4

        for (int i = 0; i < numbers.length; i++) {//i: index numbers of the array
            System.out.println(numbers[i]);
        }

        System.out.println("----------------------------------");

        for (int each : numbers){//each: elements of the array
            System.out.println(each);
        }

        System.out.println("-----------------------------------------");

        String[] names = {"Ahmet", "Boburbek", "Farid", "Robinson"};

        for ( String eachName : names){//there is no index in for each loop
            System.out.println(eachName);
        }

        //we can use for each loop if we don't need to use indexes
        // we cannot alter the index numbers



    }
}
