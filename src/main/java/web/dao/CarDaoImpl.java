package web.dao;

import web.models.Car;

import java.util.ArrayList;
import java.util.List;

public class CarDaoImpl implements CarDao {

    private List<Car> carList;
    {
        carList = new ArrayList<>();

        carList.add(new Car("BMV", "X", 6));
        carList.add(new Car("Toyota", "Land Cruiser", 300));
        carList.add(new Car("Kia", "K", 5));
        carList.add(new Car("Volkswagen", "Polo", 1));
        carList.add(new Car("Lada", "Vesta", 1));
    }



}
