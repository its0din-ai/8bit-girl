import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cloud2 extends Actor
{
    public void act()
    {
        int x = getX();
        int y = getY();
        int speedAwan = 2;
        setLocation(x + speedAwan, y);
        if(x > 1595){
            setLocation(0, y);
        }
    }
}
