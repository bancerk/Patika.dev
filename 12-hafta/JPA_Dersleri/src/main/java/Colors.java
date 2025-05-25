@Entity
public class Colors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String colorName;

    @OneToMany(mappedBy = "colors")
    private List<ProductColors> colorList;
}