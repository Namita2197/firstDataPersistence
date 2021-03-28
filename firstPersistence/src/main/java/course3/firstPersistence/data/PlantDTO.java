package course3.firstPersistence.data;

import org.hibernate.annotations.Nationalized;

import javax.persistence.Column;
import java.math.BigDecimal;

public class PlantDTO {
    private String name;
    private BigDecimal price;
}
