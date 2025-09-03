public class lab2 {
    // Combined Program for Q6, Q7, Q8, Q9

    // Q6: SimpleObject class
    class SimpleObject {
        SimpleObject() {
            System.out.println("Q6: Constructor is called! Object Created.");
        }
    }

    // Q7: Number class with different methods
    class Number {
        private double num;

        Number(double num) {
            this.num = num;
        }

        boolean isZero() { return num == 0; }
        boolean isPositive() { return num > 0; }
        boolean isNegative() { return num < 0; }
        boolean isOdd() { return num % 2 != 0; }
        boolean isEven() { return num % 2 == 0; }

        boolean isPrime() {
            if (num <= 1 || num != Math.floor(num)) return false;
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
            return true;
        }

        boolean isArmstrong() {
            int n = (int) num;
            int sum = 0, temp = n, digits = 0;
            while (temp > 0) {
                digits++;
                temp /= 10;
            }
            temp = n;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, digits);
                temp /= 10;
            }
            return sum == n;
        }
    }

    // Q8: Room class
    class Room {
        int roomno;
        String roomtype;
        double roomarea;
        boolean ACmachine;

        void setData(int rno, String rtype, double rarea, boolean ac) {
            roomno = rno;
            roomtype = rtype;
            roomarea = rarea;
            ACmachine = ac;
        }

        void displayData() {
            System.out.println("Room No: " + roomno);
            System.out.println("Room Type: " + roomtype);
            System.out.println("Room Area: " + roomarea);
            System.out.println("AC Available: " + (ACmachine ? "Yes" : "No"));
        }
    }

    // Q9: Polymorphism with Shape
    class Shape {
        void draw() {
            System.out.println("Drawing a Shape");
        }
        void erase() {
            System.out.println("Erasing a Shape");
        }
    }

    class Circle extends Shape {
        void draw() {
            System.out.println("Drawing a Circle");
        }
        void erase() {
            System.out.println("Erasing a Circle");
        }
    }

    class Triangle extends Shape {
        void draw() {
            System.out.println("Drawing a Triangle");
        }
        void erase() {
            System.out.println("Erasing a Triangle");
        }
    }

    class Square extends Shape {
        void draw() {
            System.out.println("Drawing a Square");
        }
        void erase() {
            System.out.println("Erasing a Square");
        }
    }

    // Main class to run everything
    public class Main {
        public static void main(String[] args) {
            System.out.println("===== Q6 =====");
            SimpleObject obj = new SimpleObject();

            System.out.println("\n===== Q7 =====");
            Number n = new Number(153);
            System.out.println("Zero = " + n.isZero());
            System.out.println("Positive = " + n.isPositive());
            System.out.println("Negative = " + n.isNegative());
            System.out.println("Odd = " + n.isOdd());
            System.out.println("Even = " + n.isEven());
            System.out.println("Prime = " + n.isPrime());
            System.out.println("Armstrong = " + n.isArmstrong());

            System.out.println("\n===== Q8 =====");
            Room r = new Room();
            r.setData(101, "Deluxe", 350.5, true);
            r.displayData();

            System.out.println("\n===== Q9 =====");
            Shape s;

            s = new Circle();
            s.draw();
            s.erase();

            s = new Triangle();
            s.draw();
            s.erase();

            s = new Square();
            s.draw();
            s.erase();
        }
    }

}
