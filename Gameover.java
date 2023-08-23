import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Gameover here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Gameover extends World
{

    /**
     * Constructor for objects of class Gameover.
     * 
     */
    GreenfootSound highscore = new GreenfootSound("death.mp3");
    public Gameover()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
        highscore.play();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        retry retry = new retry();
        addObject(retry,310,308);
        retry.setLocation(300,300);
        int width = getWidth();
        int height = getHeight();
        showText("GAME OVER", width/2, 100);
        showText("CLICK RETRY TO PLAY AGAIN",300, 20);
        showText("Infinity Mode, click this button",300, 205);
        menu menu = new menu();
        addObject(menu,300,350);
        infbutton infbutton = new infbutton();
        addObject(infbutton,300,242);
        infbutton.setLocation(300,235);
    }
}

