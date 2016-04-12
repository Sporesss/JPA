package com.models;

import javax.persistence.*;

@Entity
@Table(name = "hotel", schema = "hotels_base")
public class HotelEntity {
    private int hotelId;
    private String hotelName;
    private Integer stars;
    private Integer price;
    private Integer freeRooms;
    private Integer cityId;

    @Id
    @Column(name = "hotel_id")
    public int getHotelId() {
        return hotelId;
    }

    public void setHotelId(int hotelId) {
        this.hotelId = hotelId;
    }

    @Basic
    @Column(name = "hotel_name")
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Basic
    @Column(name = "stars")
    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    @Basic
    @Column(name = "price")
    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    @Basic
    @Column(name = "free_rooms")
    public Integer getFreeRooms() {
        return freeRooms;
    }

    public void setFreeRooms(Integer freeRooms) {
        this.freeRooms = freeRooms;
    }

    @Basic
    @Column(name = "city_id")
    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        HotelEntity that = (HotelEntity) o;

        if (hotelId != that.hotelId) return false;
        if (hotelName != null ? !hotelName.equals(that.hotelName) : that.hotelName != null) return false;
        if (stars != null ? !stars.equals(that.stars) : that.stars != null) return false;
        if (price != null ? !price.equals(that.price) : that.price != null) return false;
        if (freeRooms != null ? !freeRooms.equals(that.freeRooms) : that.freeRooms != null) return false;
        if (cityId != null ? !cityId.equals(that.cityId) : that.cityId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = hotelId;
        result = 31 * result + (hotelName != null ? hotelName.hashCode() : 0);
        result = 31 * result + (stars != null ? stars.hashCode() : 0);
        result = 31 * result + (price != null ? price.hashCode() : 0);
        result = 31 * result + (freeRooms != null ? freeRooms.hashCode() : 0);
        result = 31 * result + (cityId != null ? cityId.hashCode() : 0);
        return result;
    }
}
