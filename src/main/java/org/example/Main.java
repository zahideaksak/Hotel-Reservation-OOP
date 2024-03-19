package org.example;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {

    public static void main(String[] args) {



        System.out.println("All hotels ;\n");

        for (Hotel hotel : getHotels()) {
            System.out.println("Hotel id : " + hotel.getId() + "\nHotel name : " + hotel.getHotelName()
                    + "\nHotel address : " + hotel.getAddress());

            System.out.println("Hotel services : ");
            for (HotelService hotelService : getHotelServicesByHotelId(hotel.getId())) {
                System.out.println("\t- " + hotelService.getServiceName());
            }

            System.out.println("Hotel reviews : ");
            for (Review review : getReviewsByHotelId(hotel.getId())) {
                System.out.println("\t- " + review.getComment());
            }
            System.out.println("----------------------------");

        }

        System.out.println("***************************************************************************");

        System.out.println("All guestes ;\n");
        for (Guest guest : getGuestes()) {
            System.out.println("Guest id : " + guest.getId() + "\n" + guest.getName());

            //System.out.println(getPaymentsByGuestId(guest.getId()).get(0));
            for (Payment payment : getPaymentsByGuestId(guest.getId())) {
                System.out.println("\t- " + "Payment date : " + payment.getDate());
                System.out.println("\t- Payment amount : "+ payment.getAmount());
            }

            System.out.println("----------------------------");
        }

        System.out.println("***************************************************************************");

    }

    public static List<Payment> getPaymentsByHotelId(int hotelId) {
        List<Payment> payments = new ArrayList<>();

        List<Payment> findedPaymentsByHotelId = new ArrayList<>();


        for (Payment payment : payments) {
            if (payment.getGuest().getId() == hotelId) {
                findedPaymentsByHotelId.add(payment);
            }
        }

        return findedPaymentsByHotelId;
    }

    public static List<Payment> getPaymentsByGuestId(int guestId) {

        List<Payment> payments = new ArrayList<>();

        List<Payment> findedPaymentsByGuestId = new ArrayList<>();

        Date now = new Date();

        Payment payment1 = new Payment();
        payment1.setGuest(getGuestes().get(0));
        payment1.setHotel(getHotels().get(0));
        payment1.setAmount(15000.5);
        payment1.setDate(now);
        payment1.setMethod(EPaymentMethod.CASH);

        payments.add(payment1);

        for (Payment payment : payments) {
            if (payment.getGuest().getId() == guestId) {
                findedPaymentsByGuestId.add(payment);
            }
        }

        return findedPaymentsByGuestId;
    }

    public static List<Hotel> getHotels() {

        List<Hotel> hotels = new ArrayList<>();

        Hotel hotel1 = new Hotel();
        hotel1.setId(1);
        hotel1.setUserName("shininghotel");
        hotel1.setEmail("shininghotel@gmail.com");
        hotel1.setPassword("123321");
        hotel1.setPhoneNumber("5555555555");
        hotel1.setHotelName("Hôtel Avenir Jonquière");
        hotel1.setCompanyName("Hôtel Avenir Jonquière");
        hotel1.setAddress("23 Rue De La Jonquière, 17. Batignolles, 75017 Paris, Fransa");
        hotel1.addRole(new Role(1, ERole.ROLE_USER));
        hotel1.addRole(new Role(2, ERole.ROLE_HOTEL));

        Hotel hotel2 = new Hotel();
        hotel2.setId(2);
        hotel2.setUserName("mauriceravel");
        hotel2.setEmail("mauriceravel@gmail.com");
        hotel2.setPassword("123321");
        hotel2.setPhoneNumber("5555555555");
        hotel2.setHotelName("Hotel CIS Paris Maurice Ravel");
        hotel2.setCompanyName("Hotel CIS Paris Maurice Ravel");
        hotel2.setAddress("6 avenue Maurice Ravel, 12. Bercy, 75012 Paris, Fransa");
        hotel2.addRole(new Role(1, ERole.ROLE_USER));
        hotel2.addRole(new Role(2, ERole.ROLE_HOTEL));

        hotels.add(hotel1);
        hotels.add(hotel2);

        return hotels;
    }

    public static List<Guest> getGuestes() {

        List<Guest> guests = new ArrayList<>();

        Guest guest1 = new Guest();
        guest1.setId(3);
        guest1.setUserName("guestonur");
        guest1.setEmail("guestonur@gmail.com");
        guest1.setPassword("123321");
        guest1.setPhoneNumber("5555555555");
        guest1.setName("Onur Akkoyun");
        guest1.addRole(new Role(1, ERole.ROLE_USER));
        guest1.addRole(new Role(3, ERole.ROLE_GUEST));

        Guest guest2 = new Guest();
        guest2.setId(4);
        guest2.setUserName("guestzahide");
        guest2.setEmail("guestzahide@gmail.com");
        guest2.setPassword("123321");
        guest2.setPhoneNumber("5555555555");
        guest2.setName("Zahide Aksak");
        guest2.addRole(new Role(1, ERole.ROLE_USER));
        guest2.addRole(new Role(3, ERole.ROLE_GUEST));

        Guest guest3 = new Guest();
        guest3.setId(5);
        guest3.setUserName("guestsamet");
        guest3.setEmail("guestsamet@gmail.com");
        guest3.setPassword("123321");
        guest3.setPhoneNumber("5555555555");
        guest3.setName("Samet Çiftçi");
        guest3.addRole(new Role(1, ERole.ROLE_USER));
        guest3.addRole(new Role(3, ERole.ROLE_GUEST));

        guests.add(guest1);
        guests.add(guest2);
        guests.add(guest3);

        return guests;
    }

    public static List<HotelService> getHotelServicesByHotelId(int hotelId) {
        List<HotelService> hotelServices = new ArrayList<>();

        List<HotelService> findedHotelServicesByHotelId = new ArrayList<>();

        HotelService hotelService1 = new HotelService();
        hotelService1.setId(1);
        hotelService1.setServiceName("Daily housekeeping");
        hotelService1.setHotel(getHotels().get(0));

        HotelService hotelService2 = new HotelService();
        hotelService2.setId(2);
        hotelService2.setServiceName("Cafeteria on site");
        hotelService2.setHotel(getHotels().get(1));

        hotelServices.add(hotelService1);
        hotelServices.add(hotelService2);

        for (HotelService hotelService : hotelServices) {
            if (hotelService.getHotel().getId() == hotelId) {
                findedHotelServicesByHotelId.add(hotelService);
            }
        }
        return findedHotelServicesByHotelId;
    }

    public static List<RoomTypeBedRelation> getRoomTypeBedRelations() {

        List<RoomTypeBedRelation> roomTypeBedRelations = new ArrayList<>();

        RoomTypeBedRelation relation1 = new RoomTypeBedRelation();
        relation1.setId(1);
        relation1.setBedCount(2);
        relation1.setBedType(null);
        relation1.setRoomType(getRoomTypes().get(0));

        roomTypeBedRelations.add(relation1);

        return roomTypeBedRelations;

    }

    public static List<Feature> getFeatures() {

        List<Feature> features = new ArrayList<>();

        Feature feature1 = new Feature();
        feature1.setFeatureId(1);
        feature1.setFeatureName("Free Wi-Fi internet connection");

        features.add(feature1);

        return features;
    }

    public static List<RoomTypeFeature> getRoomTypeFeatures() {

        List<RoomTypeFeature> roomTypeFeatures = new ArrayList<>();

        RoomTypeFeature roomTypeFeature = new RoomTypeFeature();
        roomTypeFeature.setId(1);
        roomTypeFeature.setFeature(getFeatures().get(0));
        roomTypeFeature.setRoomType(getRoomTypes().get(0));

        roomTypeFeatures.add(roomTypeFeature);

        return roomTypeFeatures;
    }

    public static List<RoomType> getRoomTypes() {

        List<RoomType> roomTypes = new ArrayList<>();

        RoomType roomType1 = new RoomType();
        roomType1.setRoomTypeId(1);
        roomType1.setRoomTypeName("Premium");
        roomType1.setGuestCapacity(4);
        roomType1.setRoomTypeCount(10);
        roomType1.setRoomTypePrice(2500);
        roomType1.setRoomTypeSize("60 m^2");

        roomTypes.add(roomType1);

        return roomTypes;
    }

    private static List<Review> getReviewsByHotelId(int hotelId) {

        List<Review> reviews = new ArrayList<>();

        List<Review> findedReviewsByHotelId = new ArrayList<>();

        Review review1 = new Review();
        review1.setReviewId(1);
        review1.setHotel(getHotels().get(0));
        review1.setGuest(getGuestes().get(0));
        review1.setComment("Hotel is massive and great!");

        reviews.add(review1);

        for (Review review : reviews) {
            if (review.getHotel().getId() == hotelId) {
                findedReviewsByHotelId.add(review);
            }
        }
        return findedReviewsByHotelId;
    }

    private static List<Reservation> getReservationes() {

        List<Reservation> reservations = new ArrayList<>();

        LocalDate checkInDate = LocalDate.of(2024, 3, 19);
        LocalDate checkOutDate = LocalDate.of(2024, 3, 26);

        Reservation reservation1 = new Reservation();
        reservation1.setId(1);
        reservation1.setCheckInDate(checkInDate);
        reservation1.setCheckOutDate(checkOutDate);
        reservation1.setGuest(getGuestes().get(0));
        reservation1.setHotel(getHotels().get(0));
        reservation1.setRoom(getRooms().get(0));
        reservation1.setTotalAmount(17500);

        reservations.add(reservation1);

        return reservations;
    }

    public static List<RoomReservation> getRoomReservations() {
        List<RoomReservation> roomReservations = new ArrayList<>();

        RoomReservation roomReservation1 = new RoomReservation();
        roomReservation1.setId(1);
        roomReservation1.setReservation(getReservationes().get(0));
        roomReservation1.setGuest(getGuestes().get(0));

        roomReservations.add(roomReservation1);

        return roomReservations;
    }

    public static List<Room> getRooms() {

        List<Room> rooms = new ArrayList<>();

        List<Hotel> hotels = getHotels();

        Room room1 = new Room();
        room1.setRoomId(1);
        room1.setRoomNumber(1000);
        room1.setHotel(hotels.get(0));
        room1.setRoomType(getRoomTypes().get(0));

        return rooms;
    }
}