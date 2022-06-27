import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Select extends Actor
{
    public void act()
    {
        /**
         * Jika Object diklik, maka kembali ke World MainMenu
         */
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new MainMenu());
            Greenfoot.playSound("sfx/select.wav");
        }
    }
}
