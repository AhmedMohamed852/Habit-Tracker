package ahmed.com.springboot.habittracker.repository;

import ahmed.com.springboot.habittracker.model.entity.HabitLog;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HabitLog_Repo extends JpaRepository<HabitLog , Long> {
}
