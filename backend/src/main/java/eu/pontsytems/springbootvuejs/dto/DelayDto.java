package eu.pontsytems.springbootvuejs.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class DelayDto {

    private String name;

    private Long minutes;

    private LocalDate delayDate;
}
