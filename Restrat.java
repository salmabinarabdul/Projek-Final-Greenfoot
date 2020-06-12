import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Restrat here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Restrat extends Actor
{
    /**
     * Act - do whatever the Restrat wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        if(Greenfoot.mouseClicked(this)){
            Skor.jumlah_skor = 0;
            Greenfoot.delay(5);
            Greenfoot.setWorld(new Lv1());
        }
         if(Greenfoot.mousePressed(this)){
            getImage().scale((int)Math.round(getImage().getWidth()*0.9), (int)Math.round(getImage().getHeight()*0.9));
        } 
}
}
