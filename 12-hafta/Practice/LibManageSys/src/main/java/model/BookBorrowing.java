package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "book_borrowing")
public class BookBorrowing {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "borrowing_id")
    private Long id;

    @Column
    private String borrowerName;

    @Column
    private Date borrowingDate;

    @Column
    private Date returnDate;

    @PrePersist
    public void prePersist() {
        this.borrowingDate = Date.valueOf(LocalDate.now());
        // convert java.time.LocalDate to java.sql.Date for db compatibility
    }

    @OneToMany(mappedBy = "borrowing", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<Book> bookList = new ArrayList<>();

}
