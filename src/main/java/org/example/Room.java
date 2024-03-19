package org.example;

import java.util.List;

public class Room {

    private int roomId;

    private int roomNumber;

    //@ManyToOne
    //@JoinColumn(name = "room_type_id")
    private RoomType roomType;

    //@JsonIgnore
    //@OneToMany(mappedBy = "room")
    private List<RoomReservation> roomReservations;

    //@ManyToOne
    //@JoinColumn(name = "hotel_id")
    private Hotel hotel;

    public Room() {
        super();
    }

    public Room(int roomId, int roomNumber, RoomType roomType, List<RoomReservation> roomReservations, Hotel hotel) {
        super();
        this.roomId = roomId;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomReservations = roomReservations;
        this.hotel = hotel;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public List<RoomReservation> getRoomReservations() {
        return roomReservations;
    }

    public void setRoomReservations(List<RoomReservation> roomReservations) {
        this.roomReservations = roomReservations;
    }

    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }

}