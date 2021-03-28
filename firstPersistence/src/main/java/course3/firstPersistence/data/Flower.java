package course3.firstPersistence.data;

import org.hibernate.annotations.Nationalized;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
public class Flower extends Plant{

    private String color;

    public Flower(String color) {
        this.color = color;
    }

    public Flower() {
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
