package hu.Auto;

import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class FishingRod {
    private @Getter Fisher owner;

    @Autowired
    void setOwner(@Qualifier("Orvhorgasz") Fisher owner) {
        this.owner = owner;
        System.out.println(this.owner);
    }
}
