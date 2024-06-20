package tizianosanseverino.u5_spring_data.entities.abstracts;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;
@Entity
@Getter
@ToString
@NoArgsConstructor
@Table(name = "restaurant_item")
@Inheritance(strategy = InheritanceType.JOINED)
public  abstract class  Element {
    @Id
    @GeneratedValue
    private int id;
    protected int calories;
    protected double price;

    public Element(int calories, double price) {
        this.calories = calories;
        this.price = price;
    }
}
