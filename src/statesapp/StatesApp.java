/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statesapp;

import java.util.*;
import java.lang.*;

/**
 * *****************************************************************************
 * Create a software package as a NetBeans project that contains three classes:
 * > an executable class for the project itself > a class of states, with the
 * properties name, capital, and population > a class for an array of state
 * objects
 *
 * The state and array classes should contain appropriate properties and methods
 * to work with those properties. Your project’s class (with the same name as
 * the package) should contain a main method, and methods to test your other
 * classes as follows: > load the data from the data file into the array of
 * states. > print the list of states -- including each state’s name, capital
 * and population -- with the data for each state on a separate line. > a method
 * that asks the user for the name of a state, then either displays the data for
 * that state, or says the state was not found in the list.
 *
 * The main method should simply call the other methods in the class to show
 * that they work.
 *
 * @author milto_000
 *****************************************************************************
 */
public class StatesApp {

    static States[] usa = new States[50]; // array of 50 States

    public static void main(String[] args) throws Exception {
        load();
        print();

    }//end of main()

    static void load() throws Exception {

        //sending empty array to loadArray
        Array.loadArray(usa);

        System.out.println(Arrays.toString(usa));
    }

    static void print() throws Exception {
        System.out.println(Arrays.toString(usa));

    }

    void input() {
        int i;
    }
}
