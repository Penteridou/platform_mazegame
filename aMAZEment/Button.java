import greenfoot.*;  
 
public class Button extends Actor
{
    /**
     * Act - do whatever the Button wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        //Greenfoot.stop();
        if (Greenfoot.mousePressed(this))
        {
                      Greenfoot.setWorld (new MyWorld1 ());
        }
    }
}