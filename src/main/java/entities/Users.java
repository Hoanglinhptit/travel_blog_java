package entities;
import jakarta.persistence.*;
import java.util.List;
@Entity
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(unique = true)
    private String email;

    private String name;

    private String password;

    private String role = "user";

    @OneToMany(mappedBy = "author")
    private List<Post> posts;
}
