package eu.pontsytems.springbootvuejs.controller;

import eu.pontsytems.springbootvuejs.dto.DelayDto;
import eu.pontsytems.springbootvuejs.entity.Delay;
import eu.pontsytems.springbootvuejs.repository.LatenessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@RestController()
@RequestMapping("/api")
public class LateController {

    @Autowired
    private LatenessRepository latenessRepository;

    @GetMapping("/delays")
    public List<DelayDto> get(){
        List<DelayDto> delayDtos = latenessRepository.findAll().stream().map(x -> entityToDto(x)).collect(Collectors.toList());
        delayDtos.sort(Comparator.comparing(DelayDto::getDelayDate));
        return delayDtos;
    }

    @GetMapping("/ranking")
    public List<DelayDto> getRanking(){
        return latenessRepository.getRankingByMinutes().stream().map(x -> entityToDto(x)).collect(Collectors.toList());
    }

    @PostMapping("/delay")
    public DelayDto save (@RequestBody DelayDto delayDto){
        Delay l = dtoToEntity(delayDto);
        Delay save = latenessRepository.save(l);
        return entityToDto(save);
    }

    private Delay dtoToEntity(DelayDto delayDto) {
        Delay l = new Delay();
        l.setName(delayDto.getName());
        l.setMinutes(delayDto.getMinutes());
        l.setDelayDate(delayDto.getDelayDate());
        return l;
    }

    private DelayDto entityToDto(Delay l) {
        DelayDto dto = new DelayDto();
        dto.setName(l.getName());
        dto.setMinutes(l.getMinutes());
        dto.setDelayDate(l.getDelayDate());
        return dto;
    }




}
