import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fire2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fire2 extends Actor
{
    /**
     * Act - do whatever the fire2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound highscore = new GreenfootSound("score.mp3");
    
    private int firetime;
    private int moveCount;
    
    public void act()
    {
        World2 myW2 = (World2) getWorld();
        Actor collide = getOneIntersectingObject(Water.class);        
        firetime = 0;
        moveCount = moveCount+1;
        this.turnTowards(300, 200);
        this.move(2);
        int Locoy = this.getX();
        int Locox = this.getY();
        if(Greenfoot.mouseClicked(this)){
            myW2.removeObject(this);
            myW2.user.score = myW2.user.score+100;
            highscore.play();
        }else{
            if (Locoy == 300 && Locox == 200){
            myW2.removeObject(this);
            myW2.lives = myW2.lives -1;
        }

        }
    }
}

