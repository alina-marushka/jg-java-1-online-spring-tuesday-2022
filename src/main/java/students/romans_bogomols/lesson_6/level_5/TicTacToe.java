package students.romans_bogomols.lesson_6.level_5;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        if (field[0][0] == field[0][1] && field[0][2] == field[0][1] && field[0][0] == playerToCheck) {
            return true;
        } else if (field[1][0] == field[1][1] && field[1][2] == field[1][1] && field[1][1] == playerToCheck) {
            return true;
        } else return field[2][0] == field[2][1] && field[2][1] == field[2][2] && field[2][2] == playerToCheck;
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        if (field[0][0] == field[1][0] && field[2][0] == field[1][0] && field[0][0] == playerToCheck) {
            return true;
        } else if (field[0][1] == field[1][1] && field[2][1] == field[1][1] && field[1][1] == playerToCheck) {
            return true;
        } else return field[0][2] == field[1][2] && field[1][2] == field[2][2] && field[2][2] == playerToCheck;
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][2] == field[1][1] && field[2][0] == field[1][1] && field[1][1] == playerToCheck) {
            return true;
        } else return field[2][2] == field[1][1] && field[0][0] == field[1][1] && field[1][1] == playerToCheck;
    }

    public boolean isWinPosition(int[][] field, int playerToCheck) {
        return isWinPositionForDiagonals(field, playerToCheck) || isWinPositionForVerticals(field, playerToCheck) ||
                isWinPositionForHorizontals(field, playerToCheck);
    }
}


/*      [o,o,x]
        [o,x,o]
        [x,o,x] */