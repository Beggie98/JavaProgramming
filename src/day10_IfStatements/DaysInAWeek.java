package day10_IfStatements;

public class DaysInAWeek {


    public static void main(String[] args) {
    int day = 5;
    String name = "";

    if(day >= 1 && day<=7){
        /*
        if (day == 1){

            name = "Monday";
        }
        else if(day == 2){
            name = "Tuesday";
        }
        else if(day == 3){
            name = "Wednesday";
        }
        else if(day == 4){
            name = "Thursday";
        }
        else if(day == 5){
            name = "Friday";
        }
        else if(day == 6){
            name = "Saturday";
        }
        else{
            name = "Sunday";
        }
        */
        name = (day==1)? "Monday" :(day==2)? "Tuesday" :(day==3)? "Wednesday" :(day==4)? "Thursday"
                :(day==5)? "Friday" :(day==6)? "Saturday" : "Sunday";
    }
    else {
        name = "Invalid";
    }

    System.out.println("name = " + name);

    }


}
