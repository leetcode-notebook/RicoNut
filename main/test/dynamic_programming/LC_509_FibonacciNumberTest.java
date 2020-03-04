package dynamic_programming;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * @author liangqian0723@gmail.com
 * @since 2020/3/4 1:37 PM
 */
public class LC_509_FibonacciNumberTest {
    @Test
    public void fib(){
        LC_509_FibonacciNumber fibonacciNumber = new LC_509_FibonacciNumber();
        assertThat(fibonacciNumber.fib(2), is(1));
        assertThat(fibonacciNumber.fib(3), is(2));
        assertThat(fibonacciNumber.fib(4), is(3));
    }

    @Test
    public void fib_loop(){
        LC_509_FibonacciNumber fibonacciNumber = new LC_509_FibonacciNumber();
        assertThat(fibonacciNumber.fib_loop(2), is(1));
        assertThat(fibonacciNumber.fib_loop(3), is(2));
        assertThat(fibonacciNumber.fib_loop(4), is(3));
    }

    @Test
    public void fib_dp_array(){
        LC_509_FibonacciNumber fibonacciNumber = new LC_509_FibonacciNumber();
        assertThat(fibonacciNumber.fib_dp_array(0), is(0));
        assertThat(fibonacciNumber.fib_dp_array(2), is(1));
        assertThat(fibonacciNumber.fib_dp_array(3), is(2));
        assertThat(fibonacciNumber.fib_dp_array(4), is(3));
        assertThat(fibonacciNumber.fib_dp_array(5), is(5));
    }
}
