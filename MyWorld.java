import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Set;

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public int lives=5;
    public Water user;
    GreenfootSound backgroundMusic = new GreenfootSound("Music.mp3");    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        GreenfootImage sea = new GreenfootImage("camp.png");
        sea.scale(getWidth(), getHeight());
        setBackground(sea);
        backgroundMusic.playLoop();
        user = new Water();
        addObject(user,310,205);
    }
    
    public void act(){
        String displayScore = String.valueOf(user.score);
        
        showText("Score: "+displayScore, 520, 20);
        
        String displaylives = String.valueOf(lives);
        showText("Lives: "+displaylives, 50, 20);
        
        int Fire =  Greenfoot.getRandomNumber(1000);
        if(Fire < 10){
            addObject(new Fire(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(350));
            }
        if(lives < 1){
            Greenfoot.setWorld(new Gameover());
        }
        if(user.score >= 1000){
            Greenfoot.setWorld(new loading());
        }
    }
}
