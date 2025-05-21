import com.patika.mockito.Calculate;
import com.patika.mockito.MathUtils;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test11_Mocking {
    @Test
    void Test_telIhtiyaciniHesapla(){
        MathUtils mockMathUtils = mock(MathUtils.class);

        //Davranış tanımlaması
        when(mockMathUtils.cevreHesapla(3,4)).thenReturn(14);

        Calculate calculate = new Calculate(mockMathUtils);

        //metodu test et
       int sonuc = calculate.telIhtiyaciniHesapla(3,4);

       assertEquals(42, sonuc);

    }
}
