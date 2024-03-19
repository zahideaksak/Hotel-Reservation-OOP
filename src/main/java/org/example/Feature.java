package org.example;

public class Feature {

    private int featureId;

    private String featureName;

    //@JsonIgnore
    //@OneToMany(mappedBy = "feature")
    private RoomTypeFeature roomTypeFeature;

    public Feature() {
    }

    public Feature(int featureId, String featureName, RoomTypeFeature roomTypeFeature) {
        super();
        this.featureId = featureId;
        this.featureName = featureName;
        this.roomTypeFeature = roomTypeFeature;
    }

    public int getFeatureId() {
        return featureId;
    }

    public void setFeatureId(int featureId) {
        this.featureId = featureId;
    }

    public String getFeatureName() {
        return featureName;
    }

    public void setFeatureName(String featureName) {
        this.featureName = featureName;
    }

    public RoomTypeFeature getRoomTypeFeature() {
        return roomTypeFeature;
    }

    public void setRoomTypeFeature(RoomTypeFeature roomTypeFeature) {
        this.roomTypeFeature = roomTypeFeature;
    }

}