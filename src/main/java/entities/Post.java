package entities;
import jakarta.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private LocalDateTime postedAt = LocalDateTime.now();

    private String title;

    @Lob
    private String content;

    @ManyToOne
    @JoinColumn(name = "authorId")
    private Users author;

    @OneToMany(mappedBy = "post")
    private List<Tags> tags;

    @OneToMany(mappedBy = "post")
    private List<Category> categories;

    private LocalDateTime createdAt = LocalDateTime.now();

    private LocalDateTime updatedAt;

    @Enumerated(EnumType.STRING)
    private Status status = Status.pending;

    private Integer views = 1;
    //
}
