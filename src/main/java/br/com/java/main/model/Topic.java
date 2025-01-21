package br.com.java.main.model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Topic {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String message;
    private String courseName;
    private LocalDateTime createdAt;

    @ManyToOne
    private User author;

    // getters and setters
}
