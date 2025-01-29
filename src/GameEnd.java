public class GameEnd {
    public static boolean gameEnd(String[][] table) {
        // check rows
        for (int i = 0; i < 3; i++) {
            if (table[i][0].equals(table[i][1]) && table[i][1].equals(table[i][2]) && !table[i][0].equals("-")) {
                return true;
            }
        }

        // check columns
        for (int i = 0; i < 3; i++) {
            if (table[0][i].equals(table[1][i]) && table[1][i].equals(table[2][i]) && !table[0][i].equals("-")) {
                return true;
            }
        }

        // check diagonals
        if (table[0][0].equals(table[1][1]) && table[1][1].equals(table[2][2]) && !table[0][0].equals("-")) {
            return true;
        }

        if (table[0][2].equals(table[1][1]) && table[1][1].equals(table[2][0]) && !table[0][2].equals("-")) {
            return true;
        }

        return false;
    }
}
