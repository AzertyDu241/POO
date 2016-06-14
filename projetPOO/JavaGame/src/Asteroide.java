
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
public class Asteroide extends Ennemi {

    public Asteroide(Game aG, String aNom, int aX, int aY, double vX , double vY) {
        super(aG, aNom, aX, aY,vX, vY );
    }



    @Override
    public void effect(Objet objet) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    

    

        
}
