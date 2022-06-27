import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Kelas Option digunakan untuk mengubah Karakter, ada 5 Pilihan
 */
public class Option extends World
{
    static GreenfootSound nextPrev = new GreenfootSound("sfx/nextPrev.wav");
    public Option()
    {
        super(1600, 900, 1); 
        setBackground(new GreenfootImage("images/brownbg.png"));
        prepare();
        
    }
    
    
    public void prepare()
    {
        NextBtn NextBtn = new NextBtn();
        PrevBtn prv = new PrevBtn();
        Player player = new Player(0);
        Select pilih = new Select();
        CharID charid = new CharID();

        addObject(new Player(0), 800, 450);
        addObject(charid, 800, 250);
        addObject(NextBtn, 1300, 450);
        addObject(prv, 300, 450);

        addObject(pilih, 800, 700);

    }
    
}
