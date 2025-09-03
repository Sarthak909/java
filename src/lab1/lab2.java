package lab1;

public class lab2 {
    public static void main(String[] args) {
        int k = 100;
        int b = 0;
        while (k > 0) {
            if (k % 2 != 0) {
                b = b + 1;
            }
            k = k - 1;
        }
        System.out.println(b);
    }
}
