package instructor.lesson_5.demo_2;

import java.util.Arrays;

class Demo2 {

    public static void main(String[] args) {

        char[][] board = {
                {'x', '.', 'x'},
                {'.', 'o', '.'},
                {'o', '.', 'o'}
        };

        System.out.println("board = " + Arrays.deepToString(board));

        System.out.println("Before:");
        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));

        // 0 - row, 1 - column
        board[0][1] = 'x';

        System.out.println("After:");
        System.out.println(Arrays.toString(board[0]));
        System.out.println(Arrays.toString(board[1]));
        System.out.println(Arrays.toString(board[2]));

    }
}
