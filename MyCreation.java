/*
   Name: Ryken Santillan
   Teacher: Ms. Basaraba
   Date: 3/26/2020
   Description: This program emulates the celebration of the launch
		of the new rocketship from NASA. However, litte did
		they expect that a meteor would interrupt the rocket's
		course. What was once a happy moment, is now a fiery
		mess.
*/

// The "MyCreation" class.
import java.awt.*;
import hsa.Console;


public class MyCreation
{
    Console c;           // The output console

    // adds Background to MyCreation
    public void background ()
    {
	// no need for start() due to no animation
	Background a = new Background (c);
    }

    // adds the Fireworks thread to MyCreation
    public void fireworks ()
    {
	Fireworks b = new Fireworks (c);
	b.start (); //starts the thread
	try
	{
	    b.join ();  // joins the thread with explosion()
	} 
	catch (InterruptedException e)
	{
	}
    }

    // adds the FireworkExplosion thread to MyCreation
    public void explosion ()
    {
	// neon yellow 
	Color firework1 = new Color (204, 255, 0);
	// neon pink
	Color firework2 = new Color (255, 110, 199);
	// neon blue
	Color firework3 = new Color (36, 248, 229);

	//Overloaded Thread 3 instances 
	
	FireworkExplosion d1 = new FireworkExplosion (c, firework1);
	d1.start (); //starts the thread: fast and yellow

	FireworkExplosion d2 = new FireworkExplosion (c, firework2, 30);
	d2.start (); // starts the thread: slower and neon pink

	FireworkExplosion d3 = new FireworkExplosion (c, firework3, 40);
	d3.start (); // starts the thread: slowest and neon blue


	try
	{
	    d3.join (); // joins last instance of explosion with rocketship();
	}
	catch (InterruptedException e)
	{
	}

    }

    // adds the Rcoketship thread to MyCreation
    public void rocketship ()
    {
	Rocketship g = new Rocketship (c);
	g.start (); // starts the thread


    }

    // adds the FallingMeteor thread to MyCreation
    public void meteor ()
    {
	FallingMeteor h = new FallingMeteor (c);
	h.start (); // starts the thread
	try
	{
	    h.join (); // joins the thread with collision();
	}
	catch (InterruptedException e)
	{
	}
    }

    // adds the Collision thread to MyCreation
    public void collision ()
    {
	Collision i = new Collision (c);
	i.start (); // starts the thread
	try
	{
	    i.join (); // joins thread with aftermath();
	}
	catch (InterruptedException e)
	{
	}
    }

    // adds the Aftermath thread to MyCreation
    public void aftermath ()
    {
	Aftermath j = new Aftermath (c);
	j.run (); // starts the thread implements Runnable
    }



    //creates a new window and gives window a title
    public MyCreation ()
    {
	c = new Console ("Uneventful Celebration of a Rocketship Launch");
    }


    public static void main (String[] args)
    {
	MyCreation z = new MyCreation ();

	z.background ();
	z.fireworks ();
	z.explosion ();
	z.rocketship ();
	z.meteor ();
	z.collision ();
	z.aftermath ();
    }
} // MyCreation class


