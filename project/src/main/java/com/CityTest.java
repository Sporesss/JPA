package com;

import com.models.CityEntity;
import com.service.Service;

import java.util.List;

public class CityTest {
    public static void main(String[] args) {
        Service service = new Service();
        showAllCities(service);

        CityEntity cityEntity = new CityEntity("NewCity");
        service.addCity(cityEntity);

        showAllCities(service);
    }

    private static void showAllCities(Service service) {
        List<CityEntity> cities = service.getAllCity();
        for (CityEntity city: cities) {
            System.out.println(city);
        }
    }
}
