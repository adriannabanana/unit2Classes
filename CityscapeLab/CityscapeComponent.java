import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.GradientPaint;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    /** Daytime or nighttime */
    private String timeOfDay;
    LightSource light = new LightSource(600,100,40);
    
    public CityscapeComponent(String day)
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
        
        if (timeOfDay.equals("daytime"))
        {
            Sky sky = new Sky(Color.CYAN);
            sky.skyGradient(g2);
            light.drawSun(g2);
        }
        if (timeOfDay.equals("nighttime"))
        {
            Sky sky = new Sky(Color.BLUE);
            sky.skyGradient(g2);
            light.drawMoon(g2);
        }
        
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
 
    }
    

    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        
        if (timeOfDay.equals("daytime"))
        {
            light.sunMove();
        }
        if (timeOfDay.equals("nighttime"))
        {
            light.moonMove();
        }
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
