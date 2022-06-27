import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelThree here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelThree extends World
{
    int musuhSpawn =  0;
    static int maxSpawn = 10;
    
    public LevelThree(int xPos, int yPos)
    {    
        super(1600, 900, 1);
        setBackground(new GreenfootImage("images/base-lvl3.png"));
        Player player = new Player(3);

        addObject(player, xPos, yPos);
        // Set Obstacle || Wall down here
        addObject(new WallV(), 24, 150);
        addObject(new WallV(), 24, 750);
        addObject(new WallV(), 1575, 150);
        addObject(new WallV(), 1575, 750);
        
        addObject(new WallH(), 324, 23);
        addObject(new WallH(), 1276, 24);
        addObject(new WallH(), 324, 875);
        addObject(new WallH(), 1276, 875);
        
        // HUD
        addObject(LevelOne.score, 165, 90);
        addObject(LevelOne.hp, 1435, 90);
        prepare();
    }
    
    public void act(){
        randomSpawn();
        if(Enemy.hitungMati == LevelThree.maxSpawn){
            MainMenu.menuBgm.stop();
            LevelOne.winBgm.playLoop();
            win();
        }
        
        endGame();
    }
    
    public void win(){
        addObject(new winGame(), 800, 300);
        addObject(new ExitBtn(), 800, 370);
    }

    public void randomSpawn(){
        int a = Greenfoot.getRandomNumber(600);
        int b = Greenfoot.getRandomNumber(600);
        int c = Greenfoot.getRandomNumber(600);
        int d = Greenfoot.getRandomNumber(600);
        // Enemy Spawner Here
        if (a > 597 && musuhSpawn < maxSpawn){
            addObject(new Enemy2(), 1600,600 - Greenfoot.getRandomNumber(300));
            musuhSpawn++;
        }
        if (b > 597 && musuhSpawn < maxSpawn){
            addObject(new Enemy2(), 0,600 - Greenfoot.getRandomNumber(300));
            musuhSpawn++;
        }
        if (c > 597 && musuhSpawn < maxSpawn){
            addObject(new Enemy2(), 950 - Greenfoot.getRandomNumber(300),900);
            musuhSpawn++;
        } 
        if (d > 597 && musuhSpawn < maxSpawn){
            addObject(new Enemy2(), 950 - Greenfoot.getRandomNumber(300),0);
            musuhSpawn++;
        }
    }
    
    private void prepare()
    {
        Enemy.hitungMati = 0;
        LevelOne.winBgm.stop();
        MainMenu.menuBgm.playLoop();
    }
    
    public void endGame(){
        if(Player.matiPak()){
            addObject(new EndGame(), 800, 300);
            addObject(new Retry(), 800, 370);
            MainMenu.menuBgm.stop();
            LevelOne.winBgm.stop();
            LevelOne.loseBgm.playLoop();
        }
    }
}
