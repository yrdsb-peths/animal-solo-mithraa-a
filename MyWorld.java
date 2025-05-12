import greenfoot.*;

/**
 * The world our hero lives in.
 * 
 * @author Eswarathasan
 * @version April 2025
 */
public class MyWorld extends World 
{
    public int score = 0;
    Label scoreLabel;
    int level = 1;
    /**
     * Constructor for the objects of the class MyWorld
     */
    
    public MyWorld() 
    {
        super(600, 400, 1);
        
        // Create the dolphin object 
        Dolphin dolphin = new Dolphin();
        addObject(dolphin, 300, 250);
        
        // Create a label 
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 40, 40);
        
        createFish();
    }
    
    /**
     * End the game and draw game over
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, getWidth()/2, 200);
    }
    
    /**
     * Increase score
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
         
        if(score % 5 == 0)
        {
            level += 1;
        }
    }
    
    /** 
     * Create a new fish at a random location at the top of the screen 
     */
    public void createFish()
    {
        Fish fish = new Fish();
        fish.setSpeed(level);
        int x = Greenfoot.getRandomNumber(500);
        int y = 0 ;
        addObject(fish, x, y);
    }
}
