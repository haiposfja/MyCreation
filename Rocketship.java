/* Name: Ryken Santillan
   Teacher: Ms. Basaraba
   Date: 3/29/2020
   Description: This class contains a rocketship's animation
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Rocketship extends Thread
{
    private Console c;           // The output console

    public void rocketship ()
    {


	// local color for rocketship body: rocket metallic
	Color rocketshipBody = new Color (138, 127, 128);
	
	// local color for the window of the rocket: light sky blue
	Color window = new Color (54, 211, 235);
	
	// local color for the window frame of the rocket: whitish gray
	Color windowFrame = new Color (242, 242, 242);
	
	// local color for the nose cone and the fins of the rocket ship: darker red
	Color noseFins = new Color (255, 20, 0);
	
	// local color for the motor exhaust: light gray
	Color shipExhaust = new Color (184, 184, 184);
	
	// local color for the sky: midnight purple
	Color sky = new Color (55, 43, 64);



	// for loop for the rocketship's movement
	for (int a = 0 ; a < 160 ; a++)
	{
	    //rocketship's body and components
	    c.setColor (rocketshipBody);
	    c.fillRect (122, 270 - a, 46, 100);
	    c.fillRect (102, 290 - a, 20, 30);
	    c.fillRect (168, 290 - a, 20, 30);
	    c.setColor (Color.black);
	    c.drawRect (122, 270 - a, 46, 100);
	    c.setColor (windowFrame);
	    c.fillOval (135, 295 - a, 20, 20);
	    c.setColor (window);
	    c.fillOval (136, 296 - a, 18, 18);
	    
	    // for loop for the nose cone's spike
	    c.setColor (noseFins);
	    for (int b = 0 ; b < 30 ; b++)
	    {
		c.drawLine (145, 230 - a, 130 + b, 250 - a);
	    }

	    // main body arcs
	    c.fillArc (122, 240 - a, 46, 60, 0, 180); // nose cone
	    c.fillArc (97, 350 - a, 50, 60, 90, 90); //fins
	    c.fillArc (144, 350 - a, 50, 60, 0, 90);
	    
	    // propeller jets nose cone
	    c.fillArc (103, 275 - a, 19, 30, 0, 180);
	    c.fillArc (169, 275 - a, 19, 30, 0, 180);

	    // mini erase to make the arcs more curved
	    c.setColor (sky);
	    c.fillRect (116, 370 - a, 58, 10);

	    c.setColor (shipExhaust);
	    c.fillRoundRect (105, 320 - a, 14, 3, 10, 10);
	    c.fillRoundRect (106, 323 - a, 12, 3, 10, 10);
	    c.fillRoundRect (171, 320 - a, 14, 3, 10, 10);
	    c.fillRoundRect (172, 323 - a, 12, 3, 10, 10);
	    c.fillRoundRect (130, 370 - a, 30, 4, 10, 10);
	    c.fillRoundRect (133, 374 - a, 24, 4, 10, 10);

	    // for loop for the propeller flames
	    for (int d = 0 ; d < 10 ; d++)
	    {
		c.setColor (Color.red);
		c.drawLine (112, 345 - a, 107 + d, 326 - a);
		c.drawLine (178, 345 - a, 173 + d, 326 - a);
		c.setColor (Color.orange);
		c.drawLine (112, 335 - a, 107 + d, 326 - a);
		c.drawLine (178, 335 - a, 173 + d, 326 - a);
		c.setColor (Color.yellow);
		c.drawLine (112, 326 - a, 107 + d, 326 - a);
		c.drawLine (178, 326 - a, 173 + d, 326 - a);
	    }
	    
	    try
	    {
		Thread.sleep (50);
	    }
	    catch (Exception e)
	    {
	    }
	    
	    // eraser
	    c.setColor (sky);
	    c.fillArc(90,230-a,110,300, 0, 180);
	
	}
    }


    public Rocketship (Console con)
    {
	c = con;
    }


    public void run ()
    {
	rocketship ();
    }
} 



