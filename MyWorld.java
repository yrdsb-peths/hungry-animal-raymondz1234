import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        Jippo swag = new Jippo();
        addObject(swag, getWidth() / 2, 350);
        
        spawnBread();
    }
    
    public void spawnBread()
    {
        int x = Greenfoot.getRandomNumber(600);
        int y = 0;
        Bread bread = new Bread();
        addObject(bread, x, y);
    }
}
