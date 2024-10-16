package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarServiceImp implements CarService {
    private static final List<Car> cars = new ArrayList<>();

        public CarServiceImp() {
            System.out.println("CarServiceImp constructor called");
            cars.add(new Car("1", 1, "black"));
            cars.add(new Car("2", 2, "white"));
            cars.add(new Car("3", 3, "red"));
            cars.add(new Car("4", 4, "green"));
            cars.add(new Car("5", 5, "yellow"));
        }
    @Override
    public List<Car> getCars(int count) {
        if (count <= 0) {
            return cars;
        } else if (count < cars.size()) {
            return cars.subList(0, count);
        } else {
            return cars;
        }
    }


}


