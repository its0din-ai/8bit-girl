import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ShurikenDown extends Actor
{
    /**
     * Semua Object shuriken sama, yang membedakan adalah arah Gerakan, seperti keatas
     * kebawah, kekanan, dan kekiri
     * 
     */
    
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
        if(isTouching(WallH.class)) {
            return true;
        }
        if(isTouching(WallV.class)) {
            return true;
        }
        return false;
    }
}
