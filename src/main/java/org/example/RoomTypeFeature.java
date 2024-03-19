package org.example;

public class RoomTypeFeature {

    private int id;

    //@ManyToOne
    //@JoinColumn(name = "room_type_id")
    private RoomType roomType;

    //@ManyToOne
    //@JoinColumn(name = "feature_id")
    private Feature feature;

    public RoomTypeFeature() {
    }

    public RoomTypeFeature(int id, RoomType roomType, Feature feature) {
        super();
        this.id = id;
        this.roomType = roomType;
        this.feature = feature;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public Feature getFeature() {
        return feature;
    }

    public void setFeature(Feature feature) {
        this.feature = feature;
    }

}