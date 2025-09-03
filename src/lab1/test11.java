package lab1;
public class test11 {

    public static void main(String[] args) {
        try {
            int cf = 500;
            int cr = 300;
            if (cr < cf) {
                throw new Exception("Cab Booking Cancelled You paid " + cf +
                        " and got refund of " + cr);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            int tf = 1200;
            int tr = 1000;
            if (tr < tf) {
                throw new Exception("Train Booking Cancelled You paid " + tf +
                        " and got refund of " + tr);
            } else {
                System.out.println("Train Booking Cancelled Full refund done!");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        try {
            int bf = 200;
            boolean cancelall = false;
            if (!cancelall) {
                throw new Exception("Bus Booking no cancellation or refund allowed");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

