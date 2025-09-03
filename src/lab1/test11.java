package lab1;
public class test11 {

    public static void main(String[] args) {
        try {
            int cabFare = 500;
            int cabRefund = 300;
            if (cabRefund < cabFare) {
                throw new Exception("Cab Booking (ID: CAB101): Cancelled. You paid " + cabFare +
                        " and got refund of " + cabRefund);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            int trainFare = 1200;
            int trainRefund = 1000;
            if (trainRefund < trainFare) {
                throw new Exception("Train Booking (ID: TRN202): Cancelled. You paid " + trainFare +
                        " and got refund of " + trainRefund);
            } else {
                System.out.println("Train Booking (ID: TRN202): Cancelled. Full refund done!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            int busFare = 200;
            boolean cancellationAllowed = false;
            if (!cancellationAllowed) {
                throw new Exception("Bus Booking (ID: BUS303): Sorry, no cancellation or refund allowed!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

