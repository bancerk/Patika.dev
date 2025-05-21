import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertThrows;

public class Test05_DisplayName {
    @Test
    @DisplayName("parsInt() metoduna numeric olmayan argüman gönderildiğinde.......")
    void test(){
        String str ="java";
        assertThrows(NumberFormatException.class,()->
                Integer.parseInt(str));
    }
}
