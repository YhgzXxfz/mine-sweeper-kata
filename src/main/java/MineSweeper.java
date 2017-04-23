public class MineSweeper {
    public char[][] board;

    public MineSweeper(char[][] board) {
        this.board = board;
    }

    public void update(int x, int y) {
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
            return ;
        }

        int rows = board.length, cols = board[0].length, numberOfMines = 0;
        for (int i = Math.max(x-1, 0); i <= Math.min(x+1, rows-1); ++i) {
            for (int j = Math.max(y-1, 0); j <= Math.min(y+1, cols-1); ++j) {
                if (board[i][j] == 'M') {
                    numberOfMines++;
                }
            }
        }
        board[x][y] = (char) ('0'+numberOfMines);
    }
}
