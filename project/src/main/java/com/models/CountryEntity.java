package com.models;

import javax.persistence.*;

@Entity
@Table(name = "country", schema = "hotels_base")
public class CountryEntity {
    private int countryId;
    private String countryName;
    private String language;
    private int capitalId;
    private String currency;

    @Id
    @Column(name = "country_id")
    public int getCountryId() {
        return countryId;
    }

    public void setCountryId(int countryId) {
        this.countryId = countryId;
    }

    @Basic
    @Column(name = "country_name")
    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    @Basic
    @Column(name = "language")
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Basic
    @Column(name = "capital_id")
    public int getCapitalId() {
        return capitalId;
    }

    public void setCapitalId(int capitalId) {
        this.capitalId = capitalId;
    }

    @Basic
    @Column(name = "currency")
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CountryEntity that = (CountryEntity) o;

        if (countryId != that.countryId) return false;
        if (capitalId != that.capitalId) return false;
        if (countryName != null ? !countryName.equals(that.countryName) : that.countryName != null) return false;
        if (language != null ? !language.equals(that.language) : that.language != null) return false;
        if (currency != null ? !currency.equals(that.currency) : that.currency != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = countryId;
        result = 31 * result + (countryName != null ? countryName.hashCode() : 0);
        result = 31 * result + (language != null ? language.hashCode() : 0);
        result = 31 * result + capitalId;
        result = 31 * result + (currency != null ? currency.hashCode() : 0);
        return result;
    }
}
