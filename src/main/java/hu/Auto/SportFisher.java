package hu.Auto;

import org.springframework.stereotype.Component;

@Component
public class SportFisher implements Fisher{

    @Override
    public void catchFish(Fish fish) {
        System.out.println("Megfogtam a " +fish.getName()+"halat");
    }
}
