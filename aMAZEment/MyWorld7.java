import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld7 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld7 extends World
{

    /**
     * Constructor for objects of class MyWorld7.
     * 
     */
    public MyWorld7(MyHero mh)
    {    
       super(1000, 1140, 1); 
        prepare(mh);
    }
    
    
    private void prepare(MyHero mh)
    {
        Goal goal = new Goal();
        addObject(goal,410,50); //902, 816
        addObject(mh,160, 50);
    }
}
