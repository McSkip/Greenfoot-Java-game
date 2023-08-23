import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class leaderboard here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class leaderboard extends World
{

    /**
     * Constructor for objects of class leaderboard.
     * 
     */
    public leaderboard()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        int width = getWidth();
        int height = getHeight();
        showText("Campfire Nights", 300, 40);
        showText("CLICK HERE TO PLAY",300, 260);
        showText("For Infinity Mode, click this button",300, 195);
        showText("Your Goal Is To Stop The Fire From Reaching The CampFire", 300, 150);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        play play = new play();
        addObject(play,290,325);
        infbutton infbutton = new infbutton();
        addObject(infbutton,300,225);
    }
}
