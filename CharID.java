import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Kelas CharID (Character ID) digunakan untuk memberikan
 * nama Karakter pada Character Selector di World Option
 * 
 */
public class CharID extends Actor
{
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
