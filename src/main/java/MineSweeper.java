public class MineSweeper {
    public char[][] board;

    public MineSweeper(char[][] board) {
        this.board = board;
    }

    public void update(int x, int y) {
        board[x][y] = 'X';
    }
}
