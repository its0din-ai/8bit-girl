import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class PrevBtn extends Actor
{
    public void act()
    {
        /**
         * Jika object diKlik, maka akan mengurangi Value dari
         * ident milik Player menjadi berkurang 1.
         */
        
        if(Greenfoot.mouseClicked(this)){
            if(Player.ident == 0){
                Player.ident = 4;
            }
            else{
                Player.ident -= 1;
            }
            
        }
    }
}
