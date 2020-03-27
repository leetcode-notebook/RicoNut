package array;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/27 10:07 PM
 */
public class LC_914_XOfAKindInADeckOfCardsTest {
    @Test
    public void test_x_of_kind_in_a_deck_of_cards() {
        LC_914_XOfAKindInADeckOfCards cards = new LC_914_XOfAKindInADeckOfCards();
        assertThat(cards.hasGroupsSizeX(new int[]{1, 2, 3, 4, 4, 3, 2, 1}), is(true));
        assertThat(cards.hasGroupsSizeX(new int[]{1, 1, 1, 2, 2, 2, 3, 3}), is(false));
        assertThat(cards.hasGroupsSizeX(new int[]{1, 1, 2, 2, 2, 2}), is(true));
    }
}
