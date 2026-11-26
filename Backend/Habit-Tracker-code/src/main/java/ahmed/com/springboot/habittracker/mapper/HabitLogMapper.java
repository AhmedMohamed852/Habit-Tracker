package ahmed.com.springboot.habittracker.mapper;

import ahmed.com.springboot.habittracker.dto.baseDto.HabitLogDto;
import ahmed.com.springboot.habittracker.model.entity.HabitLog;
import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;



@Mapper(componentModel = "spring" , unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface HabitLogMapper {

    HabitLog To_habitLogEntity (HabitLogDto habitLogDto);
    HabitLogDto To_habitLogDto (HabitLog habitLog);

}
