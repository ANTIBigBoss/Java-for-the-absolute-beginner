// Define a base class Animal
class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound");
    }
}

// Define a Dog class that extends Animal
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks");
    }
}

// Define a Cat class that extends Animal
class Cat extends Animal {
    @Override
    void makeSound() {
        System.out.println("The cat meows");
    }
}

public class Main {
    public static void main(String[] args) {
        // Create objects of the different classes and assign them to Animal type
        Animal myAnimal = new Animal();
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        // Call the makeSound method on each object
        myAnimal.makeSound(); // Output: The animal makes a sound
        myDog.makeSound(); // Output: The dog barks
        myCat.makeSound(); // Output: The cat meows
    }
}
