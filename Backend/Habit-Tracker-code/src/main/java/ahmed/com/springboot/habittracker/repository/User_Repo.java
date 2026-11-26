package ahmed.com.springboot.habittracker.repository;

import ahmed.com.springboot.habittracker.model.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Repo extends JpaRepository<User , Long> {
}
