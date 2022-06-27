import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy2 extends Actor
{
    /**
     * Kelas Enemy1 mirip dengan Enemy, hanya saja Parameternya berbeda,
     * seperti speedMusuh dan Tambahan score jika kena tembakan
     */
    
    int speedMusuh= 3;
    public void act()
    {
        kejar();
        destroy();
        if(!Player.matiPak()){
             if(checkTembak()){
                 Enemy.hitungMati++;
                 LevelOne.score.add(20);
                 Greenfoot.playSound("sfx/enemyDed.wav");
                 coinDrop();
                 hapus();
             }
             else if(cekNabrak()){
                 Enemy.hitungMati++;
                 LevelOne.hp.add(-1);
                 Greenfoot.playSound("sfx/hit.wav");
                 getWorld().removeObject(this);
             }
        }
        
    }
    
    public void started(){
        Enemy.hitungMati = 0;
    }
    
    public void kejar(){
        int x = getX();
        int y = getY();
        if(Greenfoot.getRandomNumber(1600) > Player.xKoord && x > Player.xKoord){
            setImage("images/enemy2L.png");
            move("Left");
        }
        else if(Greenfoot.getRandomNumber(1600) - 20 < Player.xKoord && x < Player.xKoord){
            setImage("images/enemy2R.png");
            move("Right");
        }
        
        if(Greenfoot.getRandomNumber(900) > Player.yKoord && y > Player.yKoord){
            move("Up");
        }
        else if(Greenfoot.getRandomNumber(900) < Player.yKoord && y < Player.yKoord){
            move("Down");
        }
    }
    
    
    public boolean checkTembak(){
        if(isTouching(ShurikenDown.class)) {
            return true;
        }
        if(isTouching(ShurikenUp.class)) {
            return true;
        }
        if(isTouching(ShurikenLeft.class)) {
            return true;
        }
        if(isTouching(ShurikenRight.class)) {
            return true;
        }
        return false;
    }
    
    public void move(String arah) {
        if(arah == "Left"){
            setLocation(getX() - speedMusuh, getY());
        }
        else if(arah == "Right"){
            setLocation(getX() + speedMusuh, getY());
        }
        else if(arah == "Up"){
            setLocation(getX(), getY() - speedMusuh);
        }
        else if(arah == "Down"){
            setLocation(getX(), getY() + speedMusuh);
        }
    }
    
    public boolean cekNabrak(){
        if(isTouching(Player.class)){
            return true;
        }
        return false;
    }
    
    private void hapus() {       
        removeTouching(ShurikenLeft.class);
        removeTouching(ShurikenRight.class);
        removeTouching(ShurikenUp.class);
        removeTouching(ShurikenDown.class);
        getWorld().removeObject(this);      
    }
    
    public void coinDrop(){
        if(Greenfoot.getRandomNumber(100) >= 85){
            getWorld().addObject(new Koin(3), getX(), getY());
        }
    }
    
    public void destroy(){
        if(Player.matiPak()){
            getWorld().removeObject(this);
        }
    }
}
