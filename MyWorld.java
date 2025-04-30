import greenfoot.*;

/**
 * The world our hero lives in.
 * 
 * @author Eswarathasan
 * @version April 2025
 */
public class MyWorld extends World 
{
    public MyWorld() 
    {
        super(600, 400, 1);
        
        Dolphin dolphin = new Dolphin();
        addObject(dolphin, 300, 200);
        
        createFish();
    }
    
    /** 
     * Create a new fish at a random location at the top of the screen 
     */
    public void createFish()
    {
        Fish fish = new Fish();
        int x = Greenfoot.getRandomNumber(500);
        int y = 0 ;
        addObject(fish, x, y);
    }
}
