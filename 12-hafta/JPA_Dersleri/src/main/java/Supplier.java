import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "suppliers")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "supplier_id", columnDefinition = "serial")
    private Integer id;

    @Column(name = "address", nullable = false)
    private String address;

    @Column(name = "company", nullable = false)
    private String company;

    @Column(name = "supplier_mail", unique = true)
    private String mail;

    @Column(name = "supplier_contact")
    private String contact;

    @OneToMany(mappedBy = "supplier")
    private List<Product> productList;

    public Supplier() {
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                ", mail='" + mail + '\'' +
                ", contact='" + contact + '\'' +
                '}';
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public void setPerson(String person) {

    }
}