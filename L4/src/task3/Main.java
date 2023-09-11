package task3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choose: Play or Record");
        String action = sc.nextLine();

        if (action.equalsIgnoreCase("p")) {
            Playable player = new Player();
            player.play();

            System.out.println("Enter your choose: PAuse or Stop");
            String nextAction = sc.nextLine();

            if (nextAction.equalsIgnoreCase("pa")) {
                player.pause();
            } else if (nextAction.equalsIgnoreCase("s")) {
                player.stop();
            }
        }
        else if (action.equalsIgnoreCase("r")) {
            Recodable player = new Player();
            player.record();

            System.out.println("Enter your choose: PAuse or Stop");
            String nextAction = sc.nextLine();

            if (nextAction.equalsIgnoreCase("pa")) {
                player.pause();
            } else if (nextAction.equalsIgnoreCase("s")) {
                player.stop();
            }
        }
    }

}
