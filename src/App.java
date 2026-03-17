import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * Main application for the Data Analysis Mini‑Project.
 *
 * TODO:
 *  - Update the path to your dataset file
 *  - Read the CSV file using Scanner
 *  - Parse each row and extract the correct columns
 *  - Construct Data objects from each row
 *  - Store them in an array
 *  - Write methods to analyze the dataset (min, max, average, filters, etc.)
 *  - Print insights and answer your guiding question
 *  - Add Javadoc comments for any methods you create
 */
public class App {
    static String filename = "STATE_DATA.csv";

    // TODO: Create an array of Data objects to store data
    static State[] stateList = new State[52];

    // TODO: Read file using Scanner
    // - Skip header if needed
    // - Loop through rows
    // - Split each line by commas
    // - Convert text to numbers when needed
    // - Create new Data objects
    // - Add to your array
    public static void main(String[] args) throws IOException {
        // create a file
        File file = new File(filename);
        // create Scanner object connected to the file
        Scanner scan = new Scanner(file);
        
        int i = 0;
        while(scan.hasNext() && i < stateList.length){
           
            if (i == 0){
               scan.nextLine();
            }
            String line = scan.nextLine();
            String[] parts = line.split(",");
            String StateName = parts[0];
            String population = parts[1];
            String firearmDeathsPer100k  = parts[3];
            String drugOverdoseDeathsPer100k = parts[5];
            double ratio=0.0;
            String message="";
            State S = new State (StateName, population, firearmDeathsPer100k, drugOverdoseDeathsPer100k,ratio,message);
            stateList[i] = S;
            i++;
        }
        printStates();
        
        // Call analysis methods from State.java
        State highest = State.findHighestRatio(stateList);
        System.out.println("\nState with highest ratio: " + highest.getStateName() + " with ratio " + highest.getRatio());
        
        State lowest = State.findLowestRatio(stateList);
        System.out.println("State with lowest ratio: " + lowest.getStateName() + " with ratio " + lowest.getRatio());
        
        double average = State.findAverageRatio(stateList);
        System.out.println("Average ratio: " + average);
        
        int closeToOneCount = State.findCloseToOneCount(stateList);
        System.out.println("Number of states with ratio within 0.25 of 1: " + closeToOneCount);

        // TODO: Print insights
        // - Number of rows loaded
        // - Min, max, average, or any other findings
        // - Final answer to your guiding question
        System.out.println(" my final answer to the question is that 15 of the states were 0.25 within having a 1 to 1 ratio of gun to OD death rates meaning about 25% of states it might have relation in but the overarching and more obvious and clear answer is no.");
     
        scan.close();
    }

    // : Call your analysis methods
    // Example:
    // double maxValue = findMaxValue(dataList);
    // double average = computeAverageValue(dataList);
    public static void printStates(){
        // print all states
        for(State s: stateList){
            System.out.println(s);
        }
    }

    // OPTIONAL TODO:
    // Add user interaction:
    // Ask the user what kind of analysis they want to see
}
