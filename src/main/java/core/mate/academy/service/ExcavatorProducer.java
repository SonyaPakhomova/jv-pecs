package core.mate.academy.service;

import core.mate.academy.model.Excavator;
import java.util.ArrayList;
import java.util.List;

public class ExcavatorProducer implements MachineProducer {

    @Override
    public List<Excavator> get() {
        List<Excavator> excavators = new ArrayList<>();
        excavators.add(new Excavator("wheeled", "black"));
        excavators.add(new Excavator("caterpillar", "blue"));
        excavators.add(new Excavator("walking", "red"));
        return excavators;
    }
}