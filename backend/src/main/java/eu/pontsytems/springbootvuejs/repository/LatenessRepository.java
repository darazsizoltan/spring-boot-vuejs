package eu.pontsytems.springbootvuejs.repository;

import eu.pontsytems.springbootvuejs.entity.Delay;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface LatenessRepository extends JpaRepository<Delay, Long> {

    @Query("select new Delay(t.name, sum(t.minutes)) from Delay t group by t.name")
    List<Delay> getRankingByMinutes();
}
