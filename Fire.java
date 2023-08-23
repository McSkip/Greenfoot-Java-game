import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fire here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fire extends Actor
{
    /**
     * Act - do whatever the Fire wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootSound highscore = new GreenfootSound("score.mp3");
    
    private int firetime;
    private int moveCount;
    
    public void act()
    {
        MyWorld myW = (MyWorld) getWorld();
        Actor collide = getOneIntersectingObject(Water.class);        
        firetime = 0;
        moveCount = moveCount+1;
        this.turnTowards(300, 200);
        this.move(2);
        int Locoy = this.getX();
        int Locox = this.getY();
        if(Greenfoot.mouseClicked(this)){
            myW.removeObject(this);
            myW.user.score = myW.user.score+100;
            highscore.play();
        }else{
            if (Locoy == 300 && Locox == 200){
            myW.removeObject(this);
            myW.lives = myW.lives -1;
        }

        }
    }
}

