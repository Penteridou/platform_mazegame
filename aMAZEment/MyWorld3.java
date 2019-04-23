import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld3 extends World
{

    /**
     * Constructor for objects of class MyWorld3.
     * 
     */
    public MyWorld3(MyHero mh)
    {    
       super(1000, 1140, 1); 
        prepare(mh);
    }
    
    
    private void prepare(MyHero mh)
    {
        Goal goal = new Goal();
        addObject(goal,210,50); //144, 723
        addObject(mh,160, 50);
    }
}
