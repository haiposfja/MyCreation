/* Name: Ryken Santillan
   Teacher: Ms. Basaraba
   Date: 3/28/2020
   Description: This program shows the firework's explosion (Overloaded Thread)
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class FireworkExplosion extends Thread
{
    private Console c;           // The output console
    private Color sparks;     // private color for the objects
    private int delay;  // private int for delaying animation

    public void explosion ()
    {
	// local color variable for the sky
	Color sky = new Color (55, 43, 64);

	// for loop for animating the explosion
	for (int a = 0 ; a < 60 ; a++)
	{


	    c.setColor (sparks);
	    
	    // drawing the top row of the explosion
	    c.drawLine (260, 120, 260-a, 120-a);
	    c.fillStar(255-a, 115-a, 10, 10);
	    c.drawLine (290, 120, 290, 120-a);
	    c.fillStar(285, 115-a, 10, 10);
	    c.drawLine (320, 120, 320+a, 120-a);
	    c.fillStar(315+a, 115-a, 10, 10);
	    c.drawOval (252 + a, 104 + a, 75 - 2 * a, 75 - 2 * a);

	    // drawing the bottom row of the explosion
	    c.drawLine (260, 160, 260-a, 160+a);
	    c.fillStar(255-a, 155+a, 10, 10);
	    c.drawLine (290, 160, 290, 160+a);
	    c.fillStar(285, 155+a, 10, 10);
	    c.drawLine (320, 160, 320+a, 160+a);
	    c.fillStar(315+a, 155+a, 10, 10);
	    
	    //drawing the middle row of the explosion
	    c.drawLine (260, 140, 260-a, 140); 
	    c.fillRoundRect(255-a, 135, 10, 10, 20, 20);
	    c.drawLine (320, 140, 320+a, 140);
	    c.fillRoundRect(315+a, 135, 10, 10, 20, 20);
	    

	    try
	    {
		sleep (delay);
	    }
	    catch (Exception e)
	    {
	    }
	    
	    //eraser 
	    c.setColor (sky);
	    c.fillRoundRect (210 - a, 80 - a, 155 + a * 2, 200 + a, 80 * a, 80 * a);
	}

    }



    // Firework with a color parameter
    public FireworkExplosion (Console con, Color b)
    {
	c = con;
	sparks = b;
    }


    // Firework with a color parameter and a delay time
    public FireworkExplosion (Console con, Color b, int d)
    {
	c = con;
	sparks = b;
	delay = d;

    }


    public void run ()
    {
	explosion ();
    }
} 


