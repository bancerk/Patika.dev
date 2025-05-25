import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Test02_BeforeEach_AfterEach {
    String str;
    @BeforeEach
    void beforeEachh(){
        str = "junit ile test";
        System.out.println("beforeEach() çalıştı");
    }
    @AfterEach
    void afterEachh(){
        str ="";
        System.out.println("afterEach() çalıştı");

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
