package tn.isims.demoproject.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor @ToString
@Component
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

    @Column(nullable = false )
    private String title ;

    @Column(nullable = false , unique = true)
    private String isbn;

    @Column(nullable = false)
    private String author ;

    @Column(nullable = false)
    private double prix ;
}
