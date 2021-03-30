/* Name: Ryken Santillan
   Teacher: Ms. Basaraba
   Date: 3/30/2020
   Description: This class contains the collision animation between the rocket
		and the meteor.
*/



import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Collision extends Thread
{
    private Console c;           // The output console

    public void collision ()
    {
    
	// local color for the sky: midnight purple
	Color sky = new Color (55, 43, 64);
	
	// local colors for the grey explosion
	Color inside = new Color (64, 64, 64); // dark gray
	Color middle = new Color (112, 112, 112); // medium gray
	Color outside = new Color (161, 161, 161); // light gray

	// for loop for the collision's expansion
	for (int a = 0 ; a < 60 ; a++)
	{
	    // draws the flying objects from the explosion (star, oval)
	    c.setColor (Color.gray);
	    c.fillStar (145, 110 + a * 2, 10, 10);
	    c.fillStar (145 + a, 77 + a * 2, 10, 10);
	    c.fillStar (160 + a, 93 + a * 2, 10, 10);
	    c.drawLine (125, 77, 125 + a*2, 77 + a*2);
	    c.drawLine (126, 77, 126 + a*2, 77 + a*2);
	    c.fillStar (125 - a, 97 + a * 2, 10, 10);
	    c.fillOval (125 + a * 2, 77, 10, 10);
	    c.fillOval (130 + a * 2, 87, 10, 10);
	    
	    //draws the oval like explosions
	    c.setColor (outside);
	    c.fillRoundRect (125 - a, 60 - a, 50 + a * 2, 50 + a * 2, 80 * a, 80 * a);
	    c.setColor (middle);
	    c.fillRoundRect (110 - a, 65 - a, 40 + a * 2, 40 + a * 2, 80 * a, 80 * a);
	    c.fillArc (115- a, 70 - 2, 30 + a * 2, 30 + a * 2, 0, 360);
	    c.setColor (inside);
	    c.fillRoundRect (140 - a, 70 - a, 30 + a * 2, 30 + a * 2, 80 * a, 80 * a);
	    c.setColor (Color.red);
	    c.fillRoundRect (145 - a, 75 - a, 20 + a * 2, 20 + a * 2, 80 * a, 80 * a);
	    c.setColor (Color.yellow);
	    c.fillRoundRect (150 - a, 80 - a, 10 + a * 2, 10 + a * 2, 80 * a, 80 * a);
	    c.setColor (Color.orange);
	    c.fillRoundRect (155 - a, 85 - a, a * 2, a * 2, 80 * a, 80 * a);

	    try
	    {
		Thread.sleep (60);
	    }
	    catch (Exception e)
	    {
	    }
	    
	    //eraser 
	    c.setColor (sky);
	    c.fillRoundRect (87 - a, 60 - a, 120 + a * 2, 200 + a, 80 * a, 80 * a);
	}
    }



    public Collision (Console con)
    {
	c = con;
    }


    public void run ()
    {
	collision ();
    }
}
