import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Set;

/**
 * Write a description of class World2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class World2 extends World
{

    /**
     * Constructor for objects of class World2.
     * 
     */
    public int lives=3;
    public Water user; 
    public World2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        GreenfootImage sea = new GreenfootImage("camp.png");
        sea.scale(getWidth(), getHeight());
        setBackground(sea);
        user = new Water();
        addObject(user,310,205);
    }
    
    public void act(){
        String displayScore = String.valueOf(user.score);
        
        showText("Score: "+displayScore, 520, 20);
        
        String displaylives = String.valueOf(lives);
        showText("Lives: "+displaylives, 50, 20);
        
        int Fire2 =  Greenfoot.getRandomNumber(1000);
        if(Fire2 < 25){
            addObject(new fire2(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(350));
            }
        if(lives < 1){
            Greenfoot.setWorld(new Gameover());
        }
        if(user.score >= 500){
            Greenfoot.setWorld(new winner());
        }
    }
}
