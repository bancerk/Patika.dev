package CanliDers1.staticKeyword;

public class Counter {
    // Static değişken - tüm nesneler tarafından paylaşılır
    public static int count = 0;

    // Non-static değişken - her nesne için ayrı oluşturulur
    public int instanceNumber = 0;

    public Counter() {
        count++;
        instanceNumber = count;
    }
}
