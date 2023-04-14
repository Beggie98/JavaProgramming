package Day23_Arrays;

public class MyClassmates {
    public static void main(String[] args) {
        //initialize the size of the array only
        // DataType[] variableName = new DataType[size]; - here we don't know names of the elements but we know the size of the array

        //if we know what the elements are
        String[] friends = {"Sabit", "Ahmet", "Tugba", "Beryl", "Zulal"};
        System.out.println("Size: " + friends.length);

        for (int i = 0; i <= friends.length - 1; i++) {
            System.out.println(friends[i]);
        }


        System.out.println("--------------------------------------------");

        //if we dont know what the elements are but we do know how many elements we wanna store
        String[] friends2 = new String[5];
        System.out.println("Size: " + friends2.length);


        //to replace an element we use variableName[index] = data;
        friends2[0] = "Dilem";
        friends2[1] = "Mohammed";
        friends2[2] = "Komiljon";
        friends2[3] = "Esraa";
        friends2[4] = "Kemal";
        //friends2[5] = "Muhtar"; // Array's size is fixed, cannot exceed the size

        for (int i = 0; i <= friends2.length-1; i++) {
            System.out.println(friends2[i]);
        }

    }
}
