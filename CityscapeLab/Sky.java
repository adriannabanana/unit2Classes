import java.awt.GradientPaint;
import java.awt.Graphics2D;
import java.awt.Color;

/**
 * Write a description of class Sky here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Sky
{
    /** Color of the sky gradient 1 */
    private Color x;
    /** Color of the sky gradient 2 */
    private Color y;

    /**
     * Default constructor for objects of class Sky
     */
    public Sky(Color aColor)
    {
        x = Color.WHITE;
        y = aColor;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
     */
    public void skyGradient(Graphics2D g2)
    {
        int w = 800;
        int h = 500;
        GradientPaint gp = new GradientPaint(0,0,y,0,h,x);
        g2.setPaint(gp);
        g2.fillRect(0,0,w,h);
    }
    

}
