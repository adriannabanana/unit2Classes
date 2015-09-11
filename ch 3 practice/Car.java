

/**
 * The class Car has a certain fuel efficiency and a certain amount of fuel in the gas tank. 
 * A Car may be driven a specified distance which reduces the amount of gas in the tank.
 * 
 * @author Adrianna 
 * @version 10 September 2015
 */
public class Car
{
    /** specifies the fuel efficiency of the car in units of miles per gallon (mpg) */
    private double fuelEfficiency;
    
    /** specifies the amount of fuel in the gas tank in units of gallons */
    private double fuelInTank;
    
    /**
     * Constructor for objects of class Car that specifies the fuel efficiency of the car
     */
    public Car(double fuelEfficiency)
    {
        fuelInTank = 0.0;
        fuelEfficiency = fuelEfficiency;
    }

    /**
     * Simulates driving the car the specified distance in miles and reduces the amount 
     * of fuel in the car's gas tank.
     *
     * @pre        the specified distance cannot consume more than the fuel available in the tank
     * 
     * @param      distance: the specified distance to drive in miles
     */
    public void drive(double distance) //defining the drive method
    {
        fuelInTank -= distance/fuelEfficiency;
    }

    /**
     * Returns the number of gallons of gas in the car's tank.
     * 
     * @return  the number of gallons in the car's tank
     */
    public double getGasInTank()
    {
        return fuelInTank;
    }

    /**
     * Increments the fuel stored in the car's tank by the specified amount in gallons.
     *
     * @pre     gallonsOfGas must be a positive value
     * 
     * @param   gallonsOfGas: amount in gallons to add to the car's tank
     * 
     */
    public void addGas(double gallonsOfGas)
    {
        fuelInTank += gallonsOfGas;        

    }


}
