/*******************************************************************************
 * Final Project- Comparison of Sorting Algorithms
 * CSCI 112 Fall 2015 
 * Last edited December 1, 7:00 p.m.
 * @author Milton Murray
 ******************************************************************************/
package statesapp;

import java.util.*;
import java.lang.*;

/*******************************************************************************
 * Create a software package as a NetBeans project that contains three classes:
 *      > an executable class for the project itself 
 *      > a class of states, with the properties name, capital, and population
 *      > a class for an array of state objects
 * 
 * The state and array classes should contain appropriate properties and methods
 * to work with those properties. Your project’s class (with the same name as
 * the package) should contain a main method, and methods to test your other
 * classes as follows: 
 *      > load the data from the data file into the array of states.     
 *      > print the list of states -- including each state’s name, capital
 *        and population -- with the data for each state on a separate line. 
 *      > a method that asks the user for the name of a state, then either displays 
 *        the data for that state, or says the state was not found in the list.
 * 
 * The main method should simply call the other methods in the class to show
 * that they work.
 ******************************************************************************/
public class StatesApp {
   static States[] usa = new States[50]; // array of 50 States

    public static void main(String[] args) throws Exception {
        load();
        print();
        input();

    }//end of main()
//==============================================================================
    /**
     * Load the data from the data file into the array of states.
     * 
     * @throws Exception 
     */
    static void load() throws Exception {
        //sending empty array to loadArray
        Array.loadArray(usa);
    }//end load()
//==============================================================================
    /**
     * Print the list of states -- including each state’s name, capital,
     * and population -- with the data for each state on a separate line.
     * 
     * @throws Exception 
     */
    static void print() throws Exception {
        System.out.println(Arrays.toString(usa));

    }// end print()
//==============================================================================
    /**
     * Asks the user for the name of a state, then either displays
     * the data for that state, or says the state was not found in the list.
     */
    static void input() {
        String target;         // the city for which we are searching
        int n;                 // loop counter
        char c;                // used to check the first letter
        boolean found = false; // true if the target city is found in the array

        // set up input stream from the keyboard  
        Scanner keyboard = new Scanner(System.in);

        // print intro message
        System.out.print("Please Enter the name of the state you are searching for.\n\n");

        // get the target name of the state from the user
        System.out.print("State: ");
        target = keyboard.nextLine();
        c = target.charAt(0);   //looks at the first letter

        // search array of US states 
        // the loop coninues to the end of the array if the city is not found  
        for (n = 0; (!found) && (n < usa.length); n++) {
            States us = usa[n];//sets class object to the current position

            if (!usa[n].toString().contains(target)) {  //first checks for this string
            } else if (us.getState().matches(target)) { //then checks if it's a state
                //print found message and set found to true
                System.out.println(usa[n]);
                found = true;
            } // end if

        } // for loop

        // after the loop – if not(found) print not found message
        if (!found) {
            System.out.println(target + " was not found.");
        }//end if
        if (!Character.isUpperCase(c)) {
            System.out.println("All states should be capitalized correctly"
                    + ", Please try again.\n");
        }//end if
    }//end input()
}//end class StatesApp
