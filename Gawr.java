import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gawr here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gawr extends Actor
{
    /**
     * Act - do whatever the Gawr wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    static int ident = 0;
    public void act()
    {
        selector();
        
    }
    
    public void selector(){
        if(ident <= 5){
            if(ident == 0){
                setImage("gura.png");
                Option.cek.setValue(0);
            }
            else if(ident == 1){
                setImage("amee.png");
                Option.cek.setValue(1);
            }
            else if(ident == 2){
                setImage("kiara.png");
                Option.cek.setValue(2);
            }
            else if(ident == 3){
                setImage("mori.png");
                Option.cek.setValue(3);
            }
            else if(ident == 4){
                setImage("inaa.png");
                Option.cek.setValue(4);
            }
            else if(ident == 5){
                ident = 0;
            }
        }
    }
    
}
