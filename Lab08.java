// Import Scanner class to read user input from the console
import java.util.Scanner;

// Main class - must match the filename Lab08.java
// This is the only public class in the file
public class Lab08 {
    
    // Main method - entry point of the program
    public static void main(String[] args) {
        
        // Create a Scanner object to read input from System.in (keyboard)
        Scanner scanner = new Scanner(System.in);

        // ============================================
        // TASK 1: Animal Kingdom
        // Concepts: INTERFACES, OVERRIDING, OVERLOADING
        // ============================================
        
        // TODO: Ask the user for the Duck's name
        // Hint: Use System.out.print() and scanner.nextLine()
        
        
        // TODO: Create a Duck object using the constructor with just name
        // Hint: Duck duck = new Duck(duckName);
        // This demonstrates constructor overloading - using the single parameter constructor
        
        
        // TODO: Ask the user for the Sloth's name
        
        
        // TODO: Ask the user for the Sloth's age
        // Hint: Use scanner.nextInt() then scanner.nextLine() to clear buffer
        
        
        // TODO: Create a Sloth object using the constructor with name and age
        // Hint: Sloth sloth = new Sloth(slothName, slothAge);
        // This demonstrates constructor overloading - using the two parameter constructor
        
        
        // TODO: Print a blank line for formatting
        
        
        // TODO: Print the Duck object
        // Hint: System.out.println(duck);
        // This will automatically call the toString() method (overriding demonstration)
        
        
        // TODO: Call makeSound() on the Duck
        // Hint: duck.makeSound();
        // This demonstrates interface implementation
        
        
        // TODO: Print a blank line for formatting
        
        
        // TODO: Print the Sloth object
        // This will automatically call the toString() method (overriding demonstration)
        
        
        // TODO: Call makeSound() on the Sloth
        // This demonstrates interface implementation
        
        
        // Print blank lines to separate tasks
        System.out.println("\n");


        // ============================================
        // TASK 2: Rock and Roll All Night
        // Concepts: INTERFACES, POLYMORPHISM, OVERRIDING, OVERLOADING, INHERITANCE
        // ============================================
        
        // TODO: Create an array of Musician with size 4
        // Hint: Musician[] band = new Musician[4];
        // This demonstrates polymorphism - the array can hold any subclass of Musician
        
        
        // TODO: Loop 4 times to fill the band array
        // Hint: for (int i = 0; i < band.length; i++) { ... }
        
            // TODO: Ask the user for the musician's name
            
            
            // TODO: Ask the user for the kind of musician
            // Hint: System.out.print("\nKind: ");
            
            
            // TODO: Create the appropriate Musician object based on the kind
            // Hint: Use if-else or switch statement to check the kind
            // Example: if (kind.equals("Drummer")) { band[i] = new Drummer(); }
            // Then set the name: band[i].name = musicianName;
            // This demonstrates polymorphism - storing different subclass objects in parent class array
            
            
            // TODO: Print a blank line for formatting between musicians
            
        
        
        // TODO: Loop through the band array
        // Hint: for (int i = 0; i < band.length; i++) { ... }
        
            // TODO: Print the result of calling play() on each band member
            // Hint: System.out.println(band[i].play());
            // This demonstrates polymorphism and method overriding
            
            
            // TODO: Call perform() on each band member
            // Hint: band[i].perform();
            // This demonstrates interface implementation
            
            
            // TODO: Print a blank line for formatting
            


        // Close the Scanner object to free up system resources
        scanner.close();
    }
}


// ============================================
// TASK 1: Speakable Interface
// ============================================

// TODO: Create an interface called Speakable
// Hint: interface Speakable { ... }
// Remember: Interfaces define a CONTRACT - methods that must be implemented
interface Speakable {
    
    // TODO: Add a method signature for makeSound() that returns void
    // Hint: void makeSound();
    // Remember: Interface methods have NO implementation (no curly braces, just semicolon)
    
}


// ============================================
// TASK 1: Animal Class
// ============================================

// TODO: Create a class called Animal that implements Speakable
// Hint: class Animal implements Speakable { ... }
// Remember: When you implement an interface, you MUST provide implementations for all methods
class Animal implements Speakable {
    
    // TODO: Create a public String property called name
    // Hint: public String name;
    
    
    // TODO: Create a public int property called age
    // Hint: public int age;
    
    
    // TODO: Create a constructor that takes only name as parameter
    // Hint: public Animal(String name) { ... }
    // Inside: Set this.name = name and this.age = 0
    // This is constructor overloading - multiple constructors with different parameters
    
    
    
    
    // TODO: Create a constructor that takes name and age as parameters
    // Hint: public Animal(String name, int age) { ... }
    // Inside: Set this.name = name and this.age = age
    // This is constructor overloading - another version with more parameters
    
    
    
    
    // TODO: Create a toString() method that returns a String
    // Hint: public String toString() { return name + " is an animal!"; }
    // Add @Override annotation above the method
    // Remember: toString() is automatically called when you print an object
    
    
    
    
    // TODO: Implement the makeSound() method from the Speakable interface
    // Hint: public void makeSound() { System.out.println(name + " makes a sound!"); }
    // Add @Override annotation above the method
    // Remember: You MUST implement all interface methods
    
    
}


