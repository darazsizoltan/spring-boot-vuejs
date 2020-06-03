package eu.pontsytems.springbootvuejs.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
@Table(name = "delay")
@NoArgsConstructor
public class Delay {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;

    private Long minutes;

    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate delayDate;

    public Delay(String name, Long minutes) {
        this.name = name;
        this.minutes = minutes;
    }
}
