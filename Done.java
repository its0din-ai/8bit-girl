import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Done extends Actor
{
    public void act()
    {
        /**
         * Jika Object diklik, maka Greenfoot berhenti
         */
        if(Greenfoot.mouseClicked(this)){
            LevelOne.winBgm.stop();
            Greenfoot.stop();
        }
    }
}
