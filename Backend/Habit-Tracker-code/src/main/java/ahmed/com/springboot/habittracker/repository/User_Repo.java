package ahmed.com.springboot.habittracker.repository;

import ahmed.com.springboot.habittracker.model.entity.User;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;

public interface User_Repo extends JpaRepository<User , Long> {
    boolean existsByEmail(String email);

    boolean existsByUserName(String userName);

    boolean existsByUserNameAndIdNot(String userName, Long id);

    boolean existsByEmailAndIdNot(String email, Long id);
}
