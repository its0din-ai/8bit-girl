import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelOne here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LevelOne extends World
{
    int current =  0;
    public static Counter score = new Counter("Score: ");
    public static Counter hp = new Counter("HP: ");
    public LevelOne()
    {    
        super(1600, 900, 1);
        setBackground(new GreenfootImage("images/base-lvl1.png"));
        Player player = new Player(1);

        addObject(player, 800, 450);
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
        addObject(score, 165, 90);
        addObject(hp, 1435, 90);
        prepare();
    }

    public void act(){
        randomSpawn();
    }

    public void randomSpawn(){
        int a = Greenfoot.getRandomNumber(600);
        int b = Greenfoot.getRandomNumber(600);
        int c = Greenfoot.getRandomNumber(600);
        int d = Greenfoot.getRandomNumber(600);
        // Enemy Spawner Here, later
    }
    
    private void prepare()
    {

    }
}
