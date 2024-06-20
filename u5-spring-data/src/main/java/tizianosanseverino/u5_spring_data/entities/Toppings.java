package tizianosanseverino.u5_spring_data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import tizianosanseverino.u5_spring_data.entities.abstracts.Element;
@Entity
@Table(name = "toppings")
@NoArgsConstructor
public class Toppings extends Element {
   @Id
   @GeneratedValue
   private int id;
    private String topping_name;

    public Toppings(int calories, double price, String topping_name) {
        super(calories, price);
        this.topping_name = topping_name;
    }
}
