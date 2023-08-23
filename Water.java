import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Water here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Water extends Actor
{
    /**
     * Act - do whatever the Water wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    private int timer =0;
    public int count;
    public int score;
    public int highscore = 0;
    public Water (){
        score = 0;
        count = 10;
    }
    
    
    public void act()
    {
        MouseInfo mi = Greenfoot.getMouseInfo();
        timer = timer -1;
        if( mi != null ) {
        setLocation(mi.getX(), mi.getY());
        }
        if(Greenfoot.mouseClicked(this)){
            this.setRotation(45);
            timer = timer +1;
        }
        
        if(timer < -50){
            this.setRotation(0);
            timer = 0;
        }
        
        if(score > highscore){
            highscore = score;
        }
    }
}
