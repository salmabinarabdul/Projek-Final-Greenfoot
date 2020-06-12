import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ikan2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ikan2 extends Actor
{
    /**
     * Act - do whatever the Ikan2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(),getY()+5);
        jatuh();
    }   
    public void jatuh(){
        Actor kenak_Penguin = getOneIntersectingObject(Penguin.class);
        if(kenak_Penguin !=null){
            getWorld().removeObject(this);
            Skor.jumlah_skor+=10;
            
        }else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
