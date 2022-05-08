package students.viktors_maksimovs.lesson_6.level_5;

class TicTacToe {

    public boolean isWinPositionForHorizontals(int[][] field, int playerToCheck) {
        return (field[0][0] == playerToCheck && field[0][1] == playerToCheck && field[0][2] == playerToCheck)
                || (field[1][0] == playerToCheck && field[1][1] == playerToCheck && field[1][2] == playerToCheck)
                || (field[2][0] == playerToCheck && field[2][1] == playerToCheck && field[2][2] == playerToCheck);
    }

    public boolean isWinPositionForVerticals(int[][] field, int playerToCheck) {
        return (field[0][0] == playerToCheck && field[1][0] == playerToCheck && field[2][0] == playerToCheck)
                || (field[0][1] == playerToCheck && field[1][1] == playerToCheck && field[2][1] == playerToCheck)
                || (field[0][2] == playerToCheck && field[1][2] == playerToCheck && field[2][2] == playerToCheck);
    }

    public boolean isWinPositionForDiagonals(int[][] field, int playerToCheck) {
        if (field[0][0] == playerToCheck && field[1][1] == playerToCheck && field[2][2] == playerToCheck) {
            return true;
        } else
            return field[2][0] == playerToCheck && field[1][1] == playerToCheck && field[0][2] == playerToCheck;
    }

    public boolean isWinPosition(int[][] board, int playerToCheck) {

        return isWinPositionForHorizontals(board, playerToCheck) || isWinPositionForVerticals(board, playerToCheck)
                || isWinPositionForDiagonals(board, playerToCheck);
    }

    public boolean isDrawPosition(int[][] field) {
        boolean isEmpty = false;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (field[i][j] == -1) {
                    isEmpty = true;
                    break;
                }

            }
        }
        if (!isEmpty) {
            return !isWinPosition(field, 0) && !isWinPosition(field, 1);
        }
        return false;
    }

}



