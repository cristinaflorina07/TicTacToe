public class MovePlayer {
    public static boolean validMove(char[][] board, int row, int col) {
        return row >= 0 && row < 3 && col >= 0 && col < 3 && board[row][col] == ' ';
    }

    public static void makeMove(char[][] board, int row, int col, char player) {
        if (validMove(board, row, col)){
            board[row][col]=player;
        }else{
            System.out.println("Invalid move! Try again!");
        }

    }
}