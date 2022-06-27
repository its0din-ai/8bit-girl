import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Enemy extends Actor
{
    /**
     * Kelas Enemy, ada variabel static bernama hitungMati berfungsi untuk menghitung musuh yang mati
     * Variabel speedMusuh, untuk kecepatan lari Musuh
     * Method cekTembak, untuk memeriksa apakah Object tabrakan dengan Peluru
     * Method move(String arah) dengan parameter arah. untuk menggerakkan Musuh sesuai argumen Arahnya
     * Method cekNabrak(), untuk memeriksa tabrakan Object Enemy dengan Object Player
     * Method kejar(), digunakan untuk menggerakkan Enemy dengan gerakan seperti mengejar Player
     * Method hapus(), untuk menghapus Object Enemy dan peluru ketika tabrakan terjadi
     * Method coinDrop(), untuk membuat Coin jatuh saat musuh tertembak dengan Acak
     * Method destroy(), untuk menghapus object dari Dunia
     */
    
    static int hitungMati = 0;
    int speedMusuh= 1;
    public void act()
    {
        kejar();
        destroy();
        if(!Player.matiPak()){
             if(checkTembak()){
                 hitungMati++;
                 LevelOne.score.add(15);
                 Greenfoot.playSound("sfx/enemyDed.wav");
                 coinDrop();
                 hapus();
             }
             else if(cekNabrak()){
                 hitungMati++;
                 LevelOne.hp.add(-1);
                 Greenfoot.playSound("sfx/hit.wav");
                 getWorld().removeObject(this);
             }
        }
        
    }
    
    public void started(){
        hitungMati = 0;
    }
    
    public void kejar(){
        int x = getX();
        int y = getY();
        if(Greenfoot.getRandomNumber(1600) > Player.xKoord && x > Player.xKoord){
            setImage("images/enemy0L.png");
            move("Left");
        }
        else if(Greenfoot.getRandomNumber(1600) - 20 < Player.xKoord && x < Player.xKoord){
            setImage("images/enemy0R.png");
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
        if(Greenfoot.getRandomNumber(100) >= 55){
            getWorld().addObject(new Koin(1), getX(), getY());
        }
    }
    
    public void destroy(){
        if(Player.matiPak()){
            getWorld().removeObject(this);
        }
    }
}
