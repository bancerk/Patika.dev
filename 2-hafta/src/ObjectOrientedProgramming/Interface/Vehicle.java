package ObjectOrientedProgramming.Interface;

public interface Vehicle {

    public void start();
    // public kullanımı gereksiz çünkü doğası gereği interface methodları publictir.

    private void stop() {
        // java v.8 öncesi bu tanım hatalı
        // interface içerisinde public olmalı. değil ise body'e3 sahip olmalı{}
    }
    default void stop1(){
        // java v.8 öncesinde interface içerisinde default method tanımı yapılamıyordu
    }

    // default void stop2(); // default method ve body'si olmayan method tanımı yapılamaz


}
