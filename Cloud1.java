import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Cloud1 extends Actor
{
    /**
     * Object Cloud hampir semuanya mirip, yaitu Object yang awannya bergerak
     * dengan menggunakan method setLocation. dan speedAwan untuk kecepatannya
     */
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
