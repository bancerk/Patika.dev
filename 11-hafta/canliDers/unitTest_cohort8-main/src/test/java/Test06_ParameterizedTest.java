import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class Test06_ParameterizedTest {
    @Test
    void testLength() {
        assertTrue("Mesut".length() > 0);
        assertTrue("canberk".length() > 0);
        assertTrue("velihan".length() > 0);
        assertTrue("Mert".length() > 0);
        assertTrue("suhedaa".length() > 0);
        assertTrue("Mustafa".length() > 0);
        assertTrue("Samet".length() > 0);
    }

    @ParameterizedTest
    @ValueSource(strings = {"Mesut", "canberk", "velihan", "Mert"})
    void testLength2(String str) {
        assertTrue(str.length() > 0);
    }

    //-------------------------------------
    @Test
    void testToUppercase() {
        String str1 = "Merhaba";
        String str2 = "Java";
        String str3 = "Test";

        assertEquals("MERHABA", str1.toUpperCase());
        assertEquals("JAVA", str2.toUpperCase());
        assertEquals("TEST", str3.toUpperCase());
    }

    //Coma Seperate Values---
    @ParameterizedTest
    @CsvSource(value = {
            "MERHABA,merhaba",
            "JAVA,java",
            "TEST,test"
    })
    void testToUpperCase2(String str1, String str2) {
        assertEquals(str1, str2.toUpperCase());
    }
    //---------------------------------
    /*
    java -> a - - - >assertTrue(contains)
    junit -> u - - - >assertTrue(contains)
    hello -> a - - - >assertFalse(contains)
     */
    @ParameterizedTest
    @CsvSource(value = {"true,java,a", "true,junit,u", "false,hello,a"})
    void testContains(boolean b, String str1, String str2){
        assertEquals(b,str1.contains(str2));
    }
}
