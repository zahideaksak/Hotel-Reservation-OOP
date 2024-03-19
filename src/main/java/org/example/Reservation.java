package org.example;

import java.time.LocalDate;
import java.util.List;

public class Reservation {

    private int id;

    private LocalDate checkInDate;

    private LocalDate checkOutDate;

    private double totalAmount;


    //@ManyToOne
    //@JoinColumn(name = "guest_id")
    private Guest guest;

    //@ManyToOne
    //@JoinColumn(name = "hotel_id")
    private Hotel hotel;

    //@ManyToOne
    //@JoinColumn(name = "room_id")
    private Room room;

    //@JsonIgnore
    //@OneToMany(mappedBy = "reservation")
    private List<Review> reviews;


    public Reservation() {
    }

    public Reservation(int id, LocalDate checkInDate, LocalDate checkOutDate, double totalAmount, Guest guest, Hotel hotel,
                       Room room, List<Review> reviews) {
        super();
        this.id = id;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.totalAmount = totalAmount;
        this.guest = guest;
        this.hotel = hotel;
        this.room = room;
        this.reviews = reviews;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public double getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public LocalDate getCheckInDate() {
        return checkInDate;
    }

    public void setCheckInDate(LocalDate checkInDate) {
        this.checkInDate = checkInDate;
    }

    public LocalDate getCheckOutDate() {
        return checkOutDate;
    }

    public void setCheckOutDate(LocalDate checkOutDate) {
        this.checkOutDate = checkOutDate;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

}