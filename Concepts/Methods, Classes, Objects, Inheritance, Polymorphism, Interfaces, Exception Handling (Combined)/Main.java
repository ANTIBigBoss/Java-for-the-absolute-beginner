// Interfaces: A collection of abstract methods that can be implemented by any class.
// An interface can be seen as a contract, specifying that the implementing class must provide certain functionality.
interface AnimalInterface {
    // Interface method (does not have a body).
    // Classes implementing this interface must provide an implementation for this method.
    void speak();
}

// Abstract Class: A class that cannot be instantiated on its own and serves as a base for other classes.
// Inheritance: A way of creating a new class that inherits the properties and methods of an existing class.
// Polymorphism: The ability of a single interface to represent different types of objects at runtime.
abstract class Animal implements AnimalInterface {
    // Object's attributes (fields)
    private String name;

    // Constructor: A special method that initializes objects of the class.
    public Animal(String name) {
        this.name = name;
    }

    // Object's behavior (methods): Define what the object can do.
    public void displayInfo() {
        System.out.println("This animal's name is: " + name);
    }

    // Abstract method: A method without a body that must be implemented by any concrete subclass.
    // It serves as a blueprint for what the derived classes should implement.
    public abstract void move();
}

// Dog class: Inherits properties and methods from the Animal class (extends keyword).
// Subclasses can add new methods and/or override inherited methods to provide their own implementation.
class Dog extends Animal {
    // Constructor: Calls the constructor of the superclass (Animal) using the super keyword.
    public Dog(String name) {
        super(name);
    }

    // Implementing abstract method from the superclass
    @Override
    public void move() {
        System.out.println("The dog runs.");
    }

    // Implementing interface method: Providing the implementation for the speak() method from AnimalInterface.
    @Override
    public void speak() {
        System.out.println("The dog barks.");
    }
}

// Another class inheriting from the Animal class
class Fish extends Animal {
    // Constructor: Calls the constructor of the superclass (Animal) using the super keyword.
    public Fish(String name) {
        super(name);
    }

    // Implementing abstract method from the superclass
    @Override
    public void move() {
        System.out.println("The fish swims.");
    }

    // Implementing interface method
    @Override
    public void speak() {
        System.out.println("The fish cannot speak.");
    }


    // Main method: The entry point of the program.
    public static void main(String[] args) {
        // Create a Dog object: Demonstrates the concept of object instantiation.
        Dog dog = new Dog("Buddy");

        // Call methods on the Dog object: Demonstrates the concept of interacting with objects using their methods.
        dog.displayInfo();
        dog.move();
        dog.speak();

        System.out.println();

        // Create a Fish object
        Fish fish = new Fish("Nemo");

        // Call methods on the Fish object
        fish.displayInfo();
        fish.move();
        fish.speak();

        // Exception Handling: A mechanism that helps to manage the occurrence of errors during program execution.
        try {
            // Creating an array of Animal objects to demonstrate the concept of polymorphism.
            Animal[] animals = new Animal[2];
            animals[0] = dog;
            animals[1] = fish;

            // Trying to access an out-of-bounds index: This will cause an ArrayIndexOutOfBoundsException.
            System.out.println(animals[2].getClass().getSimpleName());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block: If an exception occurs, the code in the catch block will be executed.
            // This allows the program to continue running, even if an error occurs.
            System.err.println("An error occurred: " + e.getMessage());
            System.err.println("Please provide a valid index.");
        } finally {
            // Finally block: This block will always be executed, whether an exception occurs or not.
            // It is typically used to release resources or perform clean-up tasks.
            System.out.println("This is the finally block. It will always be executed.");
        }
    }
}
