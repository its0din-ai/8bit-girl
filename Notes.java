import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Kelas Notes, digunakan untuk menampilkan Pesan dari Developers.
 */

public class Notes extends World
{   
    int countDown = 0;
    public Notes()
    {
        super(1600, 900, 1); 
        setBackground(new GreenfootImage("images/devNotes.png"));
        countDown ++;
        btnSpawn();
    }
    
    public void btnSpawn(){
        addObject(new Done(), 1400,790);
    }
}
