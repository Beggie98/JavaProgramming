package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods {
    public static void main(String[] args) {
        //add(element) - adds the elements to the indexes of the arraylist
        //add(index, element) - adds the element to the given index (index must exist), the remaining elements will be shifted to the right

        ArrayList<Integer> numbers = new ArrayList<>();//size: 0
        numbers.add(10);//autoboxing index:0
        numbers.add(20);//autoboxing 1
        numbers.add(30);//autoboxing 2
        numbers.add(40);//autoboxing 3
        numbers.add(1,15);
        System.out.println(numbers);//[10, 15, 20, 30, 40]

        //get(int index) - used to retrieve an element from arraylist

        System.out.println(numbers.get(2));

        //size() - total number of elements (length)

        System.out.println(numbers.size());

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }
        for (int each : numbers){
            System.out.println(each);
        }
    }
}
