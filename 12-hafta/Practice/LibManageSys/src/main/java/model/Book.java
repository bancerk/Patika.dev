package model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "book_title",nullable = false)
    private String name;

    @Column
    private Date publicationYear;

    @Column
    private Integer stock;

    @ManyToMany(mappedBy = "bookList")
    private List<Category> categoryList = new ArrayList<>();

}
