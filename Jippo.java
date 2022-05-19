import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jippo extends Actor
{
    /**
     * Act - do whatever the jippo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.isKeyDown("a"))
        {
            move(-4);
        }   
        if (Greenfoot.isKeyDown("d"))
        {
            move(4);
        }
        
        if (isTouching(Bread.class))
        {
            removeTouching(Bread.class);
            MyWorld world = (MyWorld) getWorld();
            world.spawnBread();
            world.increaseScore();
        }
    }
}
