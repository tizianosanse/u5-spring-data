package tizianosanseverino.u5_spring_data.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.NoArgsConstructor;
import tizianosanseverino.u5_spring_data.entities.abstracts.Element;
@Entity
@Table(name = "drinks")
@NoArgsConstructor
public class Drink extends Element {
    @Id
    @GeneratedValue
    private int id;

    private String drink_name;

    public Drink(int calories, double price, String drink_name) {
        super(calories, price);
        this.drink_name = drink_name;
    }
}
