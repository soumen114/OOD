// Base class for Employee
class Employee {
    private static int idCounter = 1000;
    private int employeeID;
    private String name;
    private int age;

    public Employee(String name, int age) {
        this.employeeID = idCounter++;
        this.name = name;
        this.age = age;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeID + ", Name: " + name + ", Age: " + age);
    }

    public double calculateBonus(double baseSalary) {
        return baseSalary * 0.05; // Default 5%
    }
}

// Manager subclass
class Manager extends Employee {
    private String department;

    public Manager(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }

    @Override
    public double calculateBonus(double baseSalary) {
        return baseSalary * 0.10; // 10% for Manager
    }
}

// Engineer subclass
class Engineer extends Employee {
    private String specialization;

    public Engineer(String name, int age, String specialization) {
        super(name, age);
        this.specialization = specialization;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Specialization: " + specialization);
    }

    @Override
    public double calculateBonus(double baseSalary) {
        return baseSalary * 0.07; // 7% for Engineer
    }
}

// Main class
public class EmployeeTest2 {
    public static void main(String[] args) {
        Manager manager = new Manager("Alice", 40, "HR");
        Engineer engineer = new Engineer("Bob", 30, "Software");

        System.out.println("Manager Details:");
        manager.displayDetails();
        System.out.println("Bonus: " + manager.calculateBonus(50000));

        System.out.println("\nEngineer Details:");
        engineer.displayDetails();
        System.out.println("Bonus: " + engineer.calculateBonus(40000));
    }
}
