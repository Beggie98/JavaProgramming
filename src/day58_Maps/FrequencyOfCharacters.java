package day58_Maps;

import java.util.*;

public class FrequencyOfCharacters {

    public static void main(String[] args) {

        String str = "aabbbccccdddddeeee";

        Map<String, Integer> frequencyOfChars = new LinkedHashMap<>();

        for (String each : str.split("")) {
            int f = Collections.frequency(Arrays.asList(str.split("")),each);
            frequencyOfChars.put(each,f);
        }

        System.out.println(frequencyOfChars);

        System.out.println("---------------------------------------------");
        //second largest frequency?
        ArrayList<Integer> list = new ArrayList<>(frequencyOfChars.values());
        Collections.sort(list);
        int second = list.get(list.size()-2);

        System.out.println(second);

        System.out.println("------------------------------------------------------");
        //find the character that has the second largest frequency

        for (Map.Entry<String, Integer> entry : frequencyOfChars.entrySet()) {
            if (entry.getValue() == second){
                System.out.println(entry.getKey());
            }
        }




    }


}
