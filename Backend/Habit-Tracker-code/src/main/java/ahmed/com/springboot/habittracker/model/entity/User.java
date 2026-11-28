package ahmed.com.springboot.habittracker.model.entity;

import jakarta.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "users")
public class User extends BaseEntity {

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false, unique = true)
    private String userName;

    private String profilePicture;

    @Column(length = 20)
    private String country;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, length = 255)
    private String password;

    // ToDo __________________- Relations -_____________________________

    @OneToMany(mappedBy = "user" , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private Set<Habit> habits = new HashSet<>();

}