
import iut.Game;
import iut.Objet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author bg893340
 */
public class Missile extends BonusMalus {
    
    private double vitesseX = 0.80;

    public Missile(Game aG, String aNom, int aX, int aY) {
        super(aG, aNom, aX, aY);
    }

    
    public void effect(iut.Objet o){
        if(o.isEnnemy()){
            game().remove(this);
        }
    }
    
    public void move (long dt){
        move(dt*vitesseX,0);
        
        if(this.getRight()>= this.game().getWidth()){
            this.game().remove(this);
        }
        
    }



    @Override
    public boolean isFriend() {
       return true;
    }

    @Override
    public boolean isEnnemy() {
        return false;
    }


    
}
