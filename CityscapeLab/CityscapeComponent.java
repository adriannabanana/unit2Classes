import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.GradientPaint;
import java.awt.Color;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these objects
 * 
 * @author Adrianna Fu
 * @version 10/8/15
 */
public class CityscapeComponent extends JComponent
{
    /** Daytime or nighttime */
    private String timeOfDay;
    /** Where the light is coming from: moon or sun */
    private LightSource light;
    /** A skyscraper building */
    private Skyscraper building;
    /** A ferris wheel */
    private FerrisWheel wheel;
    /** A dome building */
    private DomeBuilding dome;
    /** Another skyscraper building */
    private Skyscraper building2;
    /** The top floors of the above skyscraper building */
    private Skyscraper building2Part;
     
    /**
     * Constructs the city!
     * @param day: the time of day (daytime or nighttime)
     */
    public CityscapeComponent(String day)
    {
        this.timeOfDay = day;
        this.light = new LightSource(600,100,40);
        this.building = new Skyscraper(60,175,70,240);
        this.wheel = new FerrisWheel(100,65,350);
        this.dome = new DomeBuilding(400,355,125,65);
        this.building2 = new Skyscraper(520,170,70,250);
        this.building2Part = new Skyscraper(535,150,40,80);
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

        building.drawRectangle(g2);
        wheel.drawFerrisWheel(g2);
        dome.drawDome(g2);
        building2.drawRectangle(g2);
        building2Part.drawRectangle(g2);
    }
    
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
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
