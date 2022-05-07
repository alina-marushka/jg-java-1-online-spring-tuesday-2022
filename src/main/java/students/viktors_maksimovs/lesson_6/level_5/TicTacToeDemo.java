package students.viktors_maksimovs.lesson_6.level_5;

class TicTacToeDemo {
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();
        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = -1;
            }
        }
        System.out.println(game.isWinPositionForHorizontals(board, 1));
    }
}
