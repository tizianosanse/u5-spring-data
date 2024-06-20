package tizianosanseverino.u5_spring_data.entities.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import tizianosanseverino.u5_spring_data.entities.Drink;
import tizianosanseverino.u5_spring_data.entities.Pizza;
import tizianosanseverino.u5_spring_data.entities.Toppings;
import tizianosanseverino.u5_spring_data.entities.abstracts.Element;
import tizianosanseverino.u5_spring_data.entities.service.ElementService;

import java.util.Locale;
import java.util.Random;

@Component
public class ElementRunner implements CommandLineRunner {
    @Autowired
    private ElementService elementService;

    @Override
    public void run(String... args) throws Exception {

        Element element = new Pizza(1104,5,"margherita");
        Element element1 = new Pizza(1024,7,"hawaian");
        Element element2 = new Pizza(1060,6,"salami");
        Element element3 = new Drink(128,2,"lemonade");
        Element element4 = new Drink(0,1,"water");

        Element element5 = new Toppings(92,1,"cheese");
        Element element6= new Toppings(35,1,"ham");
        Element element7 = new Toppings(22,1,"onions");
        Element element8 = new Toppings(607,1,"pineapple");
        Element element9 = new Toppings(24,1,"salami");
        elementService.save(element);
        elementService.save(element1);
        elementService.save(element2);
        elementService.save(element3);
        elementService.save(element4);
        elementService.save(element5);
        elementService.save(element6);
        elementService.save(element7);
        elementService.save(element8);
        elementService.save(element9);
//       elementService.findByName("margherita").forEach(System.out::println);
       elementService.findByCalories(22).forEach(System.out::println);

    }
}
