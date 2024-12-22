class Person4 {
    private String name;
    private int age;

    // First constructor: No arguments
    public Person4() {
        this("Unknown", 0); // Calls the third constructor
    }

    // Second constructor: Takes name as an argument
    public Person4(String name) {
        this(name, 0); // Calls the third constructor
    }

    // Third constructor: Takes name and age as arguments
    public Person4(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to display details
    public void displayDetails() {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    // Corrected main method
    public static void main(String[] args) {
        // Creating objects using all three constructors
        Person4 person1 = new Person4();
        Person4 person2 = new Person4("Alice");
        Person4 person3 = new Person4("Bob", 25);

        // Displaying the initialized values
        person1.displayDetails();
        person2.displayDetails();
        person3.displayDetails();
    }
}
