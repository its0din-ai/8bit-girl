import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

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
        if(isTouching(WallH.class)) {
            return true;
        }
        if(isTouching(WallV.class)) {
            return true;
        }
        return false;
    }
}
