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
    Label instructLabel = new Label("Without Bumping into the them!", 30);
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
        addObject(instructLabel, getWidth()/2, getHeight() - 20);
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
        // add rocketgif
        //Rocket rocketPic = new Rocket();
        //addObject(rocketPic, 100, 70);
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        //Rocketpic rocketpic = new Rocketpic();
        //addObject(rocketpic,92,92);
        Rocketpic rocket = new Rocketpic();
        addObject(rocket, getWidth()/2 - 200, getHeight()/2 -100);
        //removeObject(rocketpic);
    }
}
