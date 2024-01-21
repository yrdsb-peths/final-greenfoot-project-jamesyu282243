import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Laser here.
 * 
 * @author (yu) 
 * @version (dec 23)
 */
public class Laser extends Actor
{
    /**
     * Act - do whatever the Laser wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private boolean toRemove = false;
    private int vx = 15;
    
    GreenfootSound laserSpound = new GreenfootSound("blaster-2-81267.mp3");
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
        if(!toRemove)
        {
            setLocation(getX() + vx, getY());
            if(getX()>getWorld().getWidth ()+200)
            {
                toRemove = true;
            }
        }
        else
        {
            getWorld().removeObject(this);
        }
        killElephant();
    }

    /**
     * When laser hits elephant, elephant is eliminated.
     */
    
    public void killElephant()
    {
        
        if(isTouching(Elephant.class))
        {
            
            removeTouching(Elephant.class);
            checkCollision();
        }
        
    }  
    
     public void checkCollision()
    {
        // Check for collisions with Elephant
        Elephant elephant = (Elephant) getOneIntersectingObject(Elephant.class);
        

        // Increase the score
        MyWorld world = (MyWorld) getWorld();
        world.removeObject(this);
        world.increaseScore();
        
    }
}

