import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Hero here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hero extends Actor
{
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        Spawnshoot();
        movingHero();
    }
    
    public void movingHero(){
        if(Greenfoot.isKeyDown("up")){
            setLocation(getX(),getY()-2);
        }
        if(Greenfoot.isKeyDown("down")){
            setLocation(getX(),getY()+2);
        }
        if(Greenfoot.isKeyDown("left")&& getX()>=30){
            setLocation(getX()-2,getY());
        }
        if(Greenfoot.isKeyDown("right")){
            setLocation(getX()+2,getY());
        }
    }
    
    int Timer = 0;
    public void Spawnshoot(){
        if(Timer == 20){
            getWorld().addObject(new Shoot(), getX()+64, getY());
            Timer = 0;
        }
        else{
            Timer++;
        }
    }
    
}
