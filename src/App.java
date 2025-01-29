
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[][] table = {
            {"-", "-", "-"},
            {"-", "-", "-"},
            {"-", "-", "-"}
        };

        int playerNum = 2, input, pos;
        Scanner sc = new Scanner(System.in);
        Boolean validMove = false;


        System.out.println("--------Welcome to TicTacToe!!--------\n");

        // Create players
        System.out.println("Player 1 tell me your name: ");
        String player1Name = sc.nextLine();
        PlayerAbstract player1 = new HumanPlayer(player1Name, 'o');

        System.out.println("Player 2 tell me your name: ");
        String player2Name = sc.nextLine();
        PlayerAbstract player2 = new HumanPlayer(player2Name, 'x');

        do {
            playerNum = TogglePlayer.togglePlayer(playerNum); // change player
            CreateTable.createTable(table); // print table evry turn
                
            if(playerNum == 1) {
                System.out.println("Hello " + player1Name + " give me your move(o): ");
                input = sc.nextInt();
                sc.nextLine();
                pos = 1;

                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        if(pos == input)
                            table[i][j] = "o";
                            pos++;        
                        }
                    }
                }

            if(playerNum == 2) {
                System.out.println("Hello " + player2Name + " give me your move(x): ");
                input = sc.nextInt();
                sc.nextLine();
                pos = 1;

                for(int i = 0; i < 3; i++){
                    for(int j = 0; j < 3; j++){
                        if(pos == input)
                            table[i][j] = "x";
                        pos++;     
                        }
                    }
                }
        }while(GameEnd.gameEnd(table) == false);

        Finish.Finish(table, player1Name, player2Name, playerNum);
    }

}