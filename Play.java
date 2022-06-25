import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Play extends Actor
{
    public void act()
    {
        /**
         * Jika Object diklik, maka pindah ke World LevelOne (mulai permainan)
         */
        if(Greenfoot.mouseClicked(this)){
            Greenfoot.setWorld(new LevelOne());
        }
    }
}
