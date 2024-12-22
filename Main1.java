// Base class
class Animal {
    // Constructor
    public Animal() {
        System.out.println("Animal Constructor Called");
    }

    // Method to be overridden
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class (Intermediate)
class Mammal extends Animal {
    // Constructor with chaining
    public Mammal() {
        super(); // Calls the constructor of Animal
        System.out.println("Mammal Constructor Called");
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println("Mammals make specific sounds");
    }
}

// Derived class (Leaf)
class Dog extends Mammal {
    // Constructor with chaining
    public Dog() {
        super(); // Calls the constructor of Mammal
        System.out.println("Dog Constructor Called");
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }

    // Overloaded feed method (Function Overloading)
    public void feed(String food) {
        System.out.println("The dog is being fed with " + food);
    }

    public void feed(String food, int quantity) {
        System.out.println("The dog is being fed with " + quantity + " units of " + food);
    }
}

public class Main1 {
    public static void main(String[] args) {
        // Demonstrate Multilevel Inheritance and Constructor Chaining
        Dog dog = new Dog(); // Calls constructors of Animal, Mammal, and Dog

        // Demonstrate Function Overriding and Run-time Polymorphism
        Animal genericAnimal = new Dog(); // Upcasting
        genericAnimal.makeSound(); // Calls Dog's overridden method

        // Demonstrate Function Overloading
        dog.feed("bones");         // Single-parameter feed
        dog.feed("bones", 3);      // Two-parameter feed

        // Demonstrate Constructor Overloading
        Example example1 = new Example();
        Example example2 = new Example(42);
    }
}

// Additional class to demonstrate Constructor Overloading
class Example {
    // Default constructor
    public Example() {
        System.out.println("Default constructor called");
    }

    // Parameterized constructor
    public Example(int value) {
        System.out.println("Parameterized constructor called with value: " + value);
    }
}
