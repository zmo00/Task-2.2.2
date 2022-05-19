package web.dao;

import org.springframework.stereotype.Repository;
import web.models.Car;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class CarDaoImpl implements CarDao {

    private List<Car> carList;
    {
        carList = new ArrayList<>();

        carList.add(new Car("BMV", "X", 6));
        carList.add(new Car("Toyota", "LandCruiser", 300));
        carList.add(new Car("Kia", "K", 5));
        carList.add(new Car("Volkswagen", "Polo", 1));
        carList.add(new Car("Lada", "Vesta", 1));
    }

    @Override
    public List<Car> getCarList() {
        return carList;
    }

    @Override
    public List<Car> getLimitCarList(int limit) {
        List<Car> result = carList.stream().collect(Collectors.toList());
        Collections.shuffle(result);
        return result.stream().limit(limit).collect(Collectors.toList());
    }
}
