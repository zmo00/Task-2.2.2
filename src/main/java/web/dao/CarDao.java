package web.dao;

import web.models.Car;

import java.util.List;

public interface CarDao {
    List<Car> getCarList();
    List<Car> getLimitCarList(int limit);
}
