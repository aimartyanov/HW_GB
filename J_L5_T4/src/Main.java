public class Main {
    private static final int BOARD_SIZE = 8;
    private static final int NO_QUEEN = 0;
    private static final int QUEEN = 1;
    private int[][] board;

    public Main() {
        board = new int[BOARD_SIZE][BOARD_SIZE];
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                board[row][col] = NO_QUEEN;
            }
        }
    }

    public void solve() {
        if (placeQueens(0)) {
            printBoard();
        } else {
            System.out.println("No solution exists");
        }
    }

    private boolean placeQueens(int col) {
        if (col == BOARD_SIZE) {
            return true;
        }
        for (int row = 0; row < BOARD_SIZE; row++) {
            if (isSafe(row, col)) {
                board[row][col] = QUEEN;
                if (placeQueens(col + 1)) {
                    return true;
                }
                board[row][col] = NO_QUEEN;
            }
        }
        return false;
    }

    private boolean isSafe(int row, int col) {
        for (int c = 0; c < col; c++) {
            if (board[row][c] == QUEEN) {
                return false;
            }
        }
        for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
            if (board[r][c] == QUEEN) {
                return false;
            }
        }
        for (int r = row, c = col; r < BOARD_SIZE && c >= 0; r++, c--) {
            if (board[r][c] == QUEEN) {
                return false;
            }
        }
        return true;
    }

    private void printBoard() {
        for (int row = 0; row < BOARD_SIZE; row++) {
            for (int col = 0; col < BOARD_SIZE; col++) {
                System.out.print((board[row][col] == QUEEN) ? "Q " : "- ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Main cb = new Main();
        cb.solve();
    }
}
