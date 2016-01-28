
package statesapp;

import java.io.File;
import java.util.*;
import java.lang.*;

/**
 *
 * @author milto_000
 */
public class Array {
    
    public static void loadArray(States[] usa) throws Exception {
        // a loop counter
        int i;

        // declare temporary variables to hold
        String st;  //state
        String ca;  //capital
        int pop;    //population

        // Create a File class object linked to the name of the file to be read
        File stateFile = new File("statedata.txt");

        // Create a Scanner named infile to read the input stream from the file
        Scanner infile = new Scanner(stateFile);

        //loop to read data in the array
        for (i = 0; i < 50; i++) {
            //read in temporary variables
            st = infile.nextLine();
            ca = infile.nextLine();
            pop = Integer.parseInt(infile.nextLine());

            //initialize each variable with the States contructor
            usa[i] = new States(st, ca, pop);
        }//end for
        infile.close();
    }//end loadArray()
}//end class Array
