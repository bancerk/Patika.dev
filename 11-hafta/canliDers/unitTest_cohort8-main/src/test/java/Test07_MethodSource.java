import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test07_MethodSource {
    @ParameterizedTest
    @MethodSource("length")
    void testLength(String input, int expectedLength){
        assertEquals(expectedLength,input.length());
    }

 //test metoduna veri sağlayan metot
    static Stream<Arguments> length(){
        return Stream.of(
                Arguments.of("java",4),
                Arguments.of("spring",6),
                Arguments.of("junit",5)
        );
    }
}
