package org.example;

public class RoomTypeBedRelation {

    private int id;

    private int bedCount;

    //@ManyToOne
    //@JoinColumn(name = "room_type_id")
    private RoomType roomType;

    //@ManyToOne
    //@JoinColumn(name = "bed_type_id")
    private BedType bedType;

    public RoomTypeBedRelation() {
    }

    public RoomTypeBedRelation(int id, int bedCount, RoomType roomType, BedType bedType) {
        super();
        this.id = id;
        this.bedCount = bedCount;
        this.roomType = roomType;
        this.bedType = bedType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBedCount() {
        return bedCount;
    }

    public void setBedCount(int bedCount) {
        this.bedCount = bedCount;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public BedType getBedType() {
        return bedType;
    }

    public void setBedType(BedType bedType) {
        this.bedType = bedType;
    }
}