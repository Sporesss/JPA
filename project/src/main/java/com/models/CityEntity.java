package com.models;

import javax.persistence.*;

@Entity
@Table(name = "city", schema = "hotels_base")
public class CityEntity {
    private int id;
    private String cityName;
    private Integer population;
    private Integer countryId;

    public CityEntity() {
    }

    public CityEntity(String cityName) {
        this.cityName = cityName;
    }

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "city_name")
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    @Basic
    @Column(name = "population")
    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    @Basic
    @Column(name = "country_id")
    public Integer getCountryId() {
        return countryId;
    }

    public void setCountryId(Integer countryId) {
        this.countryId = countryId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CityEntity that = (CityEntity) o;

        if (id != that.id) return false;
        if (cityName != null ? !cityName.equals(that.cityName) : that.cityName != null) return false;
        if (population != null ? !population.equals(that.population) : that.population != null) return false;
        if (countryId != null ? !countryId.equals(that.countryId) : that.countryId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (cityName != null ? cityName.hashCode() : 0);
        result = 31 * result + (population != null ? population.hashCode() : 0);
        result = 31 * result + (countryId != null ? countryId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "CityEntity{" +
                "id=" + id +
                ", cityName='" + cityName + '\'' +
                ", population=" + population +
                ", countryId=" + countryId +
                '}';
    }
}
