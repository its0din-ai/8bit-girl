import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Option here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Option extends World
{

    public static Counter cek = new Counter("ID: ");
    
    public Option()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1); 
        setBackground(new GreenfootImage("images/bg.png"));
        prepare();
        
        
        
    }
    
    
    public void prepare()
    {
        NextBtn NextBtn = new NextBtn();
        PrevBtn prv = new PrevBtn();
        Gawr gura = new Gawr();
        Back back = new Back();

        addObject(gura, 800, 450);
        addObject(cek, 800, 250);
        addObject(NextBtn, 1300, 450);
        addObject(prv, 300, 450);

        addObject(back, 1450, 100);

    }
    
}