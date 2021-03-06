import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld8 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld8 extends World
{

    private static Timer  levelTime = new Timer(); // current level timer
    
    /**
     * Constructor for objects of class MyWorld8.
     * 
     */
   public MyWorld8(MyHero mh, Timer t)
    {    
       super(1000, 1140, 1); 
        prepare(mh, t);
    }
    
    
    private void prepare(MyHero mh, Timer t)
    {
        Goal goal = new Goal();
        addObject(goal,410,50); //435, 872
        addObject(mh,160, 50);
        addObject(t,810,50);    // general game timer
       // addObject(levelTime,610,50);
    }
    
      public static int calculateLevelScore(){
         int score =  -levelTime.getTime()+800;
         return score;
    }
        
    
}
