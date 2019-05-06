import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
    public static final int TIME = 10;
    
    private static Timer  levelTime = new Timer(TIME); // current level timer

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
        //addObject(t,810,50);  // general game timer
        addObject(levelTime,610,50);
    }
    
    /**
     * reset current level Timer
     */
    public static void resetLevelTimer(){
    levelTime=new Timer(TIME);
    }
    
     /**
     * check if current level Timer is 0 (time out)
     */
     public static boolean checkTimeOut(){
    if(levelTime.getTime()==0)
        return true;
    return false;
    }
    
   /**
     * Calculates current level score according to the current level time. 
     */
    public static int calculateLevelScore(){
         int score =  levelTime.getTime()*10;  //*10 level bonus
         return -score;
    }
}
