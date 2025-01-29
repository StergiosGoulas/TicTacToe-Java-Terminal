// public class FailMove {
//     public static boolean makeMove(String[][] table, int input, char symbol) {
//         int pos = 1;
//         for (int i = 0; i < 3; i++) {
//             for (int j = 0; j < 3; j++) {
//                 if (pos == input) {
//                     if (table[i][j].equals("-")) {
//                         return true;
//                     } else {
//                         System.out.println("Position already taken. Please choose another move.");
//                         return false;
//                     }
//                 }
//                 pos++;
//             }
//         }
//         System.out.println("Invalid move. Please choose a valid position.");
//         return false;
//     }
// }
