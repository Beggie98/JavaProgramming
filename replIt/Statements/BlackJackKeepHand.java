package Statements;

import java.util.Scanner;

public class BlackJackKeepHand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int house = input.nextInt();
        int player = input.nextInt();

        String result = "";

        if (player + house > 31){
            result = "Player Bust";
        }else if (house > player){
            result = "Player Loss";
        } else if (player == house) {
            result = "It is a draw";
        } else if (player > house) {
            result = "Player win";
        }

        System.out.println(result);

    }
}
