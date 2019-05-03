import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{

    
    private static Timer  levelTime = new Timer(10); // current level timer
    
    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    public MyWorld2(MyHero mh, Timer t)
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super( 1000, 1140, 1); 
        prepare(mh, t);
    }
    
    
    private void prepare(MyHero mh, Timer t)
    {
        Goal goal = new Goal();
        addObject(goal,410,50); //508, 515
        addObject(mh,160, 50);
        addObject(t,810,50);  // general game timer
       // addObject(levelTime,610,50);
    }
    
    public static int calculateLevelScore(){
         int score =  levelTime.getTime();//+200;
         return -score;
    }
}
