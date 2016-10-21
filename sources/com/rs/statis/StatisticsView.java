package com.rs.statis;

import org.primefaces.ultima.domain.Car;
import org.primefaces.ultima.service.CarService;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.List;


@ManagedBean
@ViewScoped
public class StatisticsView implements Serializable {
    
    private List<Car> cars;
    
    @ManagedProperty("#{carService}")
    private CarService service;

    @PostConstruct
    public void init() {
        cars = service.createCars(10);
    }
    
    public List<Car> getCars() {
        return cars;
    }

    public void setService(CarService service) {
        this.service = service;
    }
}
