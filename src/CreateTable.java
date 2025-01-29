public class CreateTable {

    static void  createTable(String[][] table) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(" " + table[i][j] + " ");
            }
            System.out.println();
        }
    }
}