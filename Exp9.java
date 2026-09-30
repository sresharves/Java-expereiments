// Thread class
class ReservationThread extends Thread {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Reservation in progress... " + i);

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Reservation thread interrupted.");
            }
        }
    }
}


// Runnable interface
class StatusThread implements Runnable {

    @Override
    public void run() {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Ticket confirmed successfully... " + i);

            try {
                Thread.sleep(500);
            }
            catch (InterruptedException e) {
                System.out.println("Status thread interrupted.");
            }
        }
    }
}


// Main class
public class Exp9
 {

    public static void main(String[] args) {

        // Create ReservationThread object
        ReservationThread reservation = new ReservationThread();

        // Create StatusThread object
        StatusThread status = new StatusThread();

        // Create Thread object using Runnable object
        Thread confirmation = new Thread(status);

        // Start both threads
        reservation.start();
        confirmation.start();
    }
}