import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    public static int score = 0;
    public Label scoreLabel = new Label(score, 80);
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false); 
        Jippo swag = new Jippo();
        addObject(swag, getWidth() / 2, 350);
        addObject(scoreLabel, 50, 50);
        spawnBread();
    }

    public void spawnBread()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Bread bread = new Bread();
        addObject(bread, x, y);
    }

    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
    }

    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 200);
        GameOverWorld world = new GameOverWorld();
        Greenfoot.setWorld(world);
    }
}
