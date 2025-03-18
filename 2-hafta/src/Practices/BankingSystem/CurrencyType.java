package Practices.BankingSystem;

public enum CurrencyType {

    TL("TL"),
    DOLAR("$"),
    EURO("€"),
    GOLD("G");

    private final String symbol;

    CurrencyType(String symbol) {
        this.symbol = symbol;
    }

    public String getSymbol() {
        return symbol;
    }

    public String setSymbol(){
        return symbol;
    }

}
