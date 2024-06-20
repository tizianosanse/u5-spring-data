package tizianosanseverino.u5_spring_data.entities.interfaces;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tizianosanseverino.u5_spring_data.entities.abstracts.Element;

import java.util.List;

@Repository
public interface ElementRepo extends JpaRepository<Element, Integer> {

    List<Element> findByCalories(int calories);
}
