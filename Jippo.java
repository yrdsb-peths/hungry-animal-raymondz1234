import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jippo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Jippo extends Actor
{

    GreenfootSound elephantSound = new GreenfootSound("yeayea.mp3");
    GreenfootImage[] idle = new GreenfootImage[17];
    
    public Jippo()
    {
        for(int i= 0; i<17; i++)
        {
            idle[i] = new GreenfootImage("images/peanut_butter_man/tile" + i + ".png");
        }
        setImage(idle[0]);
    }
    
    
    int imageIndex = 0;
    public void animateJippo()
    {
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
    }
    
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
            elephantSound.play();
        }
        
        animateJippo();
    }
}
