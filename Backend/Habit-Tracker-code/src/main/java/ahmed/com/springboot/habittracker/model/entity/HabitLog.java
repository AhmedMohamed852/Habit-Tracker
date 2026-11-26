package ahmed.com.springboot.habittracker.model.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class HabitLog extends BaseEntity{

    @Column(nullable = false)
    private LocalDate logDate;

    private boolean completed = false;

    private String note;



    // ToDo __________________- Relations -_____________________________

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "habit_id" , nullable = false)
    private Habit habit;


}
