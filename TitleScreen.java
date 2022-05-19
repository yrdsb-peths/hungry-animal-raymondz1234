import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class TitleScreen here.
 * 
 * @raymond (your name) 
 * @may 19 (a version number or a date)
 */
public class TitleScreen extends World
{

    /**
     * Constructor for objects of class TitleScreen.
     * 
     */
    public TitleScreen()
    {
        super(600, 400, 1);
        Label titleLabel = new Label("Hungry Jippo", 80);
        addObject(titleLabel, 300, 200);
        Label instructionLabel = new Label("Press <space> to begin", 70);
        addObject(instructionLabel, 300, 400);
    }
    
    public void act() 
    {
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld world = new MyWorld();
            Greenfoot.setWorld(world);
        }
    }
}
