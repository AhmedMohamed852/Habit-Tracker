package ahmed.com.springboot.habittracker.dto.baseDto;

import ahmed.com.springboot.habittracker.model.enums.HabitFrequency;
import jakarta.validation.constraints.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class HabitDto {

    @NotBlank(message = "habit.name.is.required")
    private String name ;

    private String description;

    @NotNull(message = "habit.deadline.is.required")
    @FutureOrPresent(message = "habit.deadline.must.be.today.or.in.the.future")
    private LocalDate didLine;

    @NotNull(message = "habit.frequency.is.required")
    private HabitFrequency frequency;

}
