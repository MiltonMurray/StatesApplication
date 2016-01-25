package statesapp;

/**
 *
 * @author milto_000
 */
class States {

    private String state;
    private String capital;
    private int population;

    //**************************************************************************
    // constructors
    States() {

    }

    public States(String state, String capital, int population) {
        this.state = state;
        this.capital = capital;
        this.population = population;

    } // end States((String state, String capital, int population)
    //**************************************************************************
    // accesors 

    public String getState() {
        return state;
    } //end  getState()

    public String getCapital() {
        return capital;
    } //end  getCapital()

    public int getPopulation() {
        return population;
    } //end  getPopulation()

    //**************************************************************************   
    // a method to return the States's data as a String
    public String toString() {
        String info;
        info = (capital + ", " + state + " " + population + "\n");
        return info;
    } //end  toString()

} // end class States
