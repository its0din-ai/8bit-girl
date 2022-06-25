import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Clouds1 extends Actor
{
    public void act()
    {
        int x = getX();
        int y = getY();
        int speedAwan = 2;
        setLocation(x + speedAwan, y);
        if(x > 1598){
            setLocation(0, y);
        }
    }
}
