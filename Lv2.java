import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Lv2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Lv2 extends World
{

    /**
     * Constructor for objects of class Lv2.
     * 
     */
     public void act(){
        if(Greenfoot.getRandomNumber(600)<2){
            addObject (new Ikan1(),Greenfoot.getRandomNumber(600),10);
        }
        if(Greenfoot.getRandomNumber(500)<4){
            addObject (new Ikan2(),Greenfoot.getRandomNumber(600),10);
        }
        if(Greenfoot.getRandomNumber(700)<2){
            addObject (new Palu(),Greenfoot.getRandomNumber(600),10);
        }
    }
    public Lv2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(720, 600, 1); 
        prepare();
    }
    
    public void prepare (){
        showText("Level : 2",440,30);

        Penguin penguin = new Penguin();
        addObject(penguin,413,508);
        penguin.setLocation(375,543);
    }
}
