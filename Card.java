
import java.awt.*;
import javax.swing.*;

/**
 * Class Card - write a description of the class here
 * 
 * @author Taylor Countryman
 * @version (a version number)
 */
public class Card extends JApplet
{
    // instance variables - replace the example below with your own
    private int x;

     /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * has been loaded into the system. It is always called before the first 
     * time that the start method is called.
     */
    public void init()
    {
        // this is a workaround for a security conflict with some browsers
        // including some versions of Netscape & Internet Explorer which do 
        // not allow access to the AWT system event queue which JApplets do 
        // on startup to check access. May not be necessary with your browser. 
        JRootPane rootPane = this.getRootPane();    
        rootPane.putClientProperty("defeatSystemEventQueueCheck", Boolean.TRUE);
    
        // provide any initialisation necessary for your JApplet
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it 
     * should start its execution. It is called after the init method and 
     * each time the JApplet is revisited in a Web page. 
     */
    public void start()
    {
        // provide any code requred to run each time 
        // web page is visited
    }

    /** 
     * Called by the browser or applet viewer to inform this JApplet that
     * it should stop its execution. It is called when the Web page that
     * contains this JApplet has been replaced by another page, and also
     * just before the JApplet is to be destroyed. 
     */
    public void stop()
    {
        // provide any code that needs to be run when page
        // is replaced by another page or before JApplet is destroyed 
    }

    /**
     * Paint method for applet.
     * 
     * @param  g   the Graphics object for this applet
     */
    public void paint(Graphics card)
    {
        //This is where the project begins        
        card.setColor (Color. orange);
        card.drawRect ( 50, 50, 500, 300);
        card.fillRect ( 50, 50, 500, 300);
        //Info
        card.setColor (Color.blue);
        card.drawString ("Countryman & Company", 70, 70);       
        card.drawString ("Taylor Countryman C.E.O.", 90, 90);
        card.setColor (Color.black);
        card.drawRect ( 65, 55, 250, 150);
        card.setColor (Color.black);
        card.drawString ("Email: countryman.taylor@gmail.com", 80, 130);
        card.drawString ("Twitter: Taylor_Country", 80, 150);
        card.drawString ("Phone: 616.0337.0078", 80, 170);
        //pic
        card.setColor (Color.black);
        card.drawRect ( 70, 280, 350, 50);
        card.drawString (" \" Do or do not.  There is no try \" -Yoda", 80, 300);
        card.fillRect (90, 310, 100, 10);
//         card.setColor (Color.blue);
//         card.fillRect (90, 410, 100, 10);
        card.drawRect (90, 310, 300, 10);
        card.drawOval (380, 80, 120, 120);
        card.drawRect (330, 100, 60, 60);
        
        
        
        
        
    }

    /**
     * Called by the browser or applet viewer to inform this JApplet that it
     * is being reclaimed and that it should destroy any resources that it
     * has allocated. The stop method will always be called before destroy. 
     */
    public void destroy()
    {
        // provide code to be run when JApplet is about to be destroyed.
    }


    /**
     * Returns information about this applet. 
     * An applet should override this method to return a String containing 
     * information about the author, version, and copyright of the JApplet.
     *
     * @return a String representation of information about this JApplet
     */
    public String getAppletInfo()
    {
        // provide information about the applet
        return "Title:   \nAuthor:   \nA simple applet example description. ";
    }


    /**
     * Returns parameter information about this JApplet. 
     * Returns information about the parameters than are understood by this JApplet.
     * An applet should override this method to return an array of Strings 
     * describing these parameters. 
     * Each element of the array should be a set of three Strings containing 
     * the name, the type, and a description.
     *
     * @return a String[] representation of parameter information about this JApplet
     */
    public String[][] getParameterInfo()
    {
        // provide parameter information about the applet
        String paramInfo[][] = {
                 {"firstParameter",    "1-10",    "description of first parameter"},
                 {"status", "boolean", "description of second parameter"},
                 {"images",   "url",     "description of third parameter"}
        };
        return paramInfo;
    }
}
