/**
 * Represents one row from your dataset.
 *
 * TODO:
 *  - Rename the class to match your dataset (e.g., Pokemon, StateData, CountryStat)
 *  - Add at least 3 private attributes based on your CSV columns
 *  - Write a constructor that initializes all attributes
 *  - Add getter methods for the attributes you need in your analysis
 *  - Override toString() to display the object's data
 *  - Add Javadoc comments for the class and all methods
 */
public class State {

    // TODO: Add at least 3 private attributes
    // Example:
    // private String name;
    // private int population;
    // private double value;
    private String stateName;
    private int population;
    private double firearmDeathsPer100k;
    private double drugOverdoseDeathsPer100k;
    private double ratio;
    private String message;

    // TODO: Create a constructor that takes all attributes as parameters
    public State(String stateName, String population, String firearmDeathsPer100k, String drugOverdoseDeathsPer100k,double ratio,String message) {
        this.stateName = stateName;
        this.population = Integer.parseInt(population);
        this.firearmDeathsPer100k = Double.parseDouble(firearmDeathsPer100k);
        this.drugOverdoseDeathsPer100k = Double.parseDouble(drugOverdoseDeathsPer100k);
        if (this.getDrugOverdoseDeathsPer100k() == 0) {
            this.message=("Division by 0 not possible"); // Avoid division by zero
            this.ratio= Double.NaN;
        }
            else if (this.getFirearmDeathsPer100k() == 0 &&this.getDrugOverdoseDeathsPer100k() ==0) {

                this.ratio = 0.0;
                               this.message=(""+ this.ratio + " (no firearm deaths and or drug deaths)"); // If there are no firearm deaths, the ratio is 0

        }
        else if(this.getDrugOverdoseDeathsPer100k() <0 || this.getFirearmDeathsPer100k() <0){
                    this.message=("no data to compare"); // Avoid null data error
                     this.ratio= Double.NaN;
                }
        
                
        else {

            this.ratio= this.findRatioFirearmToDrugDeaths();
            this.message=(""+this.ratio); // Calculate the ratio of firearm deaths to drug overdose deaths
        }
    }
    

    // TODO: Add getters for attributes you need
    public String getStateName() {
        return stateName;
    }
    public int getPopulation() {
        return population;
    }
    public double getFirearmDeathsPer100k() {
        return firearmDeathsPer100k;
    }
    public double getDrugOverdoseDeathsPer100k() {
        return drugOverdoseDeathsPer100k;
    }
    public double getRatio() {
        return ratio;
    }
    public String getMessage() {
        return message;
    }
    // TODO: Add other data analysis methods
    public double findRatioFirearmToDrugDeaths() {
        double raw = this.getFirearmDeathsPer100k() / this.getDrugOverdoseDeathsPer100k();
        double rounded = Math.round(raw * 100.0) / 100.0; // Round to 2 decimal places
        return rounded;
    }
    
    // Find the state with the highest ratio of firearm deaths to drug overdose deaths
    public static State findHighestRatio(State[] states) {
        State maxState = states[0];
        double maxRatio = states[0].getRatio();
        for (int i = 1; i < states.length; i++) {
            if (states[i].getRatio() > maxRatio) {
                maxRatio = states[i].getRatio();
                maxState = states[i];
            }
        }
        return maxState;
    }
    
    // Find the state with the lowest ratio of firearm deaths to drug overdose deaths
    public static State findLowestRatio(State[] states) {
        State minState = states[0];
        double minRatio = states[0].getRatio();
        for (int i = 1; i < states.length; i++) {
            if (states[i].getRatio() < minRatio && states[i].getRatio() >= 0) {
                minRatio = states[i].getRatio();
                minState = states[i];
            }
        }
        return minState;
    }
    
    // Find the average ratio of firearm deaths to drug overdose deaths across all states
    public static double findAverageRatio(State[] states) {
        double sum = 0;
        int count = 0;
        for (int i = 0; i < states.length; i++) {
            if (states[i].getRatio() >= 0) {
                sum = sum + states[i].getRatio();
                count = count + 1;
            }
        }
        double average = sum / count;
        return average;
    }
    
    // Find how many times the ratio is within .25 of 1 (between .75 and 1.25)
    public static int findCloseToOneCount(State[] states) {
        int closeToOneCount = 0;
        for (int i = 0; i < states.length; i++) {
            double ratio = states[i].getRatio();
            if (ratio >= 0.75 && ratio <= 1.25) {
                closeToOneCount = closeToOneCount + 1;
            }
        }
        return closeToOneCount;
    }
    
    

    // TODO: Override toString() to return a readable representation of your object
public String toString(){
        return stateName + " has a population of " + population + " and " + firearmDeathsPer100k + " firearm deaths per 100k and " + drugOverdoseDeathsPer100k + " drug overdose deaths per 100k" + " and the ratio of firearm deaths to drug overdose deaths is: " + message;
}
}