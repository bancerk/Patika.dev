import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class Test01_Assertions01 {
    @Test
    public void test(){

    }
    @Test
    void testLength(){
        String str = "Merhaba Dünya";
        int actual = str.length();
        int expected = 13;

        assertEquals(expected,actual);
    }
    @Test
    void testContains(){
      assertEquals(true, "patika".contains("p"));
    }
    //@Test
    @RepeatedTest(5)
    void testNotEquals(){
        String actual = "hello";
        String expected = "HELLO";

        assertNotEquals(actual,expected);

    }
    @Test
    void testTrue(){
        int a = 15;
        int b = 12;

        assertTrue(a>b);
    }
    @Test
    void testFalse(){
        int a = 15;
        int b = 16;

        assertFalse(a>b);
    }
    //-------------- 13.05.2025
    @Test
    void testNull(){
        String userName=null;
        assertNull(userName,"test başarısız");
    }
    @Test
    void testObjects(){
        String a = "hello";
        String b = "hello";
        String c = new String("hello");
        String d = new String("hello");

        //assertSame(d,c);
        assertNotSame(c,d);
    }
    @Test
    void testArrays(){
        String str = "Junit patika dev";
        String[] actualArray = str.split(" ");
        String[] expectedArray = {"Junit","patika","dev"};

        //assertTrue(Arrays.equals(actualArray,expectedArray));
        assertArrayEquals(actualArray, expectedArray);

    }

}
