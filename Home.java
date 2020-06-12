import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Home here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Home extends World
{

    /**
     * Constructor for objects of class Home.
     * 
     */
    public Home()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 600, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Start start = new Start();
        addObject(start,127,460);
        aturan aturan = new aturan();
        addObject(aturan,359,462);
        start.setLocation(911,91);
        aturan.setLocation(938,244);
        Exit exit = new Exit();
        addObject(exit,910,506);
        aturan.setLocation(899,245);
        aturan.setLocation(908,340);
        start.setLocation(326,448);
        aturan.setLocation(897,69);
        start.setLocation(252,427);
        exit.setLocation(220,561);
        aturan.setLocation(231,484);
        start.setLocation(249,419);
        start.setLocation(123,428);
        aturan.setLocation(128,490);
        exit.setLocation(133,563);
        start.setLocation(652,567);
        aturan.setLocation(145,489);
        start.setLocation(93,412);
        start.setLocation(234,420);
        aturan.setLocation(236,487);
        exit.setLocation(62,566);
        aturan.setLocation(667,560);
        start.setLocation(238,438);
    }
}
