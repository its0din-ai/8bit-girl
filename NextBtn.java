import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class NextBtn extends Actor
{
    public void act()
    {
        /**
         * Jika object diKlik, maka akan menambah Value dari
         * ident milik Player menjadi bertambah 1
         */
        if(Greenfoot.mouseClicked(this)){
            Player.ident += 1;
        }
    }
}
