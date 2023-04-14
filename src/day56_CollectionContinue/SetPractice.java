package day56_CollectionContinue;

import java.util.*;

public class SetPractice {

    public static void main(String[] args) {

        //Set does not accept duplicates

        String[] arr = {"Wooden spoon", "Book", "Pen", "Phone","Wooden spoon", "Wooden spoon", "Wooden spoon",
                "Wooden spoon", "Milk","Eggs","Coke","Paper Towels"};

        Set<String> items1 = new HashSet<>(Arrays.asList(arr));//does not care about order of elements, order can be random
        items1.add(null);//HashSet accepts null

        Set<String> items2 = new LinkedHashSet<>(Arrays.asList(arr));//elements will be in order, keeps the insertion order
        items2.add(null);//LinkedHashSet accepts null

        Set<String> items3 = new TreeSet<>(Arrays.asList(arr));//in sorted order, ascending order (cannot be null)
        //items3.add(null);// tree set does not accept null
        //TreeSet calls instance methods to sort elements in ascending order. Null will throw an exception

        System.out.println("items1 = " + items1);//[Paper Towels, Wooden spoon, Coke, Eggs, Book, Phone, Pen, Milk]
        System.out.println("items2 = " + items2);//[Wooden spoon, Book, Pen, Phone, Milk, Eggs, Coke, Paper Towels]
        System.out.println("items3 = " + items3);//[Book, Coke, Eggs, Milk, Paper Towels, Pen, Phone, Wooden spoon]


        System.out.println("------------------------------------------------------");
        List<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,2,3,4,5,1,2,3,4,5,1,2,3,4,5,6,1,2,3,4,5,6,1,2,3,4,5));

        list = new ArrayList<>(new LinkedHashSet<Integer>(list));//ArrayList<>(Collection type)

        System.out.println(list);

        System.out.println("----------------------------------------------------------");

        String str = "abcabcabcabc";//remove duplicates
        //str = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString().replace(", ","").substring(1,4);
        str = new LinkedHashSet<>(Arrays.asList(str.split(""))).toString();

        System.out.println(str);//[a, b, c]


        System.out.println("-----------------------------------------------------------");

        Integer[] nums = {1,2,3,4,5,6,7,8,9,10,1,2,3,4,5,6,7,8,9,10};

        //remove duplicates and return 5th element

        LinkedHashSet linkedHashSet = new LinkedHashSet<>(Arrays.asList(nums));//[1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
        System.out.println(linkedHashSet);
        //System.out.println(linkedHashSet.get(4));//need to convert to Arraylist to access 5th element by index
        System.out.println(new ArrayList<>(linkedHashSet).get(4));//5

        System.out.println("--------------------------------------------------------");

        //"aaaaabbbcccc" ===> "a5b3c4"
        String str1 = "aaaaabbbccccddddeeee";
        String result = "";
        for (String ch : new LinkedHashSet<>(Arrays.asList(str1.split("")))) {//[a, b, c, d, e] - non-duplicated characters
            result += ch + Collections.frequency(Arrays.asList(str1.split("")),ch);
        }

        System.out.println("result = " + result);//a5b3c4d4e4


    }


}
