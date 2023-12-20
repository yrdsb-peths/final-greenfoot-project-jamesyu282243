import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Elephant here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Elephant extends Actor
{
    /**
     * Act - do whatever the Elephant wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int vx = 0;
    public Elephant()
    {
        
    }
    public Elephant(int v)
    {
        vx = v;
    }
    public void addedToWorld(World MyWorld)
    {
        setRotation(180);
    }
    public void move()
    {
        setLocation(getX()+ vx, getY());
    }
    
    public void act()
    {
        // Add your action code here.
        move();
        
    }
}
