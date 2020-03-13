package thread;

import java.util.concurrent.CountDownLatch;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/13 1:14 AM
 */
public class LC_1114_PrintInOrder {
//    public static volatile int count = 0;

    private CountDownLatch c2;
    private CountDownLatch c3;

    public LC_1114_PrintInOrder() {
        this.c2 = new CountDownLatch(1);
        this.c3 = new CountDownLatch(1);
    }

    public void first(Runnable printFirst) throws InterruptedException {
//        while (count % 3 != 0) {
//        }
//        count++;



        // printFirst.run() outputs "first". Do not change or remove this line.
        printFirst.run();
        c2.countDown();
    }

    public void second(Runnable printSecond) throws InterruptedException {
//        while (count %3 != 1) {}
//        count++;

        c2.await();

        // printSecond.run() outputs "second". Do not change or remove this line.
        printSecond.run();
        c3.countDown();
    }

    public void third(Runnable printThird) throws InterruptedException {
//        while (count % 3 != 2) {}
//        count++;

        c3.await();

        // printThird.run() outputs "third". Do not change or remove this line.
        printThird.run();
    }

}
