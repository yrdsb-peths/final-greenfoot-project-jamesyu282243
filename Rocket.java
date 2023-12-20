import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Rocket here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Rocket extends Actor
{
    /**
     * Act - do whatever the Rocket wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int targetx = 0, targety = 0;
    private int rocket=0;
    private boolean toRemove = false;
    public void addedToWorld(World MyWorld)
    {
        targetx = getX();
        targety = getY();
    }    
    
    public void move()
    {
        double rx = targetx-getX();
        double ry = targety-getY();
        double r = Math.sqrt(rx*rx+ry*ry);
        int bts = 10;
        int posx = 0, posy = 0;
        if( r > bts)
        {
            posx = (int) (getX()+ bts * rx / r);
            posy = (int) (getY()+ bts * ry/ r);
        }else{
            posx = targetx;
            posy = targety;
        }
        setLocation(posx,posy);
    }
    
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mouseMoved(null))
        {
            MouseInfo mouse = Greenfoot.getMouseInfo();
            targetx = mouse.getX();
            targety = mouse.getY();

        }
        move();
        if(rocket>0)
        {
            rocket--;
        }
        if(rocket==1)
        {
            getWorld().addObject(new Laser(), getX()+100, getY());
            
        }
        if(rocket==0) 
        {
            rocket = 30;
        }
    }
}
