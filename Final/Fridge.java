public class Fridge { // creates class Fridge
    private String[] maFood = {"Mango", "Cheese", "Tomato", "", ""}; // creates fridge


    public boolean isEmpty(int slot) { // creates a function for if the slot is empty
        return maFood[slot].equals(""); // if slot is empty, return true
    } // end of function

    public String getFood(int slot) { // creates function to look at food
        return maFood[slot]; // returns whats in the slot
    } // end of function

    public void modFood(int slot, String theFood) { // creates a function to modify contents of fridge
        maFood[slot] = theFood;
    } // end of function
} // end of class