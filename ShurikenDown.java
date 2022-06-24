import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShurikenDown here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShurikenDown extends Actor
{
    public void act()
    {
        int y = getY();
        int x = getX();

        int down = y + 5;
        setLocation(getX(), down);
      
        if (checkCollision()){
          destroy();
        }else if (getY() >= 894) {
          destroy();
        }
    }
    
    private void destroy() {
        getWorld().removeObject(this);
    }
    
    // Collision Detector
    public boolean checkCollision(){
        if(getIntersectingObjects(WallH.class).size() > 0) {
            return true;
        }
        if(getIntersectingObjects(WallV.class).size() > 0) {
            return true;
        }
        return false;
    }
}
