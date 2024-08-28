public class PrintBoard {

    public static void main(String[] args) {

        char[][] board = new char[3][3];
        int i;
        for (i = 0; i < 3; i++) {
            int j;
            for (j = 0; j < 3; j++) {

                    System.out.print(board[i][j]);
                if (j < 2)
                    System.out.print("|");
            }
            System.out.println();
            if (i < 2)
                System.out.println("-----");
        }
    }
}


