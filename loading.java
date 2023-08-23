import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class loading here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class loading extends World
{

    /**
     * Constructor for objects of class loading.
     * 
     */
    public Water user;
    private int timer = 100;
    public loading()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        showText("LOADING: LEVEL 2", 300, 200);
        
    }
    
    public void act(){
       timer = timer -1;
        if(timer <= 0){
            Greenfoot.setWorld(new World2());
        }
    }
}
