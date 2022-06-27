import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class ExitBtn extends Actor
{
    public void act()
    {
        /**
         * Jika Object diklik, maka menuju DevNotes
         */
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new Notes());
            Greenfoot.playSound("sfx/choose2.wav");
        }
    }
}
