import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)


import java.util.Calendar;

/**
 * The ScoreBoard is used to display results on the screen. It can display some
 * text and several numbers.
 * 
 * @author M Kolling
 * @version 1.0
 */
public class ScoreBoard extends Actor
{
    public static final float FONT_SIZE = 48.0f;
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;
    
    /**
     * Create a score board with dummy result for testing.
     */
    public ScoreBoard()
    {
        //this();
    }

    /**
     * Create a score board for the final result.
     */
    public ScoreBoard(int score)
    {
        makeImage("Game Over", "Score: ", score);
    }
    //mine
    public ScoreBoard(int score, boolean last)
    {
        makeImage("Thanks for playing!!!", "Score: ", score);
    }
    
    public ScoreBoard(String msg){
       
         makeImage("rules" );
    
    }

 
    /**
     * Make the score board image.
     */
    private void makeImage(String title, String prefix, int score)
    {
        GreenfootImage image = new GreenfootImage(WIDTH, HEIGHT);

        image.setColor(new Color(255,255,255, 128));
        image.fillRect(10, 0, WIDTH, HEIGHT);
        image.setColor(new Color(0, 0, 0, 128));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(FONT_SIZE);
        image.setFont(font);
        image.setColor(Color.WHITE);
        image.drawString(title, 60, 80);
        image.drawString(prefix + score, 60, 140);
        image.drawString("Try again?", 60, 210);
        image.drawString("Press me", 50, 260);
        //image.scale(500, 500);
        setImage(image);
    }
    
    //homescreen image with the rules
    private void makeImage(String title)
    {
        GreenfootImage image = new GreenfootImage(500, 400);
        
        image.setColor(new Color(255,255,255, 100));
        image.fillRect(0, 0, WIDTH, HEIGHT);
        image.setColor(new Color(0, 0, 0, 128));
        image.fillRect(5, 5, WIDTH-10, HEIGHT-10);
        Font font = image.getFont();
        font = font.deriveFont(18.0f);
        image.setFont(font);
        image.setColor(Color.YELLOW);
        
        image.drawString("Welcome to the aMAZEment world!!!", 40, 40);
        image.drawString("How to play:" , 150, 80);
        image.drawString("Reach and touch the golden ball by  " , 20, 120);
        image.drawString("moving your hero ball through the arrows. " , 20, 150);
        image.drawString("Be carefull!! Do not touch any maze wall " , 20, 180);
        image.drawString("or your hero ball will instantly explode!" , 20, 210);
        image.drawString("Ready to play? Press the smiley face button:) ", 20, 240);
        image.drawString("                Press me ", 20, 270);

        image.scale(1000, 800);
        setImage(image);
    }
}
