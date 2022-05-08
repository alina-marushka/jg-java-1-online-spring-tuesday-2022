package students.romans_bogomols.lesson_6.level_5;

class TicTacToeTest {
    public static void main(String[] args) {
        TicTacToeTest test = new TicTacToeTest();
        test.isWinPositionForHorizontalsPlayerOne();
        test.isWinPositionForHorizontalsPlayerOne1();
        test.isWinPositionForHorizontalsPlayerOne2();
        test.isWinPositionForHorizontalsPlayerTwo();
        test.isWinPositionForHorizontalsPlayerTwo1();
        test.isWinPositionForHorizontalsPlayerTwo2();
        test.isNotWinPositionForHorizontalsPlayerOne();
        test.isNotWinPositionForHorizontalsPlayerTwo();
        test.isWinPositionForVerticalsPlayerOne();
        test.isWinPositionForVerticalsPlayerOne1();
        test.isWinPositionForVerticalsPlayerOne2();
        test.isWinPositionForVerticalsPlayerTwo();
        test.isWinPositionForVerticalsPlayerTwo1();
        test.isWinPositionForVerticalsPlayerTwo2();
        test.isNotWinPositionForVerticalsPlayerOne();
        test.isNotWinPositionForVerticalsPlayerTwo();
        test.isWinPositionForDiagonalsPlayerOne();
        test.isWinPositionForDiagonalsPlayerOne1();
        test.isWinPositionForDiagonalsPlayerTwo();
        test.isWinPositionForDiagonalsPlayerTwo1();
        test.isNotWinPositionForDiagonalsPlayerOne();
        test.isNotWinPositionForDiagonalsPlayerTwo();
        test.isWinPositionVerticalPlayerOne();
        test.isWinPositionHorizontalPlayerTwo();
        test.isWinPositionDiagonalPlayerOne();
        test.isNotWinPositionPlayerTwo();

    }

    TicTacToe game = new TicTacToe();

