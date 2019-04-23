import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{

    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    public MyWorld2(MyHero mh)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 1140, 1); 
        prepare(mh);
    }
    
    
    private void prepare(MyHero mh)
    {
        Goal goal = new Goal();
        addObject(goal,210,50); //508, 515
        addObject(mh,160, 50);
    }
}
