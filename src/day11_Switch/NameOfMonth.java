package day11_Switch;

public class NameOfMonth {
    public static void main(String[] args) {
        int month = 7;
        String name = "";

        switch (month){
            case 1: name = "Jan";
            break;
            case 2: name = "Feb";
            break;
            case 3: name = "Mar";
            break;
            case 4: name = "Apr";
            break;
            case 5: name = "May";
            break;
            case 6: name = "Jun";
            break;
            case 7: name = "Jul";
            break;
            case 8: name = "Aug";
            break;
            case 9: name = "Sep";
            break;
            case 10: name = "Oct";
            break;
            case 11: name = "Nov";
            break;
            case 12: name = "Dec";
            break;
            default: name = "Invalid entry";
            break;

        }
        System.out.println(name);
    }
}
