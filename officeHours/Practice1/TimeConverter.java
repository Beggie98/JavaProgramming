package Practice1;

public class TimeConverter {
    public static void main(String[] args) {

        int inputSeconds=3695;
        int hours, minutes, seconds;

        hours = inputSeconds/3600;// hours = 1
        minutes = (inputSeconds%3600)/60;// 95 => 1 minute 35 seconds
        seconds = inputSeconds % 60;

        System.out.println(hours + " hours " + minutes + " minutes " + seconds + " seconds");


    }
}
