import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * The Dolphin, our hero.
 * 
 * @author Eswarathasan
 * @version April 2025
 */
public class Dolphin extends Actor
{
    GreenfootSound dolphinSound = new GreenfootSound(
    
    
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
        eat();
    }
    
    public void eat()
    /**
     * eat the fish and spawn a new fish if the fish is eaten.
     */
    {
        if(isTouching(Fish.class))
        {
            removeTouching(Fish.class);
            MyWorld world = (MyWorld) getWorld();
            world.createFish();
            world.increaseScore();
        }
    }
    
}
