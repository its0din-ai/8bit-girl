import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class About extends World
{
    public About()
    {
        super(1600, 900, 1); 
        setBackground(new GreenfootImage("images/about-us.png"));
        prepare();
    }
    
    public void prepare(){
        Back back = new Back();
        addObject(back, 1450,790);

    }
}
