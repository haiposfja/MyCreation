/* Name: Ryken Santillan
   Teacher: Ms. Basaraba
   Date: 3/26/2020
   Description: This class contains the animation of a Falling Meteor
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;


public class FallingMeteor extends Thread
{
    private Console c; // the output console

    public void meteor ()
    {

	// local color for the meteor: silver
	Color meteor = new Color (190, 190, 190);
	
	// local color for the meteor spots: Spanish Grey
	Color meteorSpots = new Color (152, 152, 152);
	
	// local color for the midnight sky: midnight purple
	Color sky = new Color (55, 43, 64);
	 
	// for loop for animating the meteor
	for (int a = 0 ; a < 100 ; a++)
	{
	    // for loop for drawing the meteor's flames
	    for (int b = 0 ; b < 34 ; b++)

		{
	      
		    c.setColor (Color.red);
		    c.drawLine (320 - a, -85 + a, 256 + b - a, -50 + b + a);
		    c.setColor (Color.orange);
		    c.drawLine (310 - a, -75 + a, 256 + b - a, -50 + b + a);
		    c.setColor (Color.yellow);
		    c.drawLine (300 - a, -65 + a, 256 + b - a, -50 + b + a);

		}
		
	    //  draws the meteor and it's orbiting parts
	    c.setColor (meteor);
	    c.fillOval (250 - a, -60 + a, 50, 50);
	    c.fillRoundRect (260 - a, -80 + a, 15, 15, 20, 20);
	    c.fillRect (310 - a, -40 + a, 10, 10);
	    
	    //draws the dark spots and indents on the meteor
	    c.setColor (meteorSpots);
	    c.fillOval (270 - a, -50 + a, 20, 10);
	    c.fillOval (260 - a, -30 + a, 10, 15);
	    c.fillOval (257 - a, -46 + a, 10, 10);
	    c.fillOval (275 - a, -30 + a, 17, 10);

	    try
	    {
		Thread.sleep (85);
	    }
	    catch (Exception e)
	    {
	    }

	    // eraser 
	    c.setColor (sky);
	    c.fillArc(250-a,-100+a,180,80,90,180);
	}
    }


    public FallingMeteor (Console con)
    {
	c = con;
    }


    public void run ()
    {
	meteor ();
    }
}


