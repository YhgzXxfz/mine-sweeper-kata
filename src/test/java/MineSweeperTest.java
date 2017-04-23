import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MineSweeperTest {

    @Test
    public void change_a_mine_to_x_when_it_is_revealed() {
        // Given
        char[][] board = {{'M'}};
        MineSweeper mineSweeper = new MineSweeper(board);

        // When
        int x = 0, y = 0;
        mineSweeper.update(x, y);

        // Then
        assertThat(mineSweeper.board[x][y]).isEqualTo('X');
    }
}
