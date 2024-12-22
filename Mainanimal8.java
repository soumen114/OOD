// Parent class Animal
class Animal {
    // Method to make a sound
    public void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

// Subclass Cat that overrides makeSound
class Cat extends Animal {
    // Overriding the method to bark (as per the task)
    @Override
    public void makeSound() {
        System.out.println("The cat barks.");
    }
}

// Main class to test the program
public class Mainanimal8 {
    public static void main(String[] args) {
        // Create an instance of Animal
        Animal animal = new Animal();
        animal.makeSound(); // Outputs: The animal makes a sound.

        // Create an instance of Cat
        Cat cat = new Cat();
        cat.makeSound(); // Outputs: The cat barks.
    }
}
