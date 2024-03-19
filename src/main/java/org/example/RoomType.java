package org.example;

import java.util.List;

public class RoomType {

    private int roomTypeId;

    private String roomTypeName;

    private int roomTypeCount;

    private double roomTypePrice;

    private int guestCapacity;

    private String roomTypeSize;

    //@JsonIgnore
    //@OneToMany(mappedBy = "roomType")
    private List<Room> rooms;

    //@JsonIgnore
    //@OneToMany(mappedBy = "roomType")
    private List<RoomTypeBedRelation> roomTypeBedRelations;

    //@JsonIgnore
    //@OneToMany(mappedBy = "roomType")
    private List<RoomTypeImage> roomTypeImages;

    //@JsonIgnore
    //@OneToMany(mappedBy = "roomType")
    private List<RoomTypeFeature> roomTypeFeatures;


    public RoomType() {
    }

    public RoomType(int roomTypeId, String roomTypeName, int roomTypeCount, double roomTypePrice, int guestCapacity,
                    String roomTypeSize, List<Room> rooms, List<RoomTypeBedRelation> roomTypeBedRelations,
                    List<RoomTypeImage> roomTypeImages, List<RoomTypeFeature> roomTypeFeatures) {
        super();
        this.roomTypeId = roomTypeId;
        this.roomTypeName = roomTypeName;
        this.roomTypeCount = roomTypeCount;
        this.roomTypePrice = roomTypePrice;
        this.guestCapacity = guestCapacity;
        this.roomTypeSize = roomTypeSize;
        this.rooms = rooms;
        this.roomTypeBedRelations = roomTypeBedRelations;
        this.roomTypeImages = roomTypeImages;
        this.roomTypeFeatures = roomTypeFeatures;
    }

    public int getRoomTypeId() {
        return roomTypeId;
    }


    public void setRoomTypeId(int roomTypeId) {
        this.roomTypeId = roomTypeId;
    }


    public String getRoomTypeName() {
        return roomTypeName;
    }


    public void setRoomTypeName(String roomTypeName) {
        this.roomTypeName = roomTypeName;
    }


    public int getRoomTypeCount() {
        return roomTypeCount;
    }


    public void setRoomTypeCount(int roomTypeCount) {
        this.roomTypeCount = roomTypeCount;
    }


    public double getRoomTypePrice() {
        return roomTypePrice;
    }


    public void setRoomTypePrice(double roomTypePrice) {
        this.roomTypePrice = roomTypePrice;
    }


    public int getGuestCapacity() {
        return guestCapacity;
    }


    public void setGuestCapacity(int guestCapacity) {
        this.guestCapacity = guestCapacity;
    }


    public String getRoomTypeSize() {
        return roomTypeSize;
    }


    public void setRoomTypeSize(String roomTypeSize) {
        this.roomTypeSize = roomTypeSize;
    }


    public List<Room> getRooms() {
        return rooms;
    }


    public void setRooms(List<Room> rooms) {
        this.rooms = rooms;
    }


    public List<RoomTypeBedRelation> getRoomTypeBedRelations() {
        return roomTypeBedRelations;
    }


    public void setRoomTypeBedRelations(List<RoomTypeBedRelation> roomTypeBedRelations) {
        this.roomTypeBedRelations = roomTypeBedRelations;
    }


    public List<RoomTypeImage> getRoomTypeImages() {
        return roomTypeImages;
    }


    public void setRoomTypeImages(List<RoomTypeImage> roomTypeImages) {
        this.roomTypeImages = roomTypeImages;
    }


    public List<RoomTypeFeature> getRoomTypeFeatures() {
        return roomTypeFeatures;
    }


    public void setRoomTypeFeatures(List<RoomTypeFeature> roomTypeFeatures) {
        this.roomTypeFeatures = roomTypeFeatures;
    }


}