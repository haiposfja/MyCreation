/*
   Name: Ryken Santillan
   Teacher: Ms. Basaraba
   Date: 1/2/2020
   Description: This program contains the animated parts from the aftermath
		of the rocketship and meteor collision explosion
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Aftermath implements Runnable
{
    private Console c;           // The output console

    public void aftermath ()
    {

	// local color for rocketship body: rocket metallic
	Color rocketshipBody = new Color (138, 127, 128);

	// local color for the nose cone and the fins of the rocket ship: Darker Red
	Color noseFins = new Color (255, 20, 0);

	// local color for the sky: midnight purple
	Color sky = new Color (55, 43, 64);

	for (int a = 0 ; a < 220 ; a++)
	{
	    //eraser
	    c.setColor (sky);
	    c.fillRect (0, 49 + a, 250, 133);

	    //array of local int variables of x coordinates to make the demented rocket piece
	    int rocketx[] = {50 - a, 90 - a, 120 - a, 103 - a, 70 - a};
	    //array of local int variables of y coordinates to make the demented rocket piece
	    int rockety[] = {140 + a, 140 + a, 120 + a, 160 + a, 180 + a};
	    
	    
	    //array of local int variables of x coordinates to make the fire on the flat piece
	    int fireX[] = {115, 95, 120, 105, 135, 120, 140, 147, 155, 175, 160, 196, 180, 205, 185};
	    //array of local int variables of x coordinates to make the fire on the flat piece
	    int fireX2[] = {105, 85, 110, 95, 125, 110, 130, 137, 145, 165, 150, 185, 170, 195, 175};
	    //array of local int variables of y coordinates to make the fire on the flat piece
	    int fireY[] = {170+a, 150+a, 150+a, 130+a, 135+a, 110+a, 120+a, 100+a, 120+a, 110+a, 135+a, 130+a, 150+a, 150+a, 170+a};
	    

	    c.setColor (Color.red);
	    c.fillPolygon (fireX, fireY, 15); // makes the red fire portion
	    c.setColor (Color.orange);
	    c.fillPolygon (fireX2, fireY, 15); // makes the orange fire portion

	    // for loop for the smaller fires
	    for (int d = 0 ; d < 10 ; d++)
	    {
		c.setColor (Color.red);
		// red fire for demented rocket
		c.drawLine (120 - a, 100 + a, (100 - d * 2) - a, (160 - d * 2) + a);
		c.drawLine (160 - a, 110 + a, (100 - d * 2) - a, (160 - d * 2) + a);
		// red fire for falling fin
		c.drawLine (225, 130 + a, 243 - (d * 2), (160 - d) + a);


		c.setColor (Color.orange);
		// orange fire for demented rocket
		c.drawLine (115 - a, 110 + a, (100 - d * 2) - a, (160 - d * 2) + a); // fires for rocket
		c.drawLine (150 - a, 115 + a, (100 - d * 2) - a, (160 - d * 2) + a);
		// orange fire for falling fin
		c.drawLine (225, 135 + a, 243 - d * 2, (160 - d) + a);

		c.setColor (Color.yellow);
		// yellow fire for demented rocket
		c.drawLine (110 - a, 120 + a, (100 - d * 2) - a, (160 - d * 2) + a); // fires for rocket
		c.drawLine (140 - a, 120 + a, (100 - d * 2) - a, (160 - d * 2) + a);
		// yellow fire for falling fin
		c.drawLine (225, 140 + a, 243 - (d * 2), (160 - d) + a);

	    }


	    //destroyed cone nose right piece
	    c.setColor (noseFins);
	    c.fillArc (200, 150 + a, 50, 60, -20, 100);
	    //destroyed rocketship body
	    c.setColor (rocketshipBody);
	    c.fillRoundRect (70, 170 + a, 150, 20, 20, 20); // ground implodes by impact
	    c.fillPolygon (rocketx, rockety, 5);  // demented rocket piece



	    try
	    {
		Thread.sleep (30);
	    }
	    catch (Exception e)
	    {
	    }



	}

    }


    public Aftermath (Console con)
    {
	c = con;
    }


    public void run ()
    {
	aftermath ();
    }
} // Aftermath class
