import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocketpic here.
 * 
 * @author (yu) 
 * @version (jan 24)
 */
public class Rocketpic extends Actor
{
    /**
     * Act - do whatever the Rocketpic wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage[] rocketIdle = new GreenfootImage[36];
    
    public void act()
    {
        // Add your action code here.
        
        animateRocket();
    }
    /**
     * Constructor - the code that gets run time when object is created
     */
    public Rocketpic()
    {
        for(int i = 1; i < rocketIdle.length; i++)
        {
            rocketIdle[i] = new GreenfootImage("images/rocket_idle/rocket" + i +".png");
            rocketIdle[i].scale(350, 200);
            
        }   
        setImage(rocketIdle[0]);
    }
    /**
     * Animate the rocket
     */
    int imageIndex = 0;
    public void animateRocket()
    {
        setImage(rocketIdle[imageIndex]);
        imageIndex = (imageIndex + 1) % rocketIdle.length;
    }
}
