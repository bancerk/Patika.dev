import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test09_GroupTests {
    @Nested
    class Group1{
        @Test
        void test1(){
            String s = "Merhaba";
            int ac = s.length();
            int ex = 7;

            assertEquals(ac,ex);
        }
        @Test
        void test2(){
            String s = "Merhaba";
            int ac = s.length();
            int ex = 7;

            assertEquals(ac,ex);
        }

    }
    @Nested
    class Group2{
        @Test
        void test3(){
            String s = "Merhaba";
            int ac = s.length();
            int ex = 7;

            assertEquals(ac,ex);
        }
        @Test
        void test4(){
            String s = "Merhaba";
            int ac = s.length();
            int ex = 7;

            assertEquals(ac,ex);
        }

    }
    @Nested
    class Group3{
        @Test
        void test5(){
            String s = "Merhaba";
            int ac = s.length();
            int ex = 7;

            assertEquals(ac,ex);
        }
        @Test
        void test6(){
            String s = "Merhaba";
            int ac = s.length();
            int ex = 7;

            assertEquals(ac,ex);
        }

    }
}
