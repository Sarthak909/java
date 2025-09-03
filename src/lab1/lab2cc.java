package lab1;

public class lab2cc {
    // Base class
    class Employee {
        double baseSalary;

        Employee(double baseSalary) {
            this.baseSalary = baseSalary;
        }

        // method to be overridden
        double calculateSalary() {
            return baseSalary;
        }
    }

    // Subclass Manager
    class Manager extends Employee {
        double bonus;

        Manager(double baseSalary, double bonus) {
            super(baseSalary);
            this.bonus = bonus;
        }

        @Override
        double calculateSalary() {
            return baseSalary + bonus;  // Manager gets bonus
        }
    }

    // Subclass Programmer
    class Programmer extends Employee {
        int overtimeHours;
        double overtimeRate;

        Programmer(double baseSalary, int overtimeHours, double overtimeRate) {
            super(baseSalary);
            this.overtimeHours = overtimeHours;
            this.overtimeRate = overtimeRate;
        }

        @Override
        double calculateSalary() {
            return baseSalary + (overtimeHours * overtimeRate); // Programmer gets overtime pay
        }
    }

    // Main class
    public class Main {
        public static void main(String[] args) {// Programmer with base + overtime
            Employee e1;
            Employee e2;

        }
    }
}
