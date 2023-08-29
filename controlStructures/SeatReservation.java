package assignment2;
import java.util.Scanner;

public class SeatReservation {
    private String trainId;
    private String trainName;
    private String passengerName;
    private boolean isSeatReserved;

    public SeatReservation(String trainId, String trainName, String passengerName) {
        this.trainId = trainId;
        this.trainName = trainName;
        this.passengerName = passengerName;
        this.isSeatReserved = false;
    }

    public String getTrainId() {
        return trainId;
    }

    public String getTrainName() {
        return trainName;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public boolean isSeatReserved() {
        return isSeatReserved;
    }

    public void reserveSeat() {
        isSeatReserved = true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        SeatReservation reservation = new SeatReservation("123", "Express Train", "John");

        System.out.print("Enter the Train ID: ");
        String userTrainId = scanner.nextLine();

        if (userTrainId.equals(reservation.getTrainId())) {
            if (!reservation.isSeatReserved()) {
                reservation.reserveSeat();
                System.out.println("Seat confirmed for " + reservation.getPassengerName() + " on train " + reservation.getTrainName());
            } else {
                System.out.println("Seat already reserved for " + reservation.getPassengerName() + " on train " + reservation.getTrainName());
            }
        } else {
            System.out.println("Invalid Train ID. No reservation available.");
        }

        scanner.close();
    }
    }
