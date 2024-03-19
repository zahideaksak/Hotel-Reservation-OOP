package org.example;

public class RoomReservation {

    public int id;

    //@ManyToOne
    //@JoinColumn(name = "reservation_id")
    public Reservation reservation;

    //@ManyToOne
    //@JoinColumn(name = "guest_id")
    public Guest guest;

    public RoomReservation() {
    }

    public RoomReservation(int id, Reservation reservation, Guest guest) {
        super();
        this.id = id;
        this.reservation = reservation;
        this.guest = guest;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

}