package canliDers.interfacee;

public interface Ac extends TestInterface {
    /*
    interface içinde tanımlanan değişkenler default olarek;
      public, static ve final.
     */

    //interface lerde yalnızca abstract metot olur. concrete metot olmaz. Bu nedenle interfaclerin
    //"fully abstraction" özelliği vardır.
    String name = "ac name";

    void digital();

    /*

    interface->interface  => extends
    class->interface  => implements
    class->class  => extends

    interface -> class  => implements
     */

    public default int add(int a, int b){
        return a+b;
    }
    public static int add2(int a, int b){
        return a+b;
    }
}
