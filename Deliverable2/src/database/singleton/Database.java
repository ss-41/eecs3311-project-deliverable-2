package database.singleton;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import com.csvreader.CsvReader;
import com.csvreader.CsvWriter;

import dataModels.AccountType;
import dataModels.Booking;
import dataModels.BookingStatus;
import dataModels.Room;
import dataModels.RoomStatus;
import dataModels.User;

public class Database {


    private static Database instance;

    private static final String pathRooms =
            "csv_files/room.csv";

    private static final String pathBookings =
            "csv_files/booking.csv";

    private static final String pathUsers =
            "csv_files/user.csv";

    public ArrayList<User> users = new ArrayList<>();
    public ArrayList<Booking> bookings = new ArrayList<>();
    public ArrayList<Room> rooms = new ArrayList<>();

    private Database() {
    }

    public static Database getInstance() {
        if (instance == null) {
            instance = new Database();
        }

        return instance;
    }

    // Loads rooms from room.csv.
    public void loadRooms() throws Exception {

        try {
            rooms.clear();

            CsvReader readerRoom = new CsvReader(pathRooms);
            readerRoom.readHeaders();

            while (readerRoom.readRecord()) {

                int roomID =
                        Integer.parseInt(
                                readerRoom.get("roomID")
                        );

                String roomNum =
                        readerRoom.get("roomNum");

                int capacity =
                        Integer.parseInt(
                                readerRoom.get("capacity")
                        );

                String building =
                        readerRoom.get("building");

                String stringRoomStatus =
                        readerRoom.get("status");

                RoomStatus roomStatus =
                        RoomStatus.valueOf(stringRoomStatus);

                Room room = new Room(
                        roomID,
                        roomNum,
                        capacity,
                        building,
                        roomStatus,
                        null
                );

                rooms.add(room);
            }

            readerRoom.close();

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    // Writes rooms to room.csv.
    public void storeRooms() throws Exception {

        CsvWriter csvOutputRoom =
                new CsvWriter(
                        new FileWriter(pathRooms, false),
                        ','
                );

        try {
            csvOutputRoom.write("roomID");
            csvOutputRoom.write("roomNum");
            csvOutputRoom.write("capacity");
            csvOutputRoom.write("building");
            csvOutputRoom.write("status");
            csvOutputRoom.endRecord();

            for (Room room : rooms) {

                csvOutputRoom.write(
                        String.valueOf(room.getRoomID())
                );

                csvOutputRoom.write(room.getRoomNum());

                csvOutputRoom.write(
                        String.valueOf(room.getCapacity())
                );

                csvOutputRoom.write(room.getBuilding());

                csvOutputRoom.write(
                        room.getStatus().name()
                );

                csvOutputRoom.endRecord();
            }

        } finally {
            csvOutputRoom.close();
        }
    }

    // Removes a room and updates room.csv.
    public void deleteRoom(Room room) {

        Room roomToRemove = null;

        for (Room currentRoom : rooms) {
            if (currentRoom.getRoomID() == room.getRoomID()) {
                roomToRemove = currentRoom;
                break;
            }
        }

        if (roomToRemove == null) {
            return;
        }

        rooms.remove(roomToRemove);

        try {
            storeRooms();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public void loadBookings() throws Exception {

        try {
            bookings.clear();

            CsvReader readerBooking =
                    new CsvReader(pathBookings);

            readerBooking.readHeaders();

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern(
                            "yyyy-MM-dd HH:mm"
                    );

            while (readerBooking.readRecord()) {

                int bookingID =
                        Integer.parseInt(
                                readerBooking.get("bookingID")
                        );
                
                int userID = Integer.parseInt(
                        readerBooking.get("userID")
                );

                int roomID =
                        Integer.parseInt(
                                readerBooking.get("roomID")
                        );

                double deposit =
                        Double.parseDouble(
                                readerBooking.get("deposit")
                        );

                String stringBookingStatus =
                        readerBooking.get("bookingStatus");

                BookingStatus bookingStatus =
                        BookingStatus.valueOf(
                                stringBookingStatus
                        );

                LocalDateTime bookingTime =
                        LocalDateTime.parse(
                                readerBooking.get("bookingTime"),
                                formatter
                        );

                LocalDateTime bookingEndTime =
                        LocalDateTime.parse(
                                readerBooking.get("bookingEndTime"),
                                formatter
                        );

                Booking booking = new Booking(
                        bookingID,
                        userID,
                        roomID,
                        deposit,
                        bookingStatus,
                        bookingTime,
                        bookingEndTime
                );

                bookings.add(booking);
            }

            readerBooking.close();

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    // Writes bookings to booking.csv.
    public void storeBookings() throws Exception {

        CsvWriter csvOutputBooking =
                new CsvWriter(
                        new FileWriter(pathBookings, false),
                        ','
                );

        try {
            csvOutputBooking.write("bookingID");
            csvOutputBooking.write("userID");
            csvOutputBooking.write("roomID");
            csvOutputBooking.write("deposit");
            csvOutputBooking.write("bookingStatus");
            csvOutputBooking.write("bookingTime");
            csvOutputBooking.write("bookingEndTime");
            csvOutputBooking.endRecord();

            DateTimeFormatter formatter =
                    DateTimeFormatter.ofPattern(
                            "yyyy-MM-dd HH:mm"
                    );

            for (Booking booking : bookings) {

                csvOutputBooking.write(
                        String.valueOf(
                                booking.getBookingID()
                        )
                );
                
                csvOutputBooking.write(
                        String.valueOf(
                                booking.getUserID()
                        )
                );

                csvOutputBooking.write(
                        String.valueOf(
                                booking.getRoomID()
                        )
                );

                csvOutputBooking.write(
                        String.valueOf(
                                booking.getDeposit()
                        )
                );

                csvOutputBooking.write(
                        booking.getBookingStatus().name()
                );

                csvOutputBooking.write(
                        booking.getBookingTime()
                                .format(formatter)
                );

                csvOutputBooking.write(
                        booking.getBookingEndTime()
                                .format(formatter)
                );

                csvOutputBooking.endRecord();
            }

        } finally {
            csvOutputBooking.close();
        }
    }

    // Removes a booking and updates booking.csv.
    public void deleteBooking(Booking booking) {

        Booking bookingToRemove = null;

        for (Booking currentBooking : bookings) {
            if (currentBooking.getBookingID()
                    == booking.getBookingID()) {

                bookingToRemove = currentBooking;
                break;
            }
        }

        if (bookingToRemove == null) {
            return;
        }

        bookings.remove(bookingToRemove);

        try {
            storeBookings();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    // Loads users from user.csv.
    public void loadUsers() throws Exception {

        try {
            users.clear();

            CsvReader readerUser =
                    new CsvReader(pathUsers);

            readerUser.readHeaders();

            while (readerUser.readRecord()) {

                int userID =
                        Integer.parseInt(
                                readerUser.get("userID")
                        );

                String name =
                        readerUser.get("name");

                String email =
                        readerUser.get("email");

                String password =
                        readerUser.get("password");

                String stud_OR_orgID =
                        readerUser.get("stud_OR_orgID");

                String accountTypeName =
                        readerUser.get("accountType");

                AccountType accountType =
                        createAccountType(accountTypeName);
                
                boolean admin = Boolean.parseBoolean(readerUser.get("admin"));

                User user = new User(
                        userID,
                        name,
                        email,
                        password,
                        stud_OR_orgID,
                        accountType,
                        admin
                );

                users.add(user);
            }

            readerUser.close();

        } catch (FileNotFoundException exception) {
            exception.printStackTrace();
        }
    }

    // Writes users to user.csv.
    public void storeUsers() throws Exception {

        CsvWriter csvOutputUser =
                new CsvWriter(
                        new FileWriter(pathUsers, false),
                        ','
                );

        try {
            csvOutputUser.write("userID");
            csvOutputUser.write("name");
            csvOutputUser.write("email");
            csvOutputUser.write("password");
            csvOutputUser.write("stud_OR_orgID");
            csvOutputUser.write("accountType");
            csvOutputUser.write("admin");
            csvOutputUser.endRecord();

            for (User user : users) {

                csvOutputUser.write(
                        String.valueOf(user.getUserID())
                );

                csvOutputUser.write(user.getName());
                csvOutputUser.write(user.getEmail());
                csvOutputUser.write(user.getPassword());

                csvOutputUser.write(
                        user.getStud_OR_orgID()
                );

                csvOutputUser.write(
                        user.getAccountType().getTypeName()
                );
                
                csvOutputUser.write(String.valueOf(user.isAdmin()));
                
                csvOutputUser.endRecord();
            }

        } finally {
            csvOutputUser.close();
        }
    }

    public void addUser(User user) throws Exception {
        users.add(user);
        storeUsers();
    }

    // Removes a user and updates user.csv.
    public void deleteUser(User user) {

        User userToRemove = null;

        for (User currentUser : users) {
            if (currentUser.getUserID()
                    == user.getUserID()) {

                userToRemove = currentUser;
                break;
            }
        }

        if (userToRemove == null) {
            return;
        }

        users.remove(userToRemove);

        try {
            storeUsers();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }

    public int getNextUserID() {

        int maxID = 0;

        for (User user : users) {
            if (user.getUserID() > maxID) {
                maxID = user.getUserID();
            }
        }

        return maxID + 1;
    }

    public boolean emailExists(String email) {

        if (email == null) {
            return false;
        }

        String trimmedEmail = email.trim();

        for (User user : users) {
            if (user.getEmail()
                    .equalsIgnoreCase(trimmedEmail)) {

                return true;
            }
        }

        return false;
    }

    public User validateLogin(
            String email,
            String password) {

        if (email == null || password == null) {
            return null;
        }

        String trimmedEmail = email.trim();

        for (User user : users) {

            boolean emailMatches =
                    user.getEmail()
                            .equalsIgnoreCase(
                                    trimmedEmail
                            );

            boolean passwordMatches =
                    user.getPassword()
                            .equals(password);

            if (emailMatches && passwordMatches) {
                return user;
            }
        }

        return null;
    }

    public AccountType createAccountType(
            String accountTypeName) {

        switch (accountTypeName) {

            case "Student":
                return new AccountType(
                        1,
                        "Student",
                        20.00
                );

            case "Faculty":
                return new AccountType(
                        2,
                        "Faculty",
                        30.00
                );

            case "Staff":
                return new AccountType(
                        3,
                        "Staff",
                        40.00
                );

            case "Partner":
                return new AccountType(
                        4,
                        "Partner",
                        50.00
                );

            default:
                throw new IllegalArgumentException(
                        "Invalid account type: "
                                + accountTypeName
                );
        }
    }
}