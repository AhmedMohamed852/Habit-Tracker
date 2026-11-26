package ahmed.com.springboot.habittracker.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false , updatable = false , unique = true)
    @Id
    private long id;
}
