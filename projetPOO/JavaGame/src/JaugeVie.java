
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
public class JaugeVie extends Afficheurs {

    public JaugeVie(Game aG, String aNom, double aX, double aY) {
        super(aG, aNom, aX, aY);
    }
    
    public void move(long dt){
        
    }
    

    @Override
    public boolean collision(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void effect(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
