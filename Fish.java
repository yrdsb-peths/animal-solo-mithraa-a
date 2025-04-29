import greenfoot.*;  
/**
 * Fish food for the Dolphin hero.
 * 
 * @author Eswarathasan 
 * @version April 2025
 */
public class Fish extends Actor
{
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("right"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("left"))
        {
            move(2);
        }
    }
}

