import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Koin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Koin extends Actor
{
    /**
     * Act - do whatever the Koin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
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
