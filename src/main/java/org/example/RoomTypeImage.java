package org.example;

public class RoomTypeImage {

    private int imageId;

    private String imageUrl;

    //@ManyToOne
    //@JoinColumn(name = "room_type_id")
    private RoomType roomType;

    public RoomTypeImage() {
    }

    public RoomTypeImage(int imageId, String imageUrl, RoomType roomType) {
        super();
        this.imageId = imageId;
        this.imageUrl = imageUrl;
        this.roomType = roomType;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

}