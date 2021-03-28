package course3.firstPersistence.data;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.List;

@Repository
public interface PlantRepository extends JpaRepository<Plant, Long> {
    @Query("select p.delivery.completed from Plant p where p.id = :plantId")
    Boolean deliveryCompleted(Long plantId);

    List<Plant> findByPriceLessThan(BigDecimal price);
}
