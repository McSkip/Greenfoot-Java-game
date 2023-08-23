import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class winner here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class winner extends World
{

    /**
     * Constructor for objects of class winner.
     * 
     */
    public winner()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        menu menu = new menu();
        
        showText("CONGRATULATIONS",300, 90);
        showText("YOU WIN",300, 110);
        showText("MADE BY OISIN WOODS",300, 160);
        showText("28/07/23",300, 180);
        addObject(menu,300,320);
    }
}
