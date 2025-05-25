import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

import java.time.Duration;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.assertTimeout;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test08_TimeOut_PerformanceTest {
    @Test
    void performanceTest(){
        assertTimeout(
                Duration.ofSeconds(1),
                ()-> IntStream.range(1,100).forEach(System.out::print)
        );
    }
    //------
    @Test
    @Timeout(2)
    void testPerformance2(){
       long sum = IntStream.range(1,10000).mapToLong(n->n*n).sum();
       assertTrue(sum>0);
    }
}
