package course3.firstPersistence.service;

import course3.firstPersistence.data.Delivery;
import course3.firstPersistence.data.DeliveryRepository;
import course3.firstPersistence.data.RecipientAndPrice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeliveryService {
    @Autowired
    DeliveryRepository deliveryRepository;

    public Long save(Delivery delivery) {
        delivery.getPlants().forEach(plant -> plant.setDelivery(delivery));
        deliveryRepository.persist(delivery);
        return delivery.getId();
    }
    public RecipientAndPrice getBill(Long deliveryId){
        return deliveryRepository.getBill(deliveryId);
    }
}
