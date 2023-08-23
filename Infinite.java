import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.Set;

/**
 * Write a description of class Infinite here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Infinite extends World
{

    /**
     * Constructor for objects of class Infinite.
     * 
     */
    public int lives=5;
    public int timer;
    public Water user;
    private int count = 0;
    GreenfootSound backgroundMusic = new GreenfootSound("Music.mp3");    
    public Infinite()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        timer = 0;
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
        
        String displaytimer = String.valueOf(timer);
        showText("timer: "+displaytimer, 310, 20);
        count = count +1;
        if(count > 60){
            timer = timer +1;
            count = 0;
        }
        
        int infire =  Greenfoot.getRandomNumber(1000);
        if(infire < 10){
            addObject(new infire(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(350));
            }
        if(lives < 1){
            Greenfoot.setWorld(new Gameover());
        }
    }
}
