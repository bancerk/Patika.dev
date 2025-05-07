package week9.enums;

public enum Cities {
    ISTANBUL(34,20,"MARMARA"),
    ANKARA(6, 5.7, "IC_ANADOLU"),
    IZMIR(35, 4.4, "EGE"),
    BURSA(16, 3.1, "MARMARA"),
    ANTALYA(7, 2.6, "AKDENIZ"),
    KONYA(42, 2.3, "IC_ANADOLU"),
    ADANA(1, 2.2, "AKDENIZ"),
    GAZIANTEP(27, 2.1, "GUNEYDOGU"),
    DIYARBAKIR(21, 1.8, "GUNEYDOGU"),
    ESKISEHIR(26, 0.9, "IC_ANADOLU");

    private final int plaka;
    private final double nufus;
    private final String bolge;

    public int getPlaka() {
        return plaka;
    }

    public double getNufus() {
        return nufus;
    }

    public String getBolge() {
        return bolge;
    }

    Cities(int plaka, double nufus, String bolge) {
        this.plaka = plaka;
        this.nufus = nufus;
        this.bolge = bolge;
    }
}
