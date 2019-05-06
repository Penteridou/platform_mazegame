/** This class creates a countdown timer object.
 * It displays like a digital timer clock.
 * The value to set the timer is given in seconds; however, is converted to approximate act cycles within the class.
 * All timers created from this class will start automatically unless using the 'Timer(int, boolean)' constructor with boolean set to 'false'.
 */
import greenfoot.*;
import greenfoot.Color;

 
public  class Timer extends Actor
{
    private int count; // the counter field
    private int initialCount; // the initial time given before event occurs
    private boolean running;
 
    public Timer()
    {
        this(0, true);
    }
 
    public Timer(int timeBeforeEvent)
    {
        this(-timeBeforeEvent, true);
    }
 
    public Timer(int timeBeforeEvent, boolean getsStarted) // int value given in seconds
    {
        setTimer(timeBeforeEvent);
        updateImage();
        running = getsStarted;
    }
 
    public Timer(int timeBeforeEvent, boolean getsStarted, String total) // int value given in seconds
    {
        setTimer(timeBeforeEvent);
        updateImage(" ");
        running = getsStarted;
    }
    
    
    
    public void setTimer(int timeBeforeEvent)
    {
        initialCount = 60 * timeBeforeEvent;
        count = initialCount;
    }
 
    //for current time
    private void updateImage()
    {
        String prefix = "Countdown  |  ";
        if (count >= 0) 
            prefix = "You lost :( ";
        int time = count * (int)Math.signum(count);
        time = time / 60;
        int secs = time % 60;
        time = (time - secs) / 60;
        int mins = time % 60;
        int hrs = (time - mins) / 24;
        String h = "00"+hrs;
        while (h.length() > 2) h = h.substring(1);
        String m = "00"+mins;
        while (m.length() > 2) m = m.substring(1);
        String s = "00" + secs;
        while (s.length() > 2) s = s.substring(1);
        String text = prefix + m + "m : " + s + "s";
        GreenfootImage textImage = new GreenfootImage(text, 25, Color.BLACK, new Color(0, 0, 0, 0));
        GreenfootImage image = new GreenfootImage(textImage.getWidth()+20, textImage.getHeight()+1);
        image.drawRect(0, 0, image.getWidth()-1, image.getHeight()-1);
        image.drawImage(textImage, (image.getWidth()-textImage.getWidth())/2, (image.getHeight()-textImage.getHeight())/2);
        setImage(image);
    }
    //for total time
    private void updateImage(String total)
    {
        String prefix = "total time    :  ";
        if (count >= 0) 
            prefix = "Total time    :  ";
        int time = count * (int)Math.signum(count);
        time = time / 60;
        int secs = time % 60;
        time = (time - secs) / 60;
        int mins = time % 60;
        int hrs = (time - mins) / 24;
        String h = "00"+hrs;
        while (h.length() > 2) h = h.substring(1);
        String m = "00"+mins;
        while (m.length() > 2) m = m.substring(1);
        String s = "00" + secs;
        while (s.length() > 2) s = s.substring(1);
        String text = prefix + m + "m : " + s + "s";
        GreenfootImage textImage = new GreenfootImage(text, 25, Color.WHITE, new Color(0, 0, 0, 0));
        GreenfootImage image = new GreenfootImage(textImage.getWidth()+20, textImage.getHeight()+1);
        image.drawRect(0, 0, image.getWidth()-1, image.getHeight()-1);
        image.drawImage(textImage, (image.getWidth()-textImage.getWidth())/2, (image.getHeight()-textImage.getHeight())/2);
        setImage(image);
    }
 
    public void act()
    {
        if (running)
        {    
            count++;
            if ((count + initialCount) % 60 == 0) {
                if (count >= 0)
                    updateImage(" ");
                else 
                    updateImage();
            }
        }
    }
 
    public int getTime()
    {
        return count / 60;
    }
 
    public void start()
    {
        running = true;
    }
 
    public void stop()
    {
        running = false;
    }
    
    
    
}
