
import iut.Game;
import iut.Objet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author db322793
 */
class BonusMalus extends iut.ObjetTouchable{

    public BonusMalus(Game aG, String aNom, int aX, int aY) {
        super(aG, aNom, aX, aY);
    }

    
    /*public BonusMalus(Joueur j){
        
    }*/
       
    
    public boolean isFriend(){
        return false;
        
    }
    
    public boolean isEnemy(){
        return false;
        
    }


    @Override
    public void effect(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void move(long l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEnnemy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
