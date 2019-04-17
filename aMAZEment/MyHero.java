import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyHero here.
 * 
 * @author (Penteridou Nikolina) 
 * @version (05/2019)
 */
public class MyHero extends SmoothMover
{
   
    private static final int SPEED = 3;
    private static final int RADIO = 13;
    private int speedX = SPEED;
    private int speedY = SPEED;
    
    
    
    public void act() 
    {
     handleKeyPresses();
     //boundedMove();
     checkCrash();
       
           
    }   
        
    /**
     * Check whether the ball is crashing on the wall.
     */
    public void checkCrash()
    {
      if ( isPath(ballColor(RADIO,RADIO))||isPath(ballColor(RADIO,-RADIO))||isPath(ballColor(-RADIO,-RADIO))||isPath(ballColor(-RADIO,RADIO))||atWorldEdge())
        {
        
           MyWorld mw = (MyWorld) getWorld(); 
            mw.addObject(new WallCrash(), getX(), getY());
            mw.removeObject(this);
           // mw.gameOver();
        }
    
    
    }
    
    /**
     * Test if we are close to one of the edges of the world. Return true if we are.
     */
    public boolean atWorldEdge()
    {
        if(getX() < 15 || getX() > getWorld().getWidth() - 2)
            return true;
        if(getY() < 15 || getY() > getWorld().getHeight() - 2)
            return true;
        else
            return false;
    }
    
    /**
    * Check if walking on the path (the path is white)
    */
   private boolean isPath (Color col)
    {
        return col.getRed() != 255;   // path colour is white (no red at all)
    }
    
    //check the background color of ball's location
     private Color ballColor(int x , int y)
    {
         return (getWorld().getBackground().getColorAt (this.getX()+x, this.getY()+y) );
    }
    
    /**
     * Moves handling
     */
     public void handleKeyPresses()
    {
        handleArrowKey("left", -SPEED, 0);
        handleArrowKey("right", SPEED, 0);
        handleArrowKey("up", 0, -SPEED);
        handleArrowKey("down", 0, SPEED);
    }
    
    /**
     * Arrow keys handling
     */
    private void handleArrowKey(String k, int sX, int sY) {
        if( Greenfoot.isKeyDown(k) ) {
            if ( Greenfoot.isKeyDown("left")|| Greenfoot.isKeyDown("down"))
            turn(-4);
        if ( Greenfoot.isKeyDown("right")|| Greenfoot.isKeyDown("up"))
            turn(4);
            speedX = sX;
            speedY = sY;
        }
        setLocation(getX()+speedX, getY()+speedY);
        speedX = 0;
        speedY = 0;
    }
    
    /**
     * Goal touched
     */
    
    public void goalCompleted(){
    //isTouching();
    
    }
    
    
    
    /**
     * The game over screen
     */
    
   //public void gameOver(){}
    
    
    
    
}
