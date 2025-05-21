package com.patika.mockito;

public class Calculate {
    private final MathUtils mathUtils;

    public Calculate(MathUtils mathUtils) {
        this.mathUtils = mathUtils;
    }

    public int telIhtiyaciniHesapla(int a, int b){
        int cevre = mathUtils.cevreHesapla(a,b);
        return cevre*3;
    }
}
