import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld8 extends World
{

    /**
     * Constructor for objects of class MyWorld8.
     * 
     */
   public MyWorld8(MyHero mh)
    {    
       super(1000, 1140, 1); 
        prepare(mh);
    }
    
    
    private void prepare(MyHero mh)
    {
        Goal goal = new Goal();
        addObject(goal,410,50); //435, 872
        addObject(mh,160, 50);
    }
    
     
        
    
}
