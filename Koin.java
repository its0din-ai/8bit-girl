import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Koin extends Actor
{
    /**
     *  Object Koin. memiliki parameter lvlid, digunakan untuk membuat 
     *  tambahan koin berbeda - beda tergantung Levelnya
     */
    
    int levelid;
    public Koin(int lvlid){
        levelid = lvlid;
    }
    public void act()
    {
        if(levelid == 1){
            if(checkCollision()){
                LevelOne.score.add(50);
                Greenfoot.playSound("sfx/coinPick.wav");
                destroy();
            }
        }
        else if(levelid == 2){
            if(checkCollision()){
                LevelOne.score.add(70);
                Greenfoot.playSound("sfx/coinPick.wav");
                destroy();
            }
        }
        else if(levelid == 3){
            if(checkCollision()){
                LevelOne.score.add(90);
                Greenfoot.playSound("sfx/coinPick.wav");
                destroy();
            }
        }
    }
    
    private void destroy() {       
        getWorld().removeObject(this);      
    }
    
    public boolean checkCollision(){
        if(isTouching(Player.class)){
            return true;
        }
        return false;
    }
}
