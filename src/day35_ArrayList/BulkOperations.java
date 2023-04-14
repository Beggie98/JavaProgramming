package day35_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {
    public static void main(String[] args) {
        //Bulk Operations only accept collection type
        //addAll() - adds multiple of elements to the list

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.addAll(Arrays.asList(1,2,3,4,5,6,7,8,9));

        ArrayList<Integer> list = new ArrayList<>();
        //list.addAll(1,2,3,4,5,6,7,8,9);//array of values, not collection

        list.addAll(numbers);
        //Arrays.asList(array of values) - returns the array as Collection

        list.addAll(Arrays.asList(10,11,12,13,14,15));

        System.out.println(list);

        System.out.println("-----------------------------------------");
        //removeAll() - removes all the matching elements from the arraylist

        ArrayList<String> students = new ArrayList<>();
        students.addAll(Arrays.asList("Dilem", "Philip", "Abbos", "Abbos", "Abbos", "Atila", "Dilem", "Ekaterina"));

        System.out.println("students = " + students);

        students.removeAll(Arrays.asList("Dilem", "Philip", "Abbos"));

        System.out.println("students = " + students);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.addAll(Arrays.asList(1,1,2,2,2,2,3,3,3,3,4,5,6,7,8,9,1,1,1,1,1,1));
        System.out.println(nums);

        //nums.removeAll(Arrays.asList(1));

        System.out.println(nums);

        System.out.println("-----------------------------------------------");
        //retainAll() - removes all the Non-matching elements from the arraylist (keep)

        nums.retainAll(Arrays.asList(1,2));//removes all the elements that are not matching with 1 and 2

        System.out.println(nums);
        System.out.println("------------------------------------------");

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Dilem", "Phillip", "Abbos", "Ahmet", "Andrei", "Gabil"));

        employees.retainAll(Arrays.asList("Abbos", "Ahmet"));

        System.out.println("employees = " + employees);

        System.out.println("--------------------------------------------");
        //containsAll() - checks if all elements are contained in the list

        ArrayList<String> groceryList = new ArrayList<>();
        groceryList.addAll(Arrays.asList("Soda", "Milk", "Wine", "Beer", "Eggs", "Bread", "Water", "Apple","Cherry"));

        //check if Soda, Wine, Beer are contained in grocerylist
        boolean r = groceryList.containsAll( Arrays.asList("Soda", "Wine", "Beer", "Coffee") );

        System.out.println("r = " + r);



    }
}
