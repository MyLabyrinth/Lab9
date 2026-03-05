// Import Scanner class to read user input from the console
import java.util.Scanner;

// This is the only public class in the file
public class Lab9 {
    
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
        // This demonstrates constructor overloading - using the single parameter constructor
        
        
        // TODO: Ask the user for the Sloth's name
        
        
        // TODO: Ask the user for the Sloth's age
        // Hint: Use scanner.nextInt() then scanner.nextLine() to clear buffer
        
        
        // TODO: Create a Sloth object using the constructor with name and age
        // This demonstrates constructor overloading - using the two parameter constructor
        
        
        // TODO: Print a blank line for formatting
        
        
        // TODO: Print the Duck object
        // This will automatically call the toString() method (overriding demonstration)
        
        
        // TODO: Call makeSound() on the Duck
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
        // This demonstrates polymorphism - the array can hold any subclass of Musician
        
        
        // TODO: Loop 4 times to fill the band array
        
        
            // TODO: Ask the user for the musician's name
            
            
            // TODO: Ask the user for the kind of musician
            
            
            
            // TODO: Create the appropriate Musician object based on the kind
            // This demonstrates polymorphism - storing different subclass objects in parent class array
            
            
            // TODO: Print a blank line for formatting between musicians
            
        
        
        // TODO: Loop through the band array
        
        
            // TODO: Print the result of calling play() on each band member

            
            
            // TODO: Call perform() on each band member

            
            
            // TODO: Print a blank line for formatting
            


        // Close the Scanner object to free up system resources
        scanner.close();
    }
}


// ============================================
// TASK 1: Speakable Interface
// ============================================

// TODO: Create an interface called Speakable

interface Speakable {
    
    // TODO: Add a method signature for makeSound() that returns void

    
}


// ============================================
// TASK 1: Animal Class
// ============================================

// TODO: Create a class called Animal that implements Speakable

class Animal implements Speakable {
    
    // TODO: Create a public String property called name

    
    
    // TODO: Create a public int property called age

    
    
    // TODO: Create a constructor that takes only name as parameter

    
    
    
    
    // TODO: Create a constructor that takes name and age as parameters

    
    
    
    
    // TODO: Create a toString() method that returns a String

    
    
    
    
    // TODO: Implement the makeSound() method from the Speakable interface

    
    
}


// ============================================
// TASK 1: Duck Class
// ============================================

// TODO: Create a class called Duck that extends Animal

class Duck extends Animal {
    
    // TODO: Create a constructor that takes only name as parameter

    
    
    
    
    // TODO: Create a constructor that takes name and age as parameters

    
    
    
    
    // TODO: Override the toString() method
    
    
    
    
    // TODO: Override the makeSound() method

    
    
}


// ============================================
// TASK 1: Sloth Class
// ============================================

// TODO: Create a class called Sloth that extends Animal

class Sloth extends Animal {
    
    // TODO: Create a constructor that takes only name as parameter

    
    
    
    
    // TODO: Create a constructor that takes name and age as parameters

    
    
    
    
    // TODO: Override the toString() method

    
    
    
    
    // TODO: Override the makeSound() method

    
    
}


// ============================================
// TASK 2: Performer Interface
// ============================================

// TODO: Create an interface called Performer

interface Performer {
    
    // TODO: Add a method signature for perform() that returns void
    
}


// ============================================
// TASK 2: Musician Class
// ============================================

// TODO: Create a class called Musician that implements Performer

class Musician implements Performer {
    
    // TODO: Create a public String property called name
    
    
    // TODO: Create a play() method that returns a String
    
    
    
    
    
    // TODO: Create another play() method that takes a String parameter called song
    
    
    
    
    // TODO: Implement the perform() method from the Performer interface

    
    
}


// ============================================
// TASK 2: Bassist Class
// ============================================

// TODO: Create a class called Bassist that extends Musician

class Bassist extends Musician {
    
    // TODO: Override the play() method (the one with no parameters)

    
    
}


// ============================================
// TASK 2: Drummer Class
// ============================================

// TODO: Create a class called Drummer that extends Musician

class Drummer extends Musician {
    
    // TODO: Override the play() method (the one with no parameters)
  
    
    
}


// ============================================
// TASK 2: Guitarist Class
// ============================================

// TODO: Create a class called Guitarist that extends Musician

class Guitarist extends Musician {
    
    // TODO: Override the play() method (the one with no parameters)
    
    
    
}


// ============================================
// TASK 2: RhythmGuitarist Class
// ============================================

// TODO: Create a class called RhythmGuitarist that extends Guitarist
// Remember: This is multi-level inheritance - RhythmGuitarist extends Guitarist which extends Musician
class RhythmGuitarist extends Guitarist {
    
    // TODO: Override the play() method (the one with no parameters)
   
    
    
}


// ============================================
// TASK 2: LeadGuitarist Class
// ============================================

// TODO: Create a class called LeadGuitarist that extends Guitarist

class LeadGuitarist extends Guitarist {
    
    // TODO: Override the play() method (the one with no parameters)
    
    
    
}
