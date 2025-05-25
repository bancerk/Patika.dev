import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test03_BeforeAll_AfterAll {

    static String str;

    @BeforeAll
    static void beforeAlll() {
        str = "junit ile test";
        System.out.println("@beforeAll() çalıştı");
    }

    @AfterAll
    static void afterAll() {
        str = "";
        System.out.println("@afterAll() çalıştı");

    }

    @Test
    void testArrays(TestInfo info){
        String[] actualArray = str.split(" ");
        String[] expectedArray = {"junit","ile","test"};

        System.out.println(info.getDisplayName()+" çalıştı");
        assertArrayEquals(actualArray, expectedArray);
    }
    @Test
    void testLength(TestInfo info){
        int ac = str.length();
        int ex = 14;
        System.out.println(info.getTestClass() +" çalıştı");
        assertEquals(ex,ac);
    }
}
