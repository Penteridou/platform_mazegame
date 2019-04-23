import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane; 
/**
 * Write a description of class MyHero here.
 * 
 * @author (Penteridou Nikolina) 
 * @version (05/2019)
 */
public class MyHero extends Others
{
   
    private static final int SPEED = 3;
    private static final int RADIO = 13;
    private int speedX = SPEED;
    private int speedY = SPEED;
    private int level = 1;
    
    
    
    public void act() 
    {
     handleKeyPresses();
     //boundedMove();
     goalAccomplished();  
     checkCrash();
           
    }   
    
    /**
     * Check whether the ball is crashing on the wall.
     */
    public void checkCrash()
    {
      if ( isPath(ballColor(RADIO,RADIO))||isPath(ballColor(RADIO,-RADIO))||isPath(ballColor(-RADIO,-RADIO))||isPath(ballColor(-RADIO,RADIO))||atWorldEdge())
        {
        
           World mw = (World) getWorld(); 
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
    
    public void levelUp(MyHero myH, int currentLevel){
        int lvl = currentLevel;
        switch (lvl){
          case 1 : 
            Greenfoot.setWorld(new MyWorld2(this)) ;
            level++;
            break;
          case 2 : 
            Greenfoot.setWorld(new MyWorld3(this)) ;
            level++;
            break;
          case 3 : 
            Greenfoot.setWorld(new MyWorld4(this)) ;
            level++;
            break;
          case 4 : 
            Greenfoot.setWorld(new MyWorld5(this)) ;
            level++;
            break;
          case 5 : 
            Greenfoot.setWorld(new MyWorld6(this)) ;
            level++;
            break;
          case 6 : 
            Greenfoot.setWorld(new MyWorld7(this)) ;
            level++;
            break;
          case 7 : 
            Greenfoot.setWorld(new MyWorld8(this)) ;
            level++;
            break;
          case 8 : 
            Greenfoot.setWorld(new MyWorld9(this)) ;
            level=1;
            break;
        }
    }
    
     public void goalAccomplished()
    {
        if ( canSee(Goal.class) )
        {
            eat(Goal.class);
           getWorld().removeObject(this);
           levelUp(this, level);
           //Greenfoot.stop();
         
        }
    }
    /**
     * The game over screen
     */
    
   //public void gameOver(){}
    public boolean canSee(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        return actor != null;        
    }

    
    /**
     * Try to eat an object of class 'clss'. This is only successful if there
     * is such an object where we currently are. Otherwise this method does
     * nothing.
     */
    public void eat(Class clss)
    {
        Actor actor = getOneObjectAtOffset(0, 0, clss);
        if(actor != null) {
            getWorld().removeObject(actor);
        }
    }  
    
    
  
}
