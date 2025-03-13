package CanliDers1.staticKeyword;

public class StaticVariableExample {
    public static void main(String[] args) {
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        Counter c3 = new Counter();

        System.out.println("c1.instanceNumber = " + c1.instanceNumber); // 1
        System.out.println("c2.instanceNumber = " + c2.instanceNumber); // 2
        System.out.println("c3.instanceNumber = " + c3.instanceNumber); // 3

        // Static değişkene sınıf adı ile erişim
        System.out.println("Counter.count = " + Counter.count); // 3

        // Static değişkene nesne ile erişim (önerilmez)
        System.out.println("c1.count = " + c1.count); // 3
    }
}
