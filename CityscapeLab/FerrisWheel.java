import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.Color;
import java.awt.BasicStroke;

/**
 * A ferris wheel
 * 
 * @author Adrianna Fu 
 * @version 10//15
 * 
 */
public class FerrisWheel
{
    /** The x variable of ferris wheel */
    private int xLeft;
    /** The y variable ferris wheel */
    private int yTop;
    /** Diameter of ferris wheel */
    private int diameter;
    
    /**
     * Constructs a ferris wheel at the given coordinates
     * @param x: the x-coordinate of the top left corner of the ferris wheel
     * @param y: the y-coordinate of the top left corner of the ferris wheel
     * @param aDiameter: the diameter of the outer circle of the ferris wheel
     */
    public FerrisWheel(int x, int y, int aDiameter)
    {
        xLeft = x;
        yTop = y;
        diameter = aDiameter;
    }

    /**
     * Draws a ferris wheel 
     * @param g2: the graphics context
     */
    public void drawFerrisWheel(Graphics2D g2)
    {
        Ellipse2D.Double circle = new Ellipse2D.Double(xLeft, yTop, diameter, diameter);
        g2.setColor(Color.BLACK);
        g2.setStroke(new BasicStroke(5));
        g2.draw(circle);
      
        g2.setStroke(new BasicStroke(3));
        Ellipse2D.Double smallerCircle = new Ellipse2D.Double(xLeft+10, yTop+10, diameter-20,diameter-20);
        g2.draw(smallerCircle);
        
        g2.setStroke(new BasicStroke(6));
        int radius = diameter/2;
        int xCenter = xLeft + radius;
        int yCenter = yTop + radius;
        int yLinesEnd = yTop+diameter;
        int xFirstLineEnd = xLeft + (radius/2);
        int xSecondLineEnd = xLeft + (3*radius/2);
        
        g2.drawLine(xCenter, yCenter, xFirstLineEnd, yLinesEnd);
        g2.drawLine(xCenter, yCenter, xSecondLineEnd, yLinesEnd);
    }

}
