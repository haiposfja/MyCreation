/* Ryken Santillan
   Ms. Basaraba
   3/26/2020
   Description: This class draws the background for MyCreation (NO Animations)
*/
import java.awt.*;
import hsa.Console;
import java.lang.*;

public class Background
{
    private Console c;

    // local color for the midnight sky: midnight purple
    Color sky = new Color (55, 43, 64);

    // local color for the moon: light gray
    Color moon = new Color (213, 217, 222);

    // local color for dirt: dark brown
    Color dirt = new Color (54, 45, 36);

    // local color for the grass: Light green
    Color grass = new Color (83, 158, 79);

    // local color for the cabin: light brown
    Color cabin = new Color (107, 88, 59);

    // local color for the cabin roof: brick red
    Color roof = new Color (150, 87, 87);

    // local color for the cabin door: cream
    Color cabinDoor = new Color (255, 253, 208);

    // local color for the mountain bases: mountain brown
    Color mountainBase = new Color (151, 124, 83);

    // local color for the mountain snow caps: light aqua
    Color snowCap = new Color (177, 246, 250);

    // local color for the cabin window frame Dark Grey
    Color windowFrame = new Color (51, 51, 51);

    // local color for the cabin window glass: light blue
    Color windows = new Color (71, 185, 255);

    // local color for the rocketship's body: rocket metallic
    Color rocketshipBody = new Color (138, 127, 128);

    // local color for the rocket's window: light sky blue
    Color windowR = new Color (54, 211, 235);

    // local color for the window frame of the rocket: Whitish gray
    Color windowFrameR = new Color (242, 242, 242);

    // local color for the nose cone and the fins of the rocket ship: darker red
    Color noseFins = new Color (255, 20, 0);

    // local color for the motor exhaust: lighter gray
    Color shipExhaust = new Color (184, 184, 184);

    // local color for rocketship platform : gainsboro
    Color platform = new Color (220, 220, 220);

    // local color for tree bark: resene ironbark
    Color bark = new Color (109, 77, 44);

    // local color for alpine tree leaves: lime green
    Color alpineLeaves = new Color (87, 255, 71);

    // local color for the firework holder: tan
    Color fireworkHolder = new Color (181, 101, 29);

    //local color for the person's skin: peachpuff
    Color skin = new Color (255, 218, 185);

