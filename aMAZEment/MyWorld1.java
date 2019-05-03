import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * A background with a path drawn on it. Two different backgrounds are available.
 * 
 * @author Michael Kölling
 * @version 1.0
 */
public class MyWorld1  extends World
{
    
    static Timer  levelTime1 = new Timer(10); // current level timer

    /**
     * Create the field.
     */
    public MyWorld1()
    {    
        // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
        super(1000, 1140, 1);
        prepare();
        
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
        addObject(goal,210,50); //810, 200
        addObject(mh.getCurrentTime(),810,50); // general game timer
        //addObject(levelTime1,610,50);

    }
    
    public static int calculateLevelScore(){
         int score =  levelTime1.getTime();//+100;
         return -score;
    }
    
}
