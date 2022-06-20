import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gawr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gawr extends Actor
{
    /**
     * Act - do whatever the Gawr wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int timing = 0;
    public void act()
    {
        // Add your action code here.
        int x = getX();
        int y = getY();
        
        
        
        setLocation(x, 490);
        timing++;
        
        if(timing >= 30){
            if(y <= 490){
            setLocation(x, 500);
            timing = 0;
            }
        
            if(y >= 500 ){
            setLocation(x, 490);
            timing = 0;
            }
        }
        
    }
    
}
