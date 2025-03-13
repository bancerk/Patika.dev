package CanliDers2.accessModifiers.defaultAccessModifier.package1;

class SurucuTest {
    void test() {
        Araba araba = new Araba(); // Erişilebilir
        araba.hiz = 50;            // Erişilebilir
        araba.hizlandir();         // Erişilebilir
    }
}
