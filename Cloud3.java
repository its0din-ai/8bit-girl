import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cloud3 extends Actor
{
    public void act()
    {
        int x = getX();
        int y = getY();
        int speedAwan = 3;
        setLocation(x + speedAwan, y);
        if(x > 1595){
            setLocation(0, y);
        }
    }
}
