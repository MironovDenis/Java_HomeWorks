package HomeWork_5;

// На шахматной доске расставить 8 ферзей так, чтобы они не били друг друга. И вывести Доску. Пример вывода доски 8x8
// 0x000000
// 0000x000
// 00x00000

public class task5_3_chessBoard {

    private static boolean isSafe(int row, int col, int[][] board) { // Проверка безопасности ферзей

        for (int i = 0; i < 8; i++) {
            if (board[row][i] == 1 || board[i][col] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        for (int i = row, j = col; i < 8 && j >= 0; i++, j--) {
            if (board[i][j] == 1) {
                return false;
            }
        }

        return true;
    }

    private static boolean placeQueens(int col, int[][] board) { // Проверка расстановки ферзей

        if (col == 8) {
            return true;
        }

        for (int i = 0; i < 8; i++) {
            if (isSafe(i, col, board)) {
                board[i][col] = 1;

                if (placeQueens(col + 1, board)) {
                    return true;
                }

                board[i][col] = 0;
            }
        }

        return false;
    }

    public static void printBoard(int[][] board) { // Печать поля
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] board = new int[8][8];
        placeQueens(0, board);
        printBoard(board);
    }

}