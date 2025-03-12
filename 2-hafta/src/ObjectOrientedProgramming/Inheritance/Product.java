package ObjectOrientedProgramming.Inheritance;

public class Product { // extends Object not: her zaman eklemeseniz de bu şekilde inheritance gerçekleşir
    private String name;
    private double price;

    public Product(){
        // constructor örneği - adı class ile aynı olmalı yoksa geçersiz tanım
        // default constructor her zaman olur fakat yeni bir
        // constructor oluşturursanız bu default method gider
    }

    public Product (String name){
        this.name = name;
    }

    public Product (String name, double price){
        this.name = name;
        this.price = price;
    }






    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
