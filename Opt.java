import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Opt extends Actor
{
    public void act()
    {
        /**
         * Jika Object diklik, maka pindah ke World Option
         */
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Option());
            Greenfoot.playSound("sfx/choose2.wav");
        }
    }
}
