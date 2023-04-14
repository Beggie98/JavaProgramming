package day11_Switch;

public class SwitchStatement {
    public static void main(String[] args) {
        int day = 10;
        String nameOfDay = "";

        switch (day){//no boolean expressions here
            case 1: nameOfDay = "Monday";
            break;
            case 2: nameOfDay = "Tuesday";
            break;
            case 3: nameOfDay = "Wednesday";
            break;
            case 4: nameOfDay = "Thursday";
            break;
            case 5: nameOfDay = "Friday";
            break;
            case 6: nameOfDay = "Saturday";
            break;
            case 7: nameOfDay = "Sunday";
            break;
            default: nameOfDay = "Invalid input";
        }
        System.out.println(nameOfDay);
    }
}
