package ahmed.com.springboot.habittracker.dto.baseDto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PastOrPresent;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class HabitLogDto {

    @PastOrPresent(message = "habit.log.date.cannot.be.in.the.future")
    private LocalDate logDate;

    @NotNull(message = "habit.log.completed.is.required")
    private Boolean completed ;

    @Size(max = 500, message = "habit.log.note.must.not.exceed.500.characters")
    private String note;

}
