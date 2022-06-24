import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShurikenRight here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShurikenRight extends Actor
{
    public void act()
    {
        int y = getY();
        int x = getX();

        int left = x + 5;
        setLocation(left, getY());
      
        if (checkCollision()){
          destroy();
        }else if (getX() >= 1584) {
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
