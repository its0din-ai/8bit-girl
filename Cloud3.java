import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Cloud3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cloud3 extends Actor
{
    /**
     * Act - do whatever the Cloud3 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x + 3, y);
        if(x > 1595){
            setLocation(0, y);
        }
    }
}
