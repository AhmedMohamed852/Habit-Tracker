package ahmed.com.springboot.habittracker.mapper;


import ahmed.com.springboot.habittracker.dto.baseDto.HabitDto;
import ahmed.com.springboot.habittracker.model.entity.Habit;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;

@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HabitMapper {

    Habit To_habitEntity (HabitDto habitDto);

    HabitDto To_habit_Dto (Habit habit);


}
