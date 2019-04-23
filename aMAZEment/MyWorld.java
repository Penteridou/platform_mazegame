import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A background with a path drawn on it. Two different backgrounds are available.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class MyWorld  extends World
{

    /**
     * Create the field.
     */
    public MyWorld()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(1000, 1140, 1);
        showMap1();
        prepare();
    }

    public void showMap1()
    {

    }


    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        MyHero mh = new MyHero();
        addObject( mh, 160, 50);
        Goal goal = new Goal();
        addObject(goal,810,50); //810, 200
    }
}
