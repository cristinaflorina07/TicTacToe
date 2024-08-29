import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        char board[][] = new char[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = ' ';
            }
        }
        char currentPlayer = 'X';
        boolean gameEnded = false;
        Scanner scanner = new Scanner(System.in);


        while (!gameEnded) {
            PrintBoard.printBoard(board);
            System.out.println("Player " + currentPlayer + "'s turn. Enter row and column (0, 1, or 2): ");
            int row = scanner.nextInt();
            int col = scanner.nextInt();
            if (MovePlayer.validMove(board, row, col)) {
                MovePlayer.makeMove(board, row, col, currentPlayer);
                if (WinOrDraw.checkWin(board, currentPlayer)) {
                    PrintBoard.printBoard(board);
                    System.out.println("Player" + currentPlayer + "is wins!");
                    gameEnded = true;
                } else if (WinOrDraw.checkDrow(board)) {
                    PrintBoard.printBoard(board);
                    System.out.println("It`s a draw!");
                    gameEnded = true;

                } else {
                    currentPlayer = (currentPlayer == 'X') ? 'O' : 'X';
                }}
                else{
                    System.out.println("Invalid move! Try again!");
                }
            }
        }}




