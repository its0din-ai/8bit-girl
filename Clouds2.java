import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Clouds2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Clouds2 extends Actor
{
    /**
     * Act - do whatever the Clouds2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        setLocation(x + 1, y);
        if(x > 1598){
            setLocation(0, y);
        }
    }
}
