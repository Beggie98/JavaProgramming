package day35_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {
    public static void main(String[] args) {
        //set(index, element) - replaces the element at the given index

        ArrayList<String> groceryList = new ArrayList<>();

        groceryList.add("Eggs");
        groceryList.add("Milk");
        groceryList.add("Water");
        groceryList.add("Viniger");
        groceryList.add("Bread");

        System.out.println(groceryList);

        groceryList.set(0,"Toilet Paper");
        groceryList.set(3,"Soda");

        System.out.println(groceryList);

        System.out.println("---------------------------------------");
        //remove(index) - remove the object at the given index number

        groceryList.remove(1);
        System.out.println(groceryList);//ArrayList toString is done automatically

        //remove(Object) - removes the first matching object

        boolean r1 = groceryList.remove("Water");
        System.out.println(groceryList);
        System.out.println("r1 = " + r1);

        boolean r2 = groceryList.remove("Face Masks");
        System.out.println(groceryList);
        System.out.println("r2 = " + r2);

        System.out.println("-----------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();
        list1.add(10);//0
        list1.add(20);//1
        list1.add(30);//2
        list1.add(40);//3
        list1.add(50);//4
        list1.add(60);//5

        list1.remove(Integer.valueOf(30));

        System.out.println(list1);


        //clear() - clears the Arraylist, removes all the objects inside the ArrayList
        groceryList.clear();
        System.out.println(groceryList);//[]

        list1.clear();
        System.out.println("list1 = " + list1);//list1 = []

        System.out.println("------------------------------------------------");
        //indexOf() - returns the first matching object index number
        //lastIndexOf() - returns the last matching object index number
        ArrayList<Character> list = new ArrayList<>();
        list.add('A');
        list.add('A');
        list.add('A');
        list.add('B');
        list.add('A');
        list.add('D');
        list.add('C');

        System.out.println(list);

        list.indexOf('B');//3
        list.lastIndexOf('B');//3

        ArrayList<Character> uniqueChars = new ArrayList<>();

        for (Character each : list) {
            if (list.indexOf(each) == list.lastIndexOf(each)){
                uniqueChars.add(each);
            }
        }

        System.out.println(uniqueChars);

        System.out.println("-------------------------------------");

        //contains() - checks if the specific element is contained or not

        boolean hasToiletPaper = groceryList.contains("Toilet Paper");
        boolean hasToiletPaper2 = groceryList.indexOf("Toilet Paper") >= 0;

        System.out.println("hasToiletPaper2 = " + hasToiletPaper2);
        System.out.println("hasToiletPaper = " + hasToiletPaper);

        System.out.println("----------------------------------------------------");

        ArrayList<Character> characters = new ArrayList<>();
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('B');
        characters.add('A');
        characters.add('C');
        characters.add('A');

        System.out.println(characters);

        ArrayList<Character> result = new ArrayList<>();//[A,B,C]

        for (Character each : characters) {
            if (!result.contains(each)){
                result.add(each);
            }
        }

        System.out.println(result);

        System.out.println("-------------------------------------------");

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(100);
        nums.add(200);
        nums.add(300);
        nums.add(400);

        ArrayList<Integer> result2 = new ArrayList<>();

        for (int i = nums.size() - 1; i >= 0; i--) {
            result2.add(nums.get(i));
        }

        System.out.println(result2);

        System.out.println("--------------------------------------------------");
        //equals(list): checks equality of two lists, returns boolean

        ArrayList<Integer> n1 = new ArrayList<>();
        n1.add(10);
        n1.add(20);

        ArrayList<Integer> n2 = new ArrayList<>();
        n2.add(10);
        n2.add(20);

        System.out.println(n1 == n2);//false
        System.out.println(n1.equals(n2));//true

        System.out.println("----------------------------------------");
        //isEmpty()


    }
}
