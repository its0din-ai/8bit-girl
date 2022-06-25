import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Abt extends Actor
{
    public void act()
    {
        /**
         * Jika Object diklik, maka pindah ke World About
         */
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new About());
        }
    }
}
