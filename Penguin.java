import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Penguin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Penguin extends Actor
{
    /**
     * Act - do whatever the Penguin wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        getWorld().showText("Score : "+Skor.jumlah_skor,85,30);
        tombol();
        
    }
    
    public void tombol(){
        if(Greenfoot.isKeyDown("left")){
            this.setLocation(this.getX() - 5, this.getY());
        }
        if(Greenfoot.isKeyDown("right")){
            this.setLocation(this.getX() + 5,this.getY());
        } 
}
}

