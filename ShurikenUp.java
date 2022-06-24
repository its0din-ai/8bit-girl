import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShurikenUp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShurikenUp extends Actor
{
    public void act()
    {
        int y = getY();
        int x = getX();

        int up = y - 5;
        setLocation(getX(), up);
      
        if (checkCollision()){
          destroy();
        }else if (getY() == 0) {
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
