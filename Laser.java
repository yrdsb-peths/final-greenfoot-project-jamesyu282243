import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.awt.Color;
/**
 * Write a description of class Laser here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public void addedToWorld(World MyWorld)
    {
        GreenfootImage image = new GreenfootImage(50, 10);
        image.setColor(Color.YELLOW);
        image.drawLine(0, 5, image.getWidth()-1, 5);
        setImage(image);
    }
    public void act()
    {
        // Add your action code here.
    }
}
