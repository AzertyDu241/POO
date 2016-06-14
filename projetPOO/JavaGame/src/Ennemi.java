
import iut.Game;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author hl444895
 */
public abstract class Ennemi extends iut.ObjetTouchable{
    private double vitesseX;
    private double vitesseY;

    public Ennemi(Game aG, String aNom, int aX, int aY, double vX, double vY) {
        super(aG, aNom, aX, aY);
        vitesseX = -0.40;
        vitesseY = vY;
    }
    
   
    
    public void effect(Object o){
        
    }
    
    @Override
    public boolean isFriend(){
        return false;
        
    }
    
    @Override
    public boolean isEnnemy(){
        return true;
        
    }
    
    @Override
    public void move(long dt){
        move(dt*vitesseX,0);
        
        if(this.getRight()<= 65){
            this.game().remove(this);
        }
        
    }
    
    protected void specialMove(long dt){
        
    }
    
    
    protected boolean isDestructible(){
        return false;
        
    }
    
    protected void Detruit(){
        
    }
    
    
    
    
    
    
    
    
    
    
    
}
