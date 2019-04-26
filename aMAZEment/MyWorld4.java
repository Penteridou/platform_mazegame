import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld4 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld4 extends World
{

    /**
     * Constructor for objects of class MyWorld4.
     * 
     */
   
    public MyWorld4(MyHero mh)
    {    
       super(1000, 1140, 1); 
        prepare(mh);
    }
    
    
    private void prepare(MyHero mh)
    {
        Goal goal = new Goal();
        addObject(goal,410,50); //502, 523
        addObject(mh,190, 50);
    }
    
    
}
