import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Palu here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Palu extends Actor
{
    /**
     * Act - do whatever the Palu wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(),getY()+5);
        jatuh();
    } 
    public void jatuh(){
        Actor kenak_Penguin = getOneIntersectingObject(Penguin.class);
        if(kenak_Penguin !=null){
            getWorld().removeObject(this);
            Skor.skor_berkurang();
        }else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
}
