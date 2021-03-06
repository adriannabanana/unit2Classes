

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * Write a description of test class CarTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CarTest
{
    /** description of instance variable x (add comment for each instance variable) */
    private int x;

    /**
     * Default constructor for objects of class CarTest
     */
    public CarTest()
    {
        // initialise instance variables
        x = 0;
    }
    
    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testAddGas()
    {
        Car car = new Car(50.0);
        car.addGas(5.0);
        assertEquals(5.0, car.getGasInTank(), 1E-6); //third parameter is epsilon
        car.addGas(7.0);
        assertEquals(12.0, car.getGasInTank(),1E-6);
    }
    
    @Test
    public void getGasInTank()
    {
        Car car = new Car(50.0);
        assertEquals(0.0, car.getGasInTank(), 1E-6);
        car.addGas(10.0);
        assertEquals(10.0, car.getGasInTank(), 1E-6);
    }
    
    @Test
    public void testDrive()
    {
        Car car = new Car(50.0);
        car.addGas(10.0);
        car.drive(200.0);
        assertEquals(6.0, car.getGasInTank(), 1E-6);
        car.drive(25.0);
        assertEquals(5.5, car.getGasInTank(), 1E-6);
    }
}
