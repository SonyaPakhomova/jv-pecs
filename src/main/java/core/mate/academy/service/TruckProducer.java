package core.mate.academy.service;

import core.mate.academy.model.Truck;
import java.util.ArrayList;
import java.util.List;

public class TruckProducer implements MachineProducer {
    @Override
    public List<Truck> get() {
        List<Truck> trucks = new ArrayList<>();
        trucks.add(new Truck(4, "Toyota"));
        trucks.add(new Truck(8, "Mercedes"));
        trucks.add(new Truck(12, "Ford"));
        return trucks;
    }
}