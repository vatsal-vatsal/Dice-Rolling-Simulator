import java.util.Scanner;

class DiceSimulator implements Runnable {
    private static void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    private static int rollDice() {
        return (int) (Math.random() * 6) + 1;
    }

    private static void playAnimation() {
        int frames = 5;
        for (int i = 0; i < frames; i++) {
            clearScreen();
            displayDieFace(rollDice());
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void displayDieFace(int dice) {
        switch (dice) {
            case 1:
                // System.out.println("\n * \n");
                System.out.println("\n\n\n\n\n");
                System.out.println("                ****** ");
                System.out.println("              ********** ");
                System.out.println("             ************ ");
                System.out.println("              ********** ");
                System.out.println("                ****** ");
                System.out.println("\n\n\n\n\n");
                break;
            case 2:
                System.out.println("\n\n\n\n\n");
                System.out.println("    ******                 ******");
                System.out.println("  **********             **********");
                System.out.println(" ************           ************");
                System.out.println("  **********             **********");
                System.out.println("    ******                 ******");
                System.out.println("\n\n\n\n\n");
                // System.out.println("\n* *\n");
                break;
            case 3:
                System.out.println("\n    ****** ");
                System.out.println("  ********** ");
                System.out.println(" ************ ");
                System.out.println("  ********** ");
                System.out.println("    ****** ");
                System.out.println("                ****** ");
                System.out.println("              ********** ");
                System.out.println("             ************ ");
                System.out.println("              ********** ");
                System.out.println("                ****** ");
                System.out.println("                            ****** ");
                System.out.println("                          ********** ");
                System.out.println("                         ************ ");
                System.out.println("                          ********** ");
                System.out.println("                            ****** \n");
                // System.out.println("* ");
                // System.out.println(" * ");
                // System.out.println(" *");
                break;
            case 4:
                System.out.println("\n    ******                  ******");
                System.out.println("  **********              **********");
                System.out.println(" ************            ************");
                System.out.println("  **********              **********");
                System.out.println("    ******                  ******\n\n\n\n\n");
                System.out.println("    ******                  ******");
                System.out.println("  **********              **********");
                System.out.println(" ************            ************");
                System.out.println("  **********              **********");
                System.out.println("    ******                  ******\n");
                // System.out.println("* *\n");
                // System.out.println("* *");
                break;
            case 5:
                System.out.println("\n    ******                  ******");
                System.out.println("  **********              **********");
                System.out.println(" ************            ************");
                System.out.println("  **********              **********");
                System.out.println("    ******                  ******");
                System.out.println("                ****** ");
                System.out.println("              ********** ");
                System.out.println("             ************ ");
                System.out.println("              ********** ");
                System.out.println("                ****** ");
                System.out.println("    ******                  ******");
                System.out.println("  **********              **********");
                System.out.println(" ************            ************");
                System.out.println("  **********              **********");
                System.out.println("    ******                  ******\n");
                // System.out.println("* *");
                // System.out.println(" * ");
                // System.out.println("* *");
                break;
            case 6:
                System.out.println("    ******                  ******");
                System.out.println("  **********              **********");
                System.out.println(" ************            ************");
                System.out.println("  **********              **********");
                System.out.println("    ******                  ******\n");
                System.out.println("    ******                  ******");
                System.out.println("  **********              **********");
                System.out.println(" ************            ************");
                System.out.println("  **********              **********");
                System.out.println("    ******                  ******\n");
                System.out.println("    ******                  ******");
                System.out.println("  **********              **********");
                System.out.println(" ************            ************");
                System.out.println("  **********              **********");
                System.out.println("    ******                  ******");
                // System.out.println("* *");
                // System.out.println("* *");
                // System.out.println("* *");
                break;
        }
    }

    public void run() {
        String playAgain = "";
        Scanner sc = new Scanner(System.in);

        while (playAgain.equals("")) {
            clearScreen();

            int dice = rollDice();
            playAnimation();
            clearScreen();

            displayDieFace(dice);

            System.out.print("Roll again? (Press Enter): ");
            playAgain = sc.nextLine();
        }

        sc.close();
    }
}

public class dice_sim {

    public static void main(String[] args) {
        DiceSimulator diceSimulator = new DiceSimulator();
        Thread t1 = new Thread(diceSimulator);
        t1.start();
    }
}