    public void draw ()
    {
	// for loop for the sky, and the ground
	for (int a = 0 ; a < 640 ; a++)
	{
	    c.setColor (sky);
	    c.drawRect (0, 0, a, 400);
	    c.setColor (grass);
	    c.drawRect (0, 400, a, 20);
	    c.setColor (dirt);
	    c.drawRect (0, 420, a, 80);
	}

	// for loop for the moon
	for (int b = 0 ; b < 40 ; b++)
	{
	    c.setColor (moon);
	    c.drawOval (500 + b, 50 + b, 75 - 2 * b, 75 - 2 * b);
	}

	// for loop for the right mountain
	for (int d = 520 ; d < 650 ; d++)
	{
	    c.setColor (mountainBase);
	    c.drawLine (585, 200, d, 400);
	}

	// for loop for the middle mountain
	for (int e = 450 ; e < 580 ; e++)
	{
	    c.setColor (mountainBase);
	    c.drawLine (515, 240, e, 400);
	}

	//  for loop for the left mountain
	for (int f = 410 ; f < 520 ; f++)
	{
	    c.setColor (mountainBase);
	    c.drawLine (465, 180, f, 400);

	}

	// for loop for the snow caps
	for (int g = 0 ; g < 20 ; g++)
	{
	    c.setColor (snowCap);
	    c.drawLine (585, 200, 575 + g, 230);
	    c.drawLine (515, 240, 505 + g, 265);
	    c.drawLine (465, 180, 455 + g, 220);

	}

	// for loop for the cabin

	for (int h = 0 ; h < 90 ; h++)

	    {
		c.setColor (cabin);
		c.drawRect (420, 330, h, 70);
		c.setColor (cabinDoor);
		c.drawRect (455, 368, h - 70, 30);

	    }

	//for loop for the cabin roof
	for (int i = 400 ; i < 530 ; i++)
	{
	    c.setColor (roof);
	    c.drawLine (465, 300, i, 330);
	}

	// for loop for the cabin windows and doorknob

	for (int j = 0 ; j < 20 ; j++)

	    {
		c.setColor (windowFrame);
		c.drawRect (430, 345, j, j);
		c.drawRect (480, 345, j, j);
		c.setColor (windows);
		c.drawRect (431, 346, j - 12, j - 12);
		c.drawRect (441, 346, j - 12, j - 12);
		c.drawRect (431, 356, j - 12, j - 12);
		c.drawRect (441, 356, j - 12, j - 12);
		c.drawRect (481, 346, j - 12, j - 12);
		c.drawRect (491, 346, j - 12, j - 12);
		c.drawRect (481, 356, j - 12, j - 12);
		c.drawRect (491, 356, j - 12, j - 12);
	    }


	// for loop for the tree base
	for (int k = 0 ; k < 16 ; k++)
	{
	    c.setColor (bark);
	  //  c.drawRect (40, 360, k, 40);
	    c.drawRect (375, 360, k, 40);
	    c.drawRect (560, 360, k, 40);
	    c.drawRect (610, 360, k, 40);
	}

	// for loop for the alpine tree leaves
	for (int l = 0 ; l < 40 ; l++)
	{

	    c.setColor (alpineLeaves);
	  //  c.drawLine (48, 290, 29 + l, 360);
	    c.drawLine (383, 290, 364 + l, 360);
	    c.drawLine (568, 290, 549 + l, 360);
	    c.drawLine (618, 290, 599 + l, 360);

	}

	// for loop for the firework's holder
	for (int m = 0 ; m < 70 ; m++)
	{

	    c.setColor (fireworkHolder);
	    c.drawRect (248, 370, m, 30);
	    c.setColor (sky);
	    c.drawRect (256, 375, m - 16, 20);
	    c.setColor (Color.black);
	    c.drawRect (260, 375, m - 64, 20);
	    c.drawRect (280, 375, m - 64, 20);
	    c.drawRect (300, 375, m - 64, 20);

	}

	// for loop for the rocketship's platform
	for (int n = 0 ; n < 20 ; n++)
	{
	    c.setColor (platform);
	    c.drawLine (80 + n, 400 - n, 210 - n, 400 - n);
	}
	
	// name
	c.setColor(Color.black);
	c.drawString("RYKEN", 125, 395 );

	// STATIONARY ROCKETSHIP

	c.setColor (rocketshipBody);
	c.fillRect (122, 270, 46, 100);
	c.fillRect (102, 290, 20, 30);
	c.fillRect (168, 290, 20, 30);
	c.setColor (Color.black);
	c.drawRect (122, 270, 46, 100);
	c.setColor (windowFrameR);
	c.fillOval (135, 295, 20, 20);
	c.setColor (windowR);
	c.fillOval (136, 296, 18, 18);
	c.setColor (noseFins);

	// for loop for the nose cone's spike
	for (int o = 0 ; o < 30 ; o++)
	{
	    c.drawLine (145, 230, 130 + o, 250);
	}

	// main body
	c.fillArc (122, 240, 46, 60, 0, 180);
	c.fillArc (97, 350, 50, 60, 90, 90);
	c.fillArc (144, 350, 50, 60, 0, 90);

	// propeller jets
	c.fillArc (103, 275, 19, 30, 0, 180);
	c.fillArc (169, 275, 19, 30, 0, 180);

	// mini erase to make arcs more curved
	c.setColor (sky);
	c.fillRect (116, 370, 58, 10);

	//draws the ship's three exhausts
	c.setColor (shipExhaust);
	c.fillRoundRect (105, 320, 14, 3, 10, 10);
	c.fillRoundRect (106, 323, 12, 3, 10, 10);
	c.fillRoundRect (171, 320, 14, 3, 10, 10);
	c.fillRoundRect (172, 323, 12, 3, 10, 10);
	c.fillRoundRect (130, 370, 30, 4, 10, 10);
	c.fillRoundRect (133, 374, 24, 4, 10, 10);

	// for loop for the scientist
	for (int p = 0 ; p < 15 ; p++)
	{
	    c.setColor(Color.gray);
	    c.drawRect(333,381,p-9 ,19); 
	    c.drawRect(341,381,p-9 ,19);         //pants
	    c.setColor (Color.blue);
	    c.drawRect(333,365,p-2,15); //shirt
	    c.drawRect(346,365,p-5,5); //hands
	    c.drawRect(323,365,p-5,5);
	    c.setColor (skin);
	    c.drawOval (332 + p, 350 + p, 15 - 2 * p, 15 - 2 * p); //head
	 
	   
	}
     
	
    }


    // Background class
    public Background(Console con)
    {
	c = con;
	draw ();
    }
}


