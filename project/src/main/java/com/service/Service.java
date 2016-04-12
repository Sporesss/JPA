package com.service;

import com.dao.DAO;
import com.models.CityEntity;

import java.util.List;

public class Service {
    private DAO dao;

    public DAO getDAO() {
        synchronized (Service.class) {
            if (dao == null) {
                dao = new DAO();
            }
        }
        return dao;
    }

    public void addCity(CityEntity cityEntity) {
        getDAO().addCity(cityEntity);
    }

    public List<CityEntity> getAllCity() {
        return getDAO().getAllCityList();
    }
}
