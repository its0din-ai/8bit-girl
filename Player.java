import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Object Player
 * Memiliki parameter lvl, untuk mengisi levelId yang akan menunjukkan dilevel mana status si Player
 * variabel moveSpeed untuk kecepatan Player
 * variabel xKoord dan yKoord untuk koordinat player
 * variabel coins, ident, hp, dan score untuk Atribut Player seperti namanya, hp untuk nyawa, dsb.
 * Method selector() untuk memilih identitas Karakter si Player
 * Method matiPak() untuk memeriksa apakah HP nya 0
 * Method endGame() untuk menghentikan permainan
 * Method checkCollision, untuk memeriksa apakah player nabrak tembok
 * Method tabrak(), untuk membuat player tidak dapat melewati Tembok (nabrak)
 * Method move(arah), untuk arah gerakan Player
 * Method movement() untuk mekanik gerakan
 * Variabel shotTimer dan Method shoot(), untuk menembak dengan interval tertentu (agar tidak spam peluru)
 */
public class Player extends Actor
{
    int levelId;
    int moveSpeed = 2;
    //boolean up = true, left = true, right = true, down = true;
    static int xKoord = 0;
    static int yKoord = 0;
    
    static int coins = 0;
    static int ident = 0;
    static int hp = 5;
    static int score = 0;
    
    public Player(int lvl){
        levelId = lvl;
    }
    
    
    public void act()
    {
        xKoord = getX();
        yKoord = getY();
        
        selector();
        shoot();
        
        tabrak();
        if(matiPak()){
            getWorld().removeObject(this);
        }
    }
    
    public void selector(){
        if(ident <= 5){
            if(ident == 0){
                setImage("gura.png");
            }
            else if(ident == 1){
                setImage("amee.png");
            }
            else if(ident == 2){
                setImage("kiara.png");
            }
            else if(ident == 3){
                setImage("mori.png");
            }
            else if(ident == 4){
                setImage("inaa.png");
            }
            else if(ident == 5){
                ident = 0;
            }
        }
    }
    
    public void tabrak(){
        String m = movement();
        if(checkCollision()) {
            // Method indexOf dijava untuk memeriksa suatu string
            if(m.indexOf("d") > -1) {
               move("Left"); 
            }
            if(m.indexOf("a") > -1) {
               move("Right"); 
            }
            if(m.indexOf("s") > -1) {
               move("Up"); 
            }
            if(m.indexOf("w") > -1) {
               move("Down"); 
            }

        }
    }
    
    public static boolean matiPak(){
        if(LevelOne.hp.getValue() <= 0){
            return true;
        }
        return false;
    }
    
    public boolean checkCollision(){
        if(isTouching(WallH.class)) {
            return true;
        }
        if(isTouching(WallV.class)) {
            return true;
        }
        return false;
    }
    
    public void move(String arah) {
        if(arah == "Left"){
            setLocation(getX() - moveSpeed, getY());
        }
        else if(arah == "Right"){
            setLocation(getX() + moveSpeed, getY());
        }
        else if(arah == "Up"){
            setLocation(getX(), getY() - moveSpeed);
        }
        else if(arah == "Down"){
            setLocation(getX(), getY() + moveSpeed);
        }
    }
    
    public String movement() {
        String result = "";
        if(Greenfoot.isKeyDown("w")) {
          move("Up");  
          result+="w";
        }
        if(Greenfoot.isKeyDown("a")) { 
          move("Left");
          result+="a";
        }
        if(Greenfoot.isKeyDown("s")) {  
          move("Down");
          result+="s";
        }
        if(Greenfoot.isKeyDown("d")) {
          move("Right");
          result+="d";
        }
        return result;
    }
    
    private int shotTimer = 0;
    public void shoot()
    {
        
        if (shotTimer > 0){
            shotTimer = shotTimer -1;
        }
        else if(Greenfoot.isKeyDown("down")){
            getWorld().addObject(new ShurikenDown(), getX(), getY());
            shotTimer = 20;
        }
        else if(Greenfoot.isKeyDown("right")){
             getWorld().addObject(new ShurikenRight(), getX(), getY());
             shotTimer = 20;
        }
        else if(Greenfoot.isKeyDown("up")){
             getWorld().addObject(new ShurikenUp(), getX(), getY());
             shotTimer = 20;
        }
        else if(Greenfoot.isKeyDown("left")){
             getWorld().addObject(new ShurikenLeft(), getX(), getY());
             shotTimer = 20;
        }
    } 
    
}
