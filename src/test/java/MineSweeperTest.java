import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MineSweeperTest {

    @Test
    public void change_a_mine_to_x_when_it_is_revealed() {
        // Given
        char[][] board = {{'M'}};
        MineSweeper mineSweeper = new MineSweeper(board);

        // When
        mineSweeper.update(0, 0);

        // Then
        assertThat(mineSweeper.board[0][0]).isEqualTo('X');
    }

    @Test
    public void change_an_empty_square_to_the_number_of_adjacent_mines_when_it_is_revealed() {
        // Given
        char[][] board = {
                {'M', 'E', 'E'},
                {'E', 'E', 'M'},
                {'E', 'M', 'E'}
        };
        MineSweeper mineSweeper = new MineSweeper(board);

        // When
        mineSweeper.update(0, 1);
        mineSweeper.update(0, 2);
        mineSweeper.update(1, 0);
        mineSweeper.update(1, 1);
        mineSweeper.update(2, 0);
        mineSweeper.update(2, 2);

        // Then
        assertThat(mineSweeper.board[0][1]).isEqualTo('2');
        assertThat(mineSweeper.board[0][2]).isEqualTo('1');
        assertThat(mineSweeper.board[1][0]).isEqualTo('2');
        assertThat(mineSweeper.board[1][1]).isEqualTo('3');
        assertThat(mineSweeper.board[2][0]).isEqualTo('1');
        assertThat(mineSweeper.board[2][2]).isEqualTo('2');
    }
}
