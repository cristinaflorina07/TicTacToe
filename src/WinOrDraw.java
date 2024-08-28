public class WinOrDraw {
    public static boolean checkWin(char[][] board, char player) {
//        Check row and columns
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == player && board[i][1] == player && board[i][2] == player)
                return true;
            if (board[0][i] == player && board[1][0] == player && board[2][0] == player)
                return true;
        }
    }
}
