public class CheapProduct {

    private int prod_id;
    private String prodName;
    private double prodPrice;

    public CheapProduct(int prod_id, String prodName, double prodPrice) {
        this.prod_id = prod_id;
        this.prodName = prodName;
        this.prodPrice = prodPrice;
    }

    public int getProd_id() {
        return prod_id;
    }

    public void setProd_id(int prod_id) {
        this.prod_id = prod_id;
    }

    public String getProdName() {
        return prodName;
    }

    public void setProdName(String prodName) {
        this.prodName = prodName;
    }

    public double getProdPrice() {
        return prodPrice;
    }

    public void setProdPrice(double prodPrice) {
        this.prodPrice = prodPrice;
    }

    @Override
    public String toString() {
        return "CheapProduct{" +
                "prod_id=" + prod_id +
                ", prodName='" + prodName + '\'' +
                ", prodPrice=" + prodPrice +
                '}';
    }
}
