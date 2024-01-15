import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Titlescreen here.
 * 
 * @author (yu) 
 * @version (Jan 24)
 */
public class Titlescreen extends World
{
    Label titleLabel = new Label("Elephant Invasion", 60);
    Label startLabel = new Label("Press 'SPACE' to Start", 30);
    Label instructionLabel = new Label("Objective: Eliminate All Elephants!", 30);

    /**
     * Constructor for objects of class Titlescreen.
     * 
     */
    public Titlescreen()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 

        addObject(titleLabel, getWidth()/2, getHeight()/2);
        addObject(startLabel, getWidth()/2, getHeight()/2 + 120);
        addObject(instructionLabel, getWidth()/2, getHeight() - 50);
        prepare();
    }

    /**
     * The main world act loop
     */
    public void act()
    {
        //Satrt the game if user presses space bar
        if(Greenfoot.isKeyDown("space"))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
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
