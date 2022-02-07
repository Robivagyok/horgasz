package hu.Auto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bag {
    private @Getter FishingRod fishingrod;

    @Autowired
    void setFishingrod(FishingRod fishingrod) {
        this.fishingrod = fishingrod;
        System.out.println(this.fishingrod);
    }
}
