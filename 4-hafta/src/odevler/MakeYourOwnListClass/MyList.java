package odevler.MakeYourOwnListClass;

public class MyList<T> {
    private T[] array;  // Verileri saklayacak dizi
    private int size;   // Listedeki eleman sayısı
    private int capacity; // Listenin kapasitesi

    @SuppressWarnings("unchecked")
    public MyList() {
        // Varsayılan kapasite 10 olarak belirleniyor
        this.capacity = 10;
        this.array = (T[]) new Object[this.capacity]; // Generic dizi oluşturuluyor
        this.size = 0; // Başlangıçta liste boş
    }

    @SuppressWarnings("unchecked")
    public MyList(int capacity) {
        // Kullanıcı tarafından belirlenen kapasiteye sahip liste oluşturuluyor
        this.capacity = capacity;
        this.array = (T[]) new Object[this.capacity]; // Generic dizi oluşturuluyor
        this.size = 0; // Başlangıçta liste boş
    }

    // Listedeki eleman sayısını döndüren metot
    public int size() {
        return this.size;
    }

    // Listenin kapasitesini döndüren metot
    public int getCapacity() {
        return this.capacity;
    }

    // Listeye yeni eleman ekleme metodu
    public void add(T data) {
        // Eğer kapasite dolmuşsa, kapasiteyi genişlet
        if (size == capacity) {
            expandCapacity();
        }
        // Yeni elemanı listeye ekleyip boyutu artır
        array[size++] = data;
    }

    @SuppressWarnings("unchecked")
    private void expandCapacity() {
        // Kapasite iki katına çıkarılıyor
        this.capacity *= 2;
        // Yeni boyutta bir dizi oluşturuluyor
        T[] newArray = (T[]) new Object[this.capacity];
        // Eski dizinin elemanları yeni diziye kopyalanıyor
        System.arraycopy(this.array, 0, newArray, 0, this.size);
        // Yeni dizi referansı eski diziye atanıyor
        this.array = newArray;
    }
}
