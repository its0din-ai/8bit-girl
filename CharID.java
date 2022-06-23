import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class CharID here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CharID extends Actor
{
    /**
     * Act - do whatever the CharID wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        selector();
        
    }
    
    public void selector(){
        if(Player.ident <= 5){
            if(Player.ident == 0){
                setImage("guratxt.png");
            }
            else if(Player.ident == 1){
                setImage("ametxt.png");
            }
            else if(Player.ident == 2){
                setImage("kiaratxt.png");
            }
            else if(Player.ident == 3){
                setImage("moritxt.png");
            }
            else if(Player.ident == 4){
                setImage("inatxt.png");
            }
            else if(Player.ident == 5){
                Player.ident = 0;
            }
        }
    }
}
