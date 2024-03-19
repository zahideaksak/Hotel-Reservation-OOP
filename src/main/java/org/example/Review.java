package org.example;

//
public class Review {

    private int reviewId;

    private String comment;

    //@ManyToOne
    //@JoinColumn(name = "guest_id")
    private Guest guest;

    //@ManyToOne
    //@JoinColumn(name = "hotel_id")
    private Hotel hotel;

    //@ManyToOne
    //@JoinColumn(name = "reservation_id")
    private Reservation reservation;


    public Review() {
    }

    public Review(int reviewId, Guest guest, Hotel hotel, Reservation reservation, String comment) {
        super();
        this.reviewId = reviewId;
        this.guest = guest;
        this.hotel = hotel;
        this.reservation = reservation;
        this.comment = comment;
    }

    public int getReviewId() {
        return reviewId;
    }

    public void setReviewId(int reviewId) {
        this.reviewId = reviewId;
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

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

}