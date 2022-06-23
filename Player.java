import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Player here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player extends Actor
{
    int levelId;
    int moveSpeed = 2;
    boolean up = true, left = true, right = true, down = true;
    static int xPerson = 0;
    static int yPerson = 0;
    static int coins = 0;
    
    static int ident = 0;
    
    public Player(int lvl){
        levelId = lvl;
    }
    
    
    public void act()
    {
        selector();
        movement();
        shoot();
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
    
    public void moveLeft() {
        setLocation(getX() - moveSpeed, getY()); 
    }
    public void moveRight() {
       setLocation(getX() + moveSpeed, getY());         
    }
    
    public void moveUp() {
        setLocation(getX(), getY() - moveSpeed);
    }
    
    public void moveDown() { 
        setLocation(getX(), getY() + moveSpeed);
    }
    
    public String movement() {
        String result = "";
        if(Greenfoot.isKeyDown("w")) {
          moveUp();  
          result+="w";
        }
        if(Greenfoot.isKeyDown("a")) { 
          moveLeft();
          result+="a";
        }
        if(Greenfoot.isKeyDown("s")) {  
          moveDown();
          result+="s";
        }
        if(Greenfoot.isKeyDown("d")) {
          moveRight();
          result+="d";
        }
        return result;
    }
    
    private int shotTimer = 0;
    public void shoot()
    {
        
        if (shotTimer > 0) {
            shotTimer = shotTimer -1;
        }else if(Greenfoot.isKeyDown("down"))
        {
            getWorld().addObject(new ShurikenDown(), getX(), getY());
            shotTimer = 20;
        }else if(Greenfoot.isKeyDown("right")) { // oder welche Taste auch immer es sein soll
             getWorld().addObject(new ShurikenRight(), getX(), getY());
             shotTimer = 20;
        }else if(Greenfoot.isKeyDown("up")) { // oder welche Taste auch immer es sein soll
             getWorld().addObject(new ShurikenUp(), getX(), getY());
             shotTimer = 20;
        }else if(Greenfoot.isKeyDown("left")){
             getWorld().addObject(new ShurikenLeft(), getX(), getY());
             shotTimer = 20;
            }
    } 
    
}
