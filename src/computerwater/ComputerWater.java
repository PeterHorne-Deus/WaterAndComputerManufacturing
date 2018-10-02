/*
 * Peter Horne-Deus 
 * ComputerWater.java
 * This program allows the user to input how many computers and monitors they have to calculate the amount of water used to make them
 * October 2,2018
 */

package computerwater;

import java.util.Scanner;

public class ComputerWater {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Creating Scanner
        Scanner keyedInput = new Scanner(System.in);
        
        //Variables
        final double MONITOR_WATER = 0.5;
        final double COMPUTER_WATER = 1.0;
        double waterUsedMonitors,waterUsedComputers,totalUsed;
        int numComputers,numMonitors;
        
        //user Input
        System.out.println("Enter the number of Computers you own");
        numComputers = keyedInput.nextInt();
        
        System.out.println("Enter the number of monitors you own");
        numMonitors = keyedInput.nextInt();
        
        //Caculations
        waterUsedMonitors = numMonitors * MONITOR_WATER;
        waterUsedComputers = numComputers * COMPUTER_WATER;
        totalUsed = waterUsedComputers + waterUsedMonitors; 
        
        //Output
        System.out.println("The total water used for you monitors and computers is " + totalUsed + " Tons");
        
        //Ending program
        keyedInput.close();
    }
    
}
