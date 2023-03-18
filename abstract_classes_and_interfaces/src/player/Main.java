package player;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String action;

        Player player = new Player();

        Scanner sc = new Scanner(System.in);

        while (true){

            System.out.print("Enter action (play, pause, record, stop, off): ");

            action = sc.next();

            if (action.equals("play")){

                player.play();

            }else if (action.equals("pause")){

                player.pause();

            }else if (action.equals("record")){

                player.record();

            }else if (action.equals("stop")){

                player.stop();

            }else if (action.equals("off")){

                break;

            } else {

                System.out.print("Enter the correct action.");
            }



        }

    }
}
