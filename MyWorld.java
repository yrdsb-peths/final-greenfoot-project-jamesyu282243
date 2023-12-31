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
    
    private int rocket = 0;

    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        // Create the worm object
        
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        
        addObject(new Rocket(),100,200);
        


    }
    
    public void act()
    {
        if(rocket>0){
            rocket--;
        }
        else
        {
            rocket = 20;
            
        }
        if(rocket==1){
            int py =Greenfoot.getRandomNumber(getHeight());
            addObject (new Elephant(-(2+Greenfoot.getRandomNumber(3))), getWidth() + 200, py);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
}
