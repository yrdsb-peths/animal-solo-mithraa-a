import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * TitleScreen.
 * 
 * @author Kalkie
 * @version May2025
 */
public class TitleScreen extends World
{
    Label titleLabel = new Label ("The Dolphin", 60);
    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        addObject(titleLabel, getWidth()/2, 200);
        prepare();
    }
    
    /**
     * the main world act loop
     */
    
    public void act()
    {
        //start the game when spacebar is pressed by user 
        if (Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
    
    /**
     * prepare the world for the start of the program
     * = create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Dolphin dolphin = new Dolphin();
        addObject(dolphin, 479, 89);
        dolphin.setLocation(482,200);
        Label label = new Label("Use \u2190 and \u2192 to Move", 40);
        addObject(label, 220, 257);
        label.setLocation(297, 243);
        label.setLocation(305, 240);
        Label label2 = new Label("Press <space> to Start", 40);
        addObject(label2, 249, 331);
        label2.setLocation(326, 319);
        label.setLocation(328, 253);
        label2.setLocation(295, 326);
        label.setLocation(278, 261);
    }
}
