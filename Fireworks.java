/* Ryken Santillan
   Ms. Basaraba
   3/27/2020
   This class creates the fireworks (Animated Upwards)
*/

import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Fireworks extends Thread
{
    private Console c;           // The output console

    public void fireworks ()
    {


	// local color for the firework body: Hot pink
	Color firework = new Color (255, 105, 180);
       
	// local color for the sky: midnight purple
	Color sky = new Color (55, 43, 64);

	// for loop to animate the fireworks
	for (int a = 0 ; a < 200 ; a++)
	{
	    c.setColor (firework);
	    c.fillRect (260, 350 - a, 6, 20); // draws the fireworks body
	    c.fillRect (280, 350 - a, 6, 20);
	    c.fillRect (300, 350 - a, 6, 20);
	    
	    // for loop for the Firework's Nose
	    for (int b = 0 ; b < 14 ; b++)
	    {
		c.drawLine (263, 335 - a, 256 + b, 350 - a);
		c.drawLine (283, 335 - a, 276 + b, 350 - a);
		c.drawLine (303, 335 - a, 296 + b, 350 - a);
	    }
	    
	    //Firework Design
	    c.setColor (Color.white);
	     
	    //rectangles for the first firework
	    c.fillRoundRect (259, 355 - a, 8, 2, 5, 5);
	    c.fillRoundRect (259, 360 - a, 8, 2, 5, 5);
	    c.fillRoundRect (259, 365 - a, 8, 2, 5, 5);

	    //rectangles for the second firework
	    c.fillRoundRect (279, 355 - a, 8, 2, 5, 5);
	    c.fillRoundRect (279, 360 - a, 8, 2, 5, 5);
	    c.fillRoundRect (279, 365 - a, 8, 2, 5, 5);

	    //rectangles for the third firework
	    c.fillRoundRect (299, 355 - a, 8, 2, 5, 5);
	    c.fillRoundRect (299, 360 - a, 8, 2, 5, 5);
	    c.fillRoundRect (299, 365 - a, 8, 2, 5, 5);
	    
	    //white arc for all three fireworks 
	    c.fillArc (258, 345 - a, 10, 10, 0, 180);
	    c.fillArc (278, 345 - a, 10, 10, 0, 180);
	    c.fillArc (298, 345 - a, 10, 10, 0, 180);
	    
	    try
	    {
		Thread.sleep (10);
	    }
	    catch (Exception e)
	    {
	    }
	    
	    // Eraser
	    c.setColor (sky);
	    c.fillRect(250, 335-a ,70, 35); 
	}
    }


    public Fireworks (Console con)
    {
	c = con;

    }

    public void run ()
    {
	fireworks ();
    }
} 
