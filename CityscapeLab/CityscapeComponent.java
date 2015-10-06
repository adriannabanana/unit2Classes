import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.GradientPaint;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    private boolean timeOfDay;
    public CityscapeComponent(boolean day)
    {
        this.timeOfDay = day;
    }
    

    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
        Graphics2D g2 = (Graphics2D) g;
        
        Skyscraper building = new Skyscraper(60,175,70,240);
        building.drawRectangle(g2);
        
        FerrisWheel wheel = new FerrisWheel(100,65,350);
        wheel.drawFerrisWheel(g2);
        
        DomeBuilding dome = new DomeBuilding(400,355,125,65);
        dome.drawDome(g2);
        
        Skyscraper building2 = new Skyscraper(520,170,70,250);
        building2.drawRectangle(g2);
        
        Skyscraper building2Part = new Skyscraper(535,150,40,80);
        building2Part.drawRectangle(g2);
        
        if (day = true)
        {
            //draw the sun
            //make the sky light
            // Color color1 = getBackground();
//         Color color2 = color1.darker();
//         int w = getWidth();
//         int h = getHeight(); 
//         GradientPaint gp = new GradientPaint(
//                 0, 0, color1,
//                 0, h, color2);
// 
//         g2d.setPaint(gp);
//         g2d.fillRect(0, 0, w, h);
        }
        else
        {
            //draw the moon
            //make the sky dark
        }

    }
    

    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
