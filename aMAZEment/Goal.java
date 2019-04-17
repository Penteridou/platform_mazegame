import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import javax.swing.JOptionPane;

/**
 * Write a description of class Goal here.
 * 
 */
public class Goal extends Others
{
    
    
    /**
     * Act - do whatever the Goal wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        goalAccomplished();
    }  
    
      public void goalAccomplished()
    {
        if ( canSee(MyHero.class) )
        {
            eat(MyHero.class);
            //Greenfoot.playSound("au.wav");
            //score 
            getWorld().removeObject(this);
            Greenfoot.setWorld(new MyWorld2());
            
        }
    }
    
    
    
    
}


 
    
    
