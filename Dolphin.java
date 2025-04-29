import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Dolphin, our hero.
 * 
 * @author Eswarathasan
 * @version April 2025
 */
public class Dolphin extends Actor
{
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.isKeyDown("left"))
        {
            move(-1);
        }
        else if(Greenfoot.isKeyDown("right"))
        {
            move(1);
        }
        
        // Remove fish if dolphin eats it 
        removeTouching(Fish.class);
    }
}
