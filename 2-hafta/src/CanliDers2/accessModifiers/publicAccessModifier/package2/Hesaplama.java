package CanliDers2.accessModifiers.publicAccessModifier.package2;

import CanliDers2.accessModifiers.publicAccessModifier.package1.Matematik;

public class Hesaplama {
    void hesapla() {
        double alan = Matematik.PI * 5 * 5;    // public sabite erişilebilir
        int toplam = Matematik.topla(10, 20);  // public metoda erişilebilir
    }
}
