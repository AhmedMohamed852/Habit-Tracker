package ahmed.com.springboot.habittracker.model.entity;

import ahmed.com.springboot.habittracker.model.enums.HabitFrequency;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Table(name = "Habit")
public class Habit extends BaseEntity {

    @Column(name = "name" , nullable = false )
    private String name ;

    private String description;


    @Column(name = "didLine" ,nullable = false)
    private LocalDate didLine;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private HabitFrequency frequency;


    private boolean isActive = true;

    // ToDo __________________- Relations -_____________________________

    @ManyToOne( fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id" , nullable = false )
    private User user;

    @OneToMany(mappedBy = "habit" , fetch = FetchType.LAZY , cascade = CascadeType.ALL)
    private List<HabitLog> habitLogs = new ArrayList<>();
}
