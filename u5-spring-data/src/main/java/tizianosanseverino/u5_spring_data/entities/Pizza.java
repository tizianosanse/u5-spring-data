package tizianosanseverino.u5_spring_data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import tizianosanseverino.u5_spring_data.entities.abstracts.Element;
@Entity
@Table(name = "pizze")
@NoArgsConstructor
public class Pizza extends Element {
   @Id
   @GeneratedValue
   private int id;

    private String pizzaName;

    public Pizza(int calories, double price, String pizzaName) {
        super(calories, price);
        this.pizzaName = pizzaName;
    }
}
