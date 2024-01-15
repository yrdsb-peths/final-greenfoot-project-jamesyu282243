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
    private boolean toRemove = false;
    GreenfootImage[] idleLeft = new GreenfootImage[8];
    String facing = "left";

    SimpleTimer animationTimer = new SimpleTimer();
    public Elephant()
    {
        String facing = "right";
        SimpleTimer animationTimer = new SimpleTimer();
        
        animationTimer.mark();

        //initial elephant image
        setImage(idleLeft[0]);
    }    

    /**
     * Animate the elephant
     */
    int imageIndex = 0;
    public void animateElephant()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        if(facing.equals("right"))
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;
        }    
        else
        {
            setImage(idleLeft[imageIndex]);
            imageIndex = (imageIndex + 1) % idleLeft.length;

        }
        animateElephant();

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
        if(getX()<-200)
        {
            toRemove = true;
        }
    }

    public void act()
    {
        // Add your action code here.
        move();

        if(!toRemove)
        {
            move();
        }
        else
        {
            getWorld().removeObject(this);
        } 
        MyWorld world = (MyWorld) getWorld();

    }
    public void killElephant()
    {
        if(isTouching(Laser.class))
        
        {
            removeTouching(Laser.class);
            MyWorld world = (MyWorld) getWorld();
        }    
    }
}


