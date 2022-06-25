import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ShurikenLeft here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ShurikenLeft extends Actor
{
    public void act()
    {
        int y = getY();
        int x = getX();

        int left = x - 5;
        setLocation(left, getY());
      
        if (checkCollision()){
          destroy();
        }else if (getX() == 0) {
          destroy();
        }
    }
    
    private void destroy() {
        getWorld().removeObject(this);
    }
    
    // Collision Detector
    public boolean checkCollision(){
        if(isTouching(WallH.class)) {
            return true;
        }
        if(isTouching(WallV.class)) {
            return true;
        }
        return false;
    }
}
