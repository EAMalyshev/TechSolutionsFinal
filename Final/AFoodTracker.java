// For grading
// Loop: AFoodTracker.java, Line 21 (while)
// Conditionals: AFoodTracker.java, Line 38 (if/else)
// Variables: AFoodTracker.java, Line 15 (boolean),24 (String), 29 (int). Fridge.java, Line 2 (String, 1D Array)
// Array: Fridge.java, Line 2 (String, 1D Array)
// Classes/functions: AFoodTracker.java, Line 14 (class object)



import java.util.Scanner; // imports scanner class
public class AFoodTracker { // declares our class
    public static void main(String[] args) // Java skeleton
    { // main class
        Scanner input = new Scanner(System.in); // declare scanner
        boolean isOn = true; // Used to keep the loop going
        Fridge fridge = new Fridge(); // Creates a class for our fridge
        
        System.out.print("\033[H\033[2J"); // clear formula
        System.out.flush(); // clear formula
        System.out.println("Welcome to food tracker. We will be tracking what food you have in your fridge. You have five slots in your fridge (0-4). Your fridge is currently empty"); // welcomes user
        while (isOn) { // This loop keeps running the program.

            System.out.print("Would you like to \"Look\" at food, \"Add\" food, \"Eat\" food, or \"quit\"?: "); // prompts user
            String addEat = input.nextLine().toLowerCase(); //stores answer

            switch(addEat){ // creates a few cases to switch between
                case "look": // in that case that the user wants to eat food
                    System.out.print("What slot would you like to look at?: "); // Asks user for a slot
                    int daSlot = input.nextInt(); // stores what slot the users wants to eat from
                    input.nextLine(); // clear input
                    System.out.println("Slot " + daSlot + " contains " + fridge.getFood(daSlot)); // confirms user has eaten food from what slo
                    break; // break the switch/case

                case "add": // in the case that the user wants to add food
                    System.out.print("What slot would you like to add to?: "); // Asks user for a slot
                    int slot = input.nextInt(); // stores what slot the users wants to add to
                    input.nextLine();
                    if (fridge.isEmpty(slot) == false) { // uses isEmpty function to determine if the user can add to this slot or not
                        System.out.print("This slot is full!"); // if it is full, tell user it is full
                    } else { // if the slot is empty
                        System.out.print("What would you like to put here?: "); // asks user what they would like to put into this slot
                        String food = input.nextLine(); // store the variable
                        fridge.modFood(slot, food); // modifies whats in the fridge
                        System.out.println("You have added " + food + " to slot " + slot + "."); // confirms user has added what food to what slot
                    } // end of else
                    break; // break the switch/case

                case "eat": // in that case that the user wants to eat food
                    System.out.print("What slot would you like to eat from?: "); // Asks user for a slot
                    int maSlot = input.nextInt(); // stores what slot the users wants to eat from
                    input.nextLine(); // clear input
                    fridge.modFood(maSlot, ""); // modifies whats in the fridge
                    System.out.println("You have aten from slot " + maSlot + "."); // confirms user has eaten food from what slot
                    break; // break the switch/case

                case "quit": // in the case that the user wants to quit the program
                    isOn = false; // sets loop to off
                    break; // break the switch/case
            } // end of switchcase
            System.out.println(); // prints another line
        } // end of loop
        input.close(); // close the scanner
    } // end of class
} // end of program