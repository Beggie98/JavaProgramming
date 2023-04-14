package day58_Maps;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {

    public static void main(String[] args) {


        Map<String, Integer> employeeMap = new HashMap<>();//Map<Key, Value>
        //anything we store in the map MUST be a pair of data: key and value

        //put(key, value) - inserts a pair of data (key & value) into the map

        employeeMap.put("Selda",100000);//{Selda=100000}
        employeeMap.put("Dilem",100000);//value can be duplicated
        employeeMap.put("Selda",110000);//key cannot be duplicated, doesn't accept duplicates just like Set. Last one will be accepted
        //{Dilem=100000, Selda=110000}
        employeeMap.put("Mucahit",100000);
        employeeMap.put("John",120000);

        System.out.println(employeeMap);
        System.out.println("---------------------------------------------------");
        //get(key) - retrieves the value of the given key

        int n1 = employeeMap.get("Mucahit");
        System.out.println(n1);

        System.out.println("--------------------------------------------");
        System.out.println(employeeMap);

        //remove(key) - removes a pair of data in the map

        employeeMap.remove("John");//valid key must be provided to remove a pair of data. Key must exist in the map

        System.out.println(employeeMap);

        System.out.println("---------------------------------------------------------");
        //containsKey(key) - verifies if a specific KEY is contained in a map, returns boolean
        //containsValue(value) - verifies if a specific VALUE is contained in a map, returns boolean

        boolean r1 = employeeMap.containsKey("Muhtar");//false
        boolean r2 = employeeMap.containsKey("John");//false, we removed the key John
        boolean r3 = employeeMap.containsKey("selda");//false, case sensitive
        boolean r4 = employeeMap.containsKey("Selda");//true

        System.out.println("r1 = " + r1);
        System.out.println("r2 = " + r2);
        System.out.println("r3 = " + r3);
        System.out.println("r4 = " + r4);

        System.out.println("--------------------------------------------");
        boolean r5 = employeeMap.containsValue(100000);//true
        boolean r6 = employeeMap.containsValue(200000);//false
        System.out.println("r5 = " + r5);
        System.out.println("r6 = " + r6);

        System.out.println("-----------------------------------------------");
        //isEmpty() - verifies if map is empty or not
        //clear() - removes everything from the map

        //replace(key, new value) - replaces value according to a key

        System.out.println(employeeMap);//{Dilem=100000, Selda=110000, Mucahit=100000}

        employeeMap.replace("Selda",120000);
        employeeMap.replace("Mucahit",employeeMap.get("Mucahit") + 20000);//{Dilem=100000, Selda=120000, Mucahit=120000}
        employeeMap.replace("Selda", employeeMap.get("Selda")-5000);//{Dilem=100000, Selda=115000, Mucahit=120000}


        System.out.println(employeeMap);//{Dilem=100000, Selda=120000, Mucahit=100000}

        System.out.println("--------------------------------------------------------------");

        //keySet() - returns all the keys from the map, returns a Set

        /*
        for (String eachName : employeeMap.keySet()) {//returns Set interface
            System.out.println(eachName + " : " + employeeMap.get(eachName));
        }
         */

        employeeMap.put("Abbos",115000);
        employeeMap.put("Yuliang",120000);
        employeeMap.put("Feruza",125000);
        employeeMap.put("Ahmet",129000);
        employeeMap.put("Ismail",111000);
        employeeMap.put("Zorana",125000);
        employeeMap.put("Mehmet",130000);
        employeeMap.put("Yuliia",127005);
        employeeMap.put("Yasin",130000);
        employeeMap.put("Meltem",121000);
        employeeMap.put("Dilem",150000);
        employeeMap.put("Davut",123000);
        employeeMap.put("Ekaterina",135000);
        employeeMap.put("Mehmut",143000);
        employeeMap.put("Merve",122000);
        employeeMap.put("Tamara",133000);

        //iterate keys ONLY:
        for (String eachKey : employeeMap.keySet()) {
            System.out.println(eachKey + " : " + employeeMap.get(eachKey));
        }

        System.out.println("------------------------------------------------");
        //iterate the values ONLY:
        //value() - returns all the values from the map, returns a collection

        for (Integer eachValue : employeeMap.values()) {
            System.out.println(eachValue);
        }

        System.out.println("---------------------------------------------------");
        //iterate both keys and values
        //entrySet() - returns all the entry of map

        for (Map.Entry<String, Integer> eachEntry : employeeMap.entrySet()) {//Entry is inner interface of the map
            //System.out.println(eachEntry);
            //getKey()
            //getValue()
            System.out.println(eachEntry.getKey() + " : " + eachEntry.getValue());
        }

        System.out.println("--------------------------------------------------------");
        System.out.println(employeeMap);
        //each pair of data (key & value) is entry

        System.out.println("---------------------------------------------------");
        //find the max salary, print the name of the employee(s) who have the max salary
        int max = Integer.MIN_VALUE;
        String employeeWithMaxSalary = "";

        for (Map.Entry<String, Integer> entry : employeeMap.entrySet()) {
            String eachName = entry.getKey();
            Integer eachSalary = entry.getValue();

            if (eachSalary > max){
                max = eachSalary;
                employeeWithMaxSalary = eachName;
            }

        }

        System.out.println("max = " + max);
        System.out.println("employeeWithMaxSalary = " + employeeWithMaxSalary);


    }

}
