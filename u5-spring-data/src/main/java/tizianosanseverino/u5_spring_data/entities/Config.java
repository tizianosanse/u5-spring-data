package tizianosanseverino.u5_spring_data.entities;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import tizianosanseverino.u5_spring_data.entities.abstracts.Element;

@Configuration
public class Config {
@Bean
public Element getDrink(){

    return new Drink(128,5,"lemonade");
}

}
