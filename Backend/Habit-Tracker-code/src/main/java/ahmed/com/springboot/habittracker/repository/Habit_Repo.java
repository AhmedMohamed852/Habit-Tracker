package ahmed.com.springboot.habittracker.repository;

import ahmed.com.springboot.habittracker.model.entity.Habit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Habit_Repo extends JpaRepository<Habit, Long> {
}
