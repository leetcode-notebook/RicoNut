package hashmap;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/17 11:08 PM
 */
public class LC_1160_FindWordsThatCanBeFormedByCharactersTest {
    @Test
    public void test_find_words_that_can_be_formed_by_characters() {
        LC_1160_FindWordsThatCanBeFormedByCharacters fc = new LC_1160_FindWordsThatCanBeFormedByCharacters();
        assertThat(fc.countCharacters(new String[]{"cat", "bt", "hat", "tree"}, "atach"), is(6));
    }
}
