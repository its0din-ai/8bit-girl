import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Clouds2 extends Actor
{
    public void act()
    {
        int x = getX();
        int y = getY();
        int speedAwan = 1;
        setLocation(x + speedAwan, y);
        if(x > 1598){
            setLocation(0, y);
        }
    }
}
