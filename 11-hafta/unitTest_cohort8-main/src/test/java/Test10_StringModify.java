import com.patika.StringModify;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test10_StringModify {
    StringModify stringModify;
    @BeforeEach
    void start(){
        stringModify = new StringModify();
        System.out.println("@beforeEach çalıştı");
    }
    @AfterEach
    void finish(){
        stringModify =null;
        System.out.println("@afterEach çalıştı");

    }

    @ParameterizedTest
    @CsvSource(value = {"MESUT,mesut","KEREM,kerem"})
    void modifyStringTest(String expected, String actual){
        assertEquals(expected,stringModify.modifyString(actual) );
        System.out.println(actual+" için çalıştı");
    }
}