    void isWinPositionForHorizontalsPlayerOne() {
        int[][] field = {
                {0, 0, 0},
                {1, 0, 1},
                {1, 1, -1}
        };
        assertThatEqual(true, game.isWinPositionForHorizontals(field, 0),
                "Player one win on horizontals test #1 -");
    }
    void isWinPositionForHorizontalsPlayerOne1() {
        int[][] field = {
                {1, 1, 0},
                {0, 0, 0},
                {-1, 1, -1}
        };
        assertThatEqual(true, game.isWinPositionForHorizontals(field, 0),
                "Player one win on horizontals test #2 -");
    }
    void isWinPositionForHorizontalsPlayerOne2() {
        int[][] field = {
                {-1, 1, 1},
                {0, -1, 1},
                {0, 0, 0}
        };
        assertThatEqual(true, game.isWinPositionForHorizontals(field, 0),
                "Player one win on horizontals test #3 -");
    }
    void isWinPositionForHorizontalsPlayerTwo() {
        int[][] field = {
                {1, 1, 1},
                {0, -1, 0},
                {1, 0, -1}
        };
        assertThatEqual(true, game.isWinPositionForHorizontals(field, 1),
                "Player two win on horizontals test #1 -");
    }
    void isWinPositionForHorizontalsPlayerTwo1() {
        int[][] field = {
                {0, -1, 0},
                {1, 1, 1},
                {1, 0, -1}
        };
        assertThatEqual(true, game.isWinPositionForHorizontals(field, 1),
                "Player two win on horizontals test #2 -");
    }
    void isWinPositionForHorizontalsPlayerTwo2() {
        int[][] field = {
                {0, -1, 0},
                {0, -1, 0},
                {1, 1, 1}
        };
        assertThatEqual(true, game.isWinPositionForHorizontals(field, 1),
                "Player two win on horizontals test #3 -");
    }
    void isNotWinPositionForHorizontalsPlayerOne() {
        int[][] field = {
                {0, -1, 0},
                {0, -1, 0},
                {1, 1, 1}
        };
        assertThatEqual(false, game.isWinPositionForHorizontals(field, 0),
                "Player one does not win on horizontals test -");
    }
    void isNotWinPositionForHorizontalsPlayerTwo() {
        int[][] field = {
                {0, 0, 0},
                {1, 0, 1},
                {1, 1, -1}
        };
        assertThatEqual(false, game.isWinPositionForHorizontals(field, 1),
                "Player two does not win on horizontals test -");
    }
    void isWinPositionForVerticalsPlayerOne() {
        int[][] field = {
                {0, 1, 0},
                {0, -1, 1},
                {0, 1, -1}
        };
        assertThatEqual(true, game.isWinPositionForVerticals(field, 0),
                "Player one win on verticals test #1 -");
    }
    void isWinPositionForVerticalsPlayerOne1() {
        int[][] field = {
                {1, 0, 0},
                {-1, 0, 1},
                {1, 0, -1}
        };
        assertThatEqual(true, game.isWinPositionForVerticals(field, 0),
                "Player one win on verticals test #2 -");
    }
    void isWinPositionForVerticalsPlayerOne2() {
        int[][] field = {
                {0, -1, 0},
                {-1, 1, 0},
                {1, 1, 0}
        };
        assertThatEqual(true, game.isWinPositionForVerticals(field, 0),
                "Player one win on verticals test #3 -");
    }
    void isWinPositionForVerticalsPlayerTwo() {
        int[][] field = {
                {1, -1, 0},
                {1, 0, -1},
                {1, -1, 0}
        };
        assertThatEqual(true, game.isWinPositionForVerticals(field, 1),
                "Player one win on verticals test #1 -");
    }void isWinPositionForVerticalsPlayerTwo1() {
        int[][] field = {
                {-1, 1, 0},
                {-1, 1, -1},
                {0, 1, 0}
        };
        assertThatEqual(true, game.isWinPositionForVerticals(field, 1),
                "Player one win on verticals test #2 -");
    }
    void isWinPositionForVerticalsPlayerTwo2() {
        int[][] field = {
                {0, -1, 1},
                {-1, 0, 1},
                {0, -1, 1}
        };
        assertThatEqual(true, game.isWinPositionForVerticals(field, 1),
                "Player one win on verticals test #3 -");
    }
    void isNotWinPositionForVerticalsPlayerOne() {
        int[][] field = {
                {1, 0, -1},
                {1, -1, 0},
                {1, 0, -1}
        };
        assertThatEqual(false, game.isWinPositionForVerticals(field, 0),
                "Player one does not win on verticals test  -");
    }
    void isNotWinPositionForVerticalsPlayerTwo() {
        int[][] field = {
                {1, -1, 0},
                {-1, 1, 0},
                {1, -1, 0}
        };
        assertThatEqual(false, game.isWinPositionForVerticals(field, 1),
                "Player two does not win on verticals test -");
    }
    void isWinPositionForDiagonalsPlayerOne() {
        int[][] field = {
                {0, -1, -1},
                {-1, 0, 1},
                {-1, 1, 0}
        };
        assertThatEqual(true, game.isWinPositionForDiagonals(field, 0),
                "Player one win on diagonals test #1 -");
    }
    void isWinPositionForDiagonalsPlayerOne1() {
        int[][] field = {
                {-1, -1, 0},
                {-1, 0, 1},
                {0, 1, -1}
        };
        assertThatEqual(true, game.isWinPositionForDiagonals(field, 0),
                "Player one win on diagonals test #2 -");
    }
    void isWinPositionForDiagonalsPlayerTwo() {
        int[][] field = {
                {0, -1, 1},
                {-1, 1, 0},
                {1, 0, -1}
        };
        assertThatEqual(true, game.isWinPositionForDiagonals(field, 1),
                "Player two win on diagonals test #1 -");
    }
    void isWinPositionForDiagonalsPlayerTwo1() {
        int[][] field = {
                {1, -1, 0},
                {-1, 1, 0},
                {-1, 0, 1}
        };
        assertThatEqual(true, game.isWinPositionForDiagonals(field, 1),
                "Player two win on diagonals test #2 -");
    }
    void isNotWinPositionForDiagonalsPlayerOne() {
        int[][] field = {
                {0, -1, 1},
                {-1, 1, 0},
                {1, 0, -1}
        };
        assertThatEqual(false, game.isWinPositionForDiagonals(field, 0),
                "Player one does not win on diagonals test -");
    }
    void isNotWinPositionForDiagonalsPlayerTwo() {
        int[][] field = {
                {0, -1, -1},
                {-1, 0, 1},
                {-1, 1, 0}
        };
        assertThatEqual(false, game.isWinPositionForDiagonals(field, 1),
                "Player two does not win on diagonals test -");
    }
    void isWinPositionVerticalPlayerOne() {
        int[][] field = {
                {0, 1, 0},
                {0, -1, 1},
                {0, 1, -1}
        };
        assertThatEqual(true, game.isWinPosition(field, 0),
                "Player one win test -");
    }
    void isWinPositionHorizontalPlayerTwo() {
        int[][] field = {
                {1, 1, 1},
                {0, -1, 0},
                {1, 0, -1}
        };
        assertThatEqual(true, game.isWinPosition(field, 1),
                "Player two win test -");
    }
    void isWinPositionDiagonalPlayerOne() {
        int[][] field = {
                {0, -1, -1},
                {-1, 0, 1},
                {-1, 1, 0}
        };
        assertThatEqual(true, game.isWinPosition(field, 0),
                "Player one win test #2 -");
    }
    void isNotWinPositionPlayerTwo() {
        int[][] field = {
                {0, -1, -1},
                {-1, 0, 1},
                {-1, 1, 0}
        };
        assertThatEqual(false, game.isWinPositionForDiagonals(field, 1),
                "Player two does not win test -");
    }
    void assertThatEqual(boolean expected, boolean actual, String scenario) {
        if (expected == actual) {
            System.out.println("[ OK ]: " + scenario + " passed!");
        } else {
            System.out.println("[FAIL]: " + scenario + " failed!");
        }
    }
}