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
    public int score = 0;
    
    Label scoreLabel;
    int level = 1;
    Boolean gameIsOver = false;
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1, false);
        // Create the worm object
        
        getBackground().setColor(Color.BLACK);
        getBackground().fill();
        
        // Create the rocket object
        Rocket rocket = new Rocket();
        addObject(new Rocket(),100,200);
        
        // Score throughout game.
        scoreLabel = new Label(0, 80);
        addObject(scoreLabel, 50, 50);       

    }
    
    
    /** 
     * increases score after elephant dies
     */
    public void increaseScore()
    {
        score++;
        scoreLabel.setValue(score);
        
        if(score % 5 == 0)
        {
            level += 1;
        }
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
        if(rocket>=2){
            int py =Greenfoot.getRandomNumber(getHeight());
            addObject (new Elephant(-(2+Greenfoot.getRandomNumber(3))), getWidth() + 200, py);
        }
        
    }
    public boolean isGameOver()
    {
        return gameIsOver;
    }
    
    /**
     * End game and draw 'GaveOver'
     */
    public void gameOver()
    {
        Label gameOverLabel = new Label("Game Over", 100);
        addObject(gameOverLabel, 300, 100);
        
        //Label restartLabel = new Label("press space to restart", 30);
        //addObject(restartLabel, 300, 150);
        gameIsOver = true;
        
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
    }
    
}
