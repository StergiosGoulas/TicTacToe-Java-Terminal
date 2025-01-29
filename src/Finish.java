public class Finish {
    static void Finish(String[][] table, String player1, String player2, int playerNum) {
        CreateTable.createTable(table);
        if(playerNum == 1) {
            System.out.println("Congratulations " + player1 + " you won!!");
        } else {
            System.out.println("Congratulations " + player2 + " you won!!");
        }
    }
}