// ============================================
// TASK 1: Duck Class
// ============================================

// TODO: Create a class called Duck that extends Animal
// Hint: class Duck extends Animal { ... }
// Remember: Duck inherits all properties and methods from Animal
class Duck extends Animal {
    
    // TODO: Create a constructor that takes only name as parameter
    // Hint: public Duck(String name) { super(name); }
    // Remember: super() calls the parent class constructor
    // This demonstrates constructor overloading
    
    
    
    
    // TODO: Create a constructor that takes name and age as parameters
    // Hint: public Duck(String name, int age) { super(name, age); }
    // Remember: This calls the other Animal constructor
    // This demonstrates constructor overloading
    
    
    
    
    // TODO: Override the toString() method
    // Hint: Return name + " is a duck!"
    // Add @Override annotation above the method
    // Remember: Overriding means replacing the parent's method with your own version
    
    
    
    
    // TODO: Override the makeSound() method
    // Hint: Print name + " quacks!"
    // Add @Override annotation above the method
    // Remember: This replaces the Animal's makeSound() behavior
    
    
}


// ============================================
// TASK 1: Sloth Class
// ============================================

// TODO: Create a class called Sloth that extends Animal
// Hint: class Sloth extends Animal { ... }
class Sloth extends Animal {
    
    // TODO: Create a constructor that takes only name as parameter
    // Hint: public Sloth(String name) { super(name); }
    // This demonstrates constructor overloading
    
    
    
    
    // TODO: Create a constructor that takes name and age as parameters
    // Hint: public Sloth(String name, int age) { super(name, age); }
    // This demonstrates constructor overloading
    
    
    
    
    // TODO: Override the toString() method
    // Hint: Return name + " is a sloth!"
    // Add @Override annotation above the method
    
    
    
    
    // TODO: Override the makeSound() method
    // Hint: Print name + " moves slowly and says nothing."
    // Add @Override annotation above the method
    
    
}


// ============================================
// TASK 2: Performer Interface
// ============================================

// TODO: Create an interface called Performer
// Hint: interface Performer { ... }
interface Performer {
    
    // TODO: Add a method signature for perform() that returns void
    // Hint: void perform();
    // Remember: Interface methods have no implementation
    
}


// ============================================
// TASK 2: Musician Class
// ============================================

// TODO: Create a class called Musician that implements Performer
// Hint: class Musician implements Performer { ... }
class Musician implements Performer {
    
    // TODO: Create a public String property called name
    // Hint: public String name;
    
    
    // TODO: Create a play() method that returns a String
    // Hint: public String play() { return name + " plays music."; }
    // This is method overloading - we'll create another play() method with different parameters
    
    
    
    
    // TODO: Create another play() method that takes a String parameter called song
    // Hint: public String play(String song) { return name + " plays " + song + "."; }
    // This demonstrates method overloading - same method name, different parameters
    
    
    
    
    // TODO: Implement the perform() method from the Performer interface
    // Hint: public void perform() { System.out.println(name + " is performing!"); }
    // Add @Override annotation above the method
    
    
}


// ============================================
// TASK 2: Bassist Class
// ============================================

// TODO: Create a class called Bassist that extends Musician
// Hint: class Bassist extends Musician { ... }
class Bassist extends Musician {
    
    // TODO: Override the play() method (the one with no parameters)
    // Hint: Return name + " plays bass."
    // Add @Override annotation above the method
    // Remember: This replaces the Musician's play() behavior
    
    
}


// ============================================
// TASK 2: Drummer Class
// ============================================

// TODO: Create a class called Drummer that extends Musician
// Hint: class Drummer extends Musician { ... }
class Drummer extends Musician {
    
    // TODO: Override the play() method (the one with no parameters)
    // Hint: Return name + " plays drums."
    // Add @Override annotation above the method
    
    
}


// ============================================
// TASK 2: Guitarist Class
// ============================================

// TODO: Create a class called Guitarist that extends Musician
// Hint: class Guitarist extends Musician { ... }
class Guitarist extends Musician {
    
    // TODO: Override the play() method (the one with no parameters)
    // Hint: Return name + " plays guitar."
    // Add @Override annotation above the method
    
    
}


// ============================================
// TASK 2: RhythmGuitarist Class
// ============================================

// TODO: Create a class called RhythmGuitarist that extends Guitarist
// Hint: class RhythmGuitarist extends Guitarist { ... }
// Remember: This is multi-level inheritance - RhythmGuitarist extends Guitarist which extends Musician
class RhythmGuitarist extends Guitarist {
    
    // TODO: Override the play() method (the one with no parameters)
    // Hint: Return name + " plays rhythm."
    // Add @Override annotation above the method
    // Remember: This overrides the Guitarist's play() method, not Musician's directly
    
    
}


// ============================================
// TASK 2: LeadGuitarist Class
// ============================================

// TODO: Create a class called LeadGuitarist that extends Guitarist
// Hint: class LeadGuitarist extends Guitarist { ... }
class LeadGuitarist extends Guitarist {
    
    // TODO: Override the play() method (the one with no parameters)
    // Hint: Return name + " plays a mean solo!"
    // Add @Override annotation above the method
    
    
}
