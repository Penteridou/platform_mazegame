import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld9 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld9 extends World
{

    private static Timer  levelTime = new Timer(); // current level timer
    
    /**
     * Constructor for objects of class MyWorld9.
     * 
     */
     public MyWorld9(MyHero mh, Timer t)
    {    
       super(1000, 1140, 1); 
        prepare(mh, t);
    }
    
    
    private void prepare(MyHero mh, Timer t)
    {
        Goal goal = new Goal();
        addObject(goal,410,50); //490,520
        addObject(mh,160, 50);
        addObject(t,810,50);    // general game timer
       
    }
    
    public static int calculateLevelScore(){
         int score =  -levelTime.getTime()+900;
         return score;
    }  
        
    
}
