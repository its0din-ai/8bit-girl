import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenu extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    int timer = 100;
    public static Counter cek = new Counter("Clicked? ");
    public MainMenu()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1600, 900, 1); 
        setBackground(new GreenfootImage("images/bg.png"));
        prepare();
    }
    
    void prepare()
    {
        Title judul = new Title();
        Play play = new Play();
        Cloud1 cl1 = new Cloud1();
        Cloud2 cl2 = new Cloud2();
        Cloud3 cl3 = new Cloud3();
        Cloud4 cl4 = new Cloud4();
        Sunnie sun = new Sunnie();
        Clouds1 scl1 = new Clouds1();
        Clouds2 scl2 = new Clouds2();
        Clouds3 scl3 = new Clouds3();

        Player player = new Player(0);
        Opt opsi = new Opt();
        Abt about = new Abt();

        // Layer Order tergantung posisi addObject
        // makin kebawah, makin didepan :v

        addObject(sun, 500, 200);
        addObject(scl1, 948,801);
        addObject(scl2, 400,750);
        addObject(scl3, 1250,647);
        addObject(cl1, 200, 150);
        addObject(cl2, 350, 300);
        addObject(cl3, 500, 250);
        addObject(cl4, 750, 200);

        addObject(player, 400, 580);
        addObject(judul, 800, 200);
        addObject(play, 800, 650);
        addObject(opsi, 400, 700);
        addObject(about, 1200, 700);
    }
}
