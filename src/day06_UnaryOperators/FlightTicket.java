package day06_UnaryOperators;

public class FlightTicket {
    /*
    1. create a class named FlightTicket, and declare the following variables:
			 from, to, ticketPrice

			 use concatenation to display the full info of the ticket

			 ex:
			 	 From Las Vegas to McLean is $425.5
     */

    public static void main(String[] args) {
        String from = "Las Vegas",
                to = "McLean";
        double ticketPrice = 425.5;

        System.out.println("From " + from + " to " + to + " is $" + ticketPrice);
    }
}
