package tizianosanseverino.u5_spring_data.entities.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tizianosanseverino.u5_spring_data.entities.Toppings;
import tizianosanseverino.u5_spring_data.entities.abstracts.Element;
import tizianosanseverino.u5_spring_data.entities.interfaces.ElementRepo;
import tizianosanseverino.u5_spring_data.exceptions.ItemNotFoundException;

import java.util.List;

@Service
public class ElementService {

    @Autowired
    private ElementRepo elementRepo;
    public void save(Element element) {
        elementRepo.save(element);
    }
    public Element findById(int userId) {

        return elementRepo.findById(userId).orElseThrow(() -> new ItemNotFoundException(userId));
    }
//    public List<Element> findByName(String name) {
//        return elementRepo.findByName(name);
//
//    }
    public List<Element> findByCalories(int calories) {
        return elementRepo.findByCalories(calories);
    }
}
