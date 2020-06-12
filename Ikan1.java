import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Ikan1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Ikan1 extends Actor
{
    /**
     * Act - do whatever the Ikan1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setLocation(getX(), getY()+5);
        jatuh();
        
    }    
    public void jatuh(){
        Actor kenak_Penguin = getOneIntersectingObject(Penguin.class);
        if(kenak_Penguin !=null){
            getWorld().removeObject(this);
            Skor.jumlah_skor+=5;
            if (Skor.jumlah_skor >= 100){
                Greenfoot.setWorld(new Lv2());
               
            }
            if(Skor.jumlah_skor >=200){
                Greenfoot.setWorld(new Win());
            }
        
            
        }else if(isAtEdge()){
            getWorld().removeObject(this);
        }
    }
       
  
}

