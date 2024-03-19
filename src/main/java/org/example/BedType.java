package org.example;

import java.util.List;

public class BedType {

    private int bedTypeId;

    private String bedTypeName;

    //@OneToMany(mappedBy = "roomTypeBedRelation")
    private List<RoomTypeBedRelation> roomTypeBedRelations;

    public BedType() {
    }

    public BedType(int bedTypeId, String bedTypeName, List<RoomTypeBedRelation> roomTypeBedRelations) {
        super();
        this.bedTypeId = bedTypeId;
        this.bedTypeName = bedTypeName;
        this.roomTypeBedRelations = roomTypeBedRelations;
    }

    public int getBedTypeId() {
        return bedTypeId;
    }

    public void setBedTypeId(int bedTypeId) {
        this.bedTypeId = bedTypeId;
    }

    public String getBedTypeName() {
        return bedTypeName;
    }

    public void setBedTypeName(String bedTypeName) {
        this.bedTypeName = bedTypeName;
    }

    public List<RoomTypeBedRelation> getRoomTypeBedRelation() {
        return roomTypeBedRelations;
    }

    public void setRoomTypeBedRelation(List<RoomTypeBedRelation> roomTypeBedRelations) {
        this.roomTypeBedRelations = roomTypeBedRelations;
    }

}