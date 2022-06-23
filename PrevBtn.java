import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PrevBtn here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PrevBtn extends Actor
{
    /**
     * Act - do whatever the PrevBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
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
