package students.viktors_maksimovs.lesson_6.level_5;

class TicTacToeTest {

    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.topLinePlayerOneHori();
        test.midLinePlayerTwoHori();
        test.botLinePlayerNoneHori();
        test.topLinePlayerTwoVert();
        test.midLinePlayerOneVert();
        test.botLinePlayerNoneVert();
        test.playerOneDiag();
        test.playerTwoDiag();
        test.playerTwoAny();
        test.playerOneAny();
        test.playerDraw();
        test.playerDrawOne();


    }

    void topLinePlayerOneHori() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();
        board[0][0] = 0;
        board[0][1] = 0;
        board[0][2] = 0;
        boolean actual = game.isWinPositionForHorizontals(board, 0);
        assertThatEqual(true, actual, "Player one wins Horizontal - ");
    }

    void midLinePlayerTwoHori() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();
        board[1][0] = 1;
        board[1][1] = 1;
        board[1][2] = 1;
        boolean actual = game.isWinPositionForHorizontals(board, 1);
        assertThatEqual(true, actual, "Player two wins Horizontal - ");
    }

    void botLinePlayerNoneHori() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();
        board[2][0] = 1;
        board[2][1] = 1;
        board[2][2] = 1;
        boolean actual = game.isWinPositionForHorizontals(board, 0);
        assertThatEqual(false, actual, "Noone wins Horizontal - ");
    }

    void topLinePlayerTwoVert() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();
        board[0][0] = 1;
        board[1][0] = 1;
        board[2][0] = 1;
        boolean actual = game.isWinPositionForVerticals(board, 1);
        assertThatEqual(true, actual, "Player two wins Vertical - ");
    }

    void midLinePlayerOneVert() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();
        board[0][1] = 0;
        board[1][1] = 0;
        board[2][1] = 0;
        boolean actual = game.isWinPositionForVerticals(board, 0);
        assertThatEqual(true, actual, "Player one wins Vertical - ");
    }

    void botLinePlayerNoneVert() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();
        board[0][2] = 1;
        board[1][2] = 1;
        board[2][2] = 1;
        boolean actual = game.isWinPositionForVerticals(board, 0);
        assertThatEqual(false, actual, "Noone wins Vertical - ");
    }

    void playerOneDiag() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();
        board[0][0] = 0;
        board[1][1] = 0;
        board[2][2] = 0;
        boolean actual = game.isWinPositionForDiagonals(board, 0);
        assertThatEqual(true, actual, "Player one wins Diagonal - ");

    }

    void playerTwoDiag() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();
        board[2][0] = 1;
        board[1][1] = 1;
        board[0][2] = 1;
        boolean actual = game.isWinPositionForDiagonals(board, 1);
        assertThatEqual(true, actual, "Player two wins Diagonal - ");
    }

    void playerTwoAny() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();
        board[2][0] = 1;
        board[1][1] = 1;
        board[0][2] = 1;
        boolean actual = game.isWinPosition(board, 1);
        assertThatEqual(true, actual, "Player two wins  Any - ");
    }

    void playerOneAny() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();
        board[0][0] = 0;
        board[0][1] = 0;
        board[0][2] = 0;
        boolean actual = game.isWinPosition(board, 0);
        assertThatEqual(true, actual, "Player One wins  Any - ");
    }

    void playerDraw() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestArray();

        boolean actual = game.isDrawPosition(board);
        assertThatEqual(true, actual, "Draw - ");
    }

    void playerDrawOne() {
        TicTacToe game = new TicTacToe();
        int[][] board = createTestDraw();

        boolean actual = game.isDrawPosition(board);
        assertThatEqual(false, actual, "Draw - ");
    }

    void assertThatEqual(boolean expected, boolean actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " - PASS!");
        } else {
            System.out.println("[FAIL]: " + scenario + " - FAIL!");
        }
    }

    int[][] createTestArray() {
        return new int[][]{{-1, -1, -1}, {-1, -1, -1}, {-1, -1, -1}};
    }

    int[][] createTestDraw() {
        return new int[][]{{1, 0, 1}, {0, 0, 1}, {1, 0, 0}};
    }



    /*

    int[][] createTestArray() {
        int[][] board = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = -1;
            }
        }
        return  board;
    }

     */
}
