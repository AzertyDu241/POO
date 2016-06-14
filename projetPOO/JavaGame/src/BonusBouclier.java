
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
public class BonusBouclier extends iut.ObjetTouchable {

    public BonusBouclier(Game aG, String aNom, int aX, int aY) {
        super(aG, aNom, aX, aY);
    }
    
    public boolean isFriend(){
        return false;
    }
    
    
    
    public void move (long dt){
        
    }
    
    private double getVitesse(){
        return 0;
        
    }

    @Override
    public boolean isEnnemy() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void effect(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
