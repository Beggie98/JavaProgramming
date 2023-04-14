package Statements;

import java.util.Scanner;

public class AndroidVersions {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter android version");
        double version = input.nextDouble();

        String versionName = (version>1 && version<10)? (version==1.5)? "Cupcake" :(version==1.6)? "Donut"
                :(version==2.1)? "Eclair" :(version==2.2)? "Froyo" :(version==2.3)? "Gingerbread" :(version==3.1)?
                "Honeycomb" :(version==4.0)? "Ice Cream Sandwich" :(version>=4.1 && version <=4.31 )? "Jelly Bean"
                :(version>=4.4 && version<=4.44)? "KitKat" :(version>=5.0 && version<=5.11)? "Lollipop" :(version>=8.0 && version<=8.1)? "Oreo"
                :(version==9.0)? "Pie" : "Sorry, I don't know this version!" : "Sorry, I don't know this version!";

        System.out.println(versionName);
        input.close();

    }
}
