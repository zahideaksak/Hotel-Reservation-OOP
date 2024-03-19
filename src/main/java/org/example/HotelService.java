package org.example;

public class HotelService {

    private int id;

    private String serviceName;

    //@ManyToOne
    //@JoinColumn(name = "hotel_id")
    private Hotel hotel;

    public HotelService() {
    }



    public HotelService(int id, String serviceName, Hotel hotel) {
        super();
        this.id = id;
        this.serviceName = serviceName;
        this.hotel = hotel;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String getServiceName() {
        return serviceName;
    }



    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }



    public Hotel getHotel() {
        return hotel;
    }

    public void setHotel(Hotel hotel) {
        this.hotel = hotel;
    }


}