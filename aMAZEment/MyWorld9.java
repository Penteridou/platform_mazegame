import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld9 extends World
{

    /**
     * Constructor for objects of class MyWorld9.
     * 
     */
     public MyWorld9(MyHero mh)
    {    
       super(1000, 1140, 1); 
        prepare(mh);
    }
    
    
    private void prepare(MyHero mh)
    {
        Goal goal = new Goal();
        addObject(goal,210,50); //???
        addObject(mh,160, 50);
    }
}
