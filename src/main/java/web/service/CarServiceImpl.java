package web.service;

import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> getCar(Integer count) {
        List<Car> carList; {
            carList = new ArrayList<>();
            carList.add(new Car("Mercedes-Benz", "350", 1990));
            carList.add(new Car("Lada", "Granta", 2015));
            carList.add(new Car("BMW", "M#3", 2018));
            carList.add(new Car("Hyundai", "Santa Fe", 2017));
            carList.add(new Car("Volkswagen", "Touareg", 2019));
        }
        return carList.stream().limit(count).collect(Collectors.toList());
    }
}