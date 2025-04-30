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
        addObject(dolphin, 350, 350);
        
        Fish fish = new Fish();
        addObject(fish, 350, 0);
    }
}
