package thread;

import org.junit.Test;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/13 1:13 AM
 */
public class LC_1114_PrintInOrderTest {
    @Test
    public void test_print_in_order() throws InterruptedException {
        LC_1114_PrintInOrder pro = new LC_1114_PrintInOrder();
        pro.first(() -> {
            System.out.println(1);
        });
        pro.second(() -> {
            System.out.println(2);
        });
        pro.third(() -> {
            System.out.println(3);
        });
    }
}
