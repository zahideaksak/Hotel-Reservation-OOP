package org.example;

import java.util.List;

//@Table(name = "hotels")
public class Hotel extends User{

    private String hotelName;

    private String companyName;

    private int numberOfEmployee;

    //@JsonIgnore
    //@OneToMany(mappedBy = "hotel")
    private List<Room> rooms;

    //@JsonIgnore
    //@OneToMany(mappedBy = "hotel")
    private List<Review> reviews;

    //@JsonIgnore
    //@OneToMany(mappedBy = "hotel")
    private List<HotelService> hotelServices;

    public Hotel() {
    }

    public Hotel(String hotelName, String companyName, int numberOfEmployee, List<Room> rooms,
                 List<Review> reviews, List<HotelService> hotelServices) {
        this.hotelName = hotelName;
        this.companyName = companyName;
        this.numberOfEmployee = numberOfEmployee;
        this.rooms = rooms;
        this.reviews = reviews;
        this.hotelServices = hotelServices;
    }


    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public int getNumberOfEmployee() {
        return numberOfEmployee;
    }

    public void setNumberOfEmployee(int numberOfEmployee) {
        this.numberOfEmployee = numberOfEmployee;
    }

    public List<Room> getRooms() {
        return rooms;
    }

    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public List<HotelService> getHotelServices() {
        return hotelServices;
    }

    public void setHotelServices(List<HotelService> hotelServices) {
        this.hotelServices = hotelServices;
    }


}