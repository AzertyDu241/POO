
import iut.Game;
import iut.Objet;
import javax.swing.ImageIcon;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */



/**
 *
 * @author hl444895
 */
public class BigShip extends Vaisseau{
 public BigShip(Game aG, String aNom, int aX, int aY,double vX, double vY ,boolean indestructible ) {
        super(aG, aNom, aX, aY, vX, vY, indestructible);
        
 }
        
public void move (long dt){
     
}         

public void specialMove(long dt){
    
}


public boolean isDestructible(){
    return false;
}



    @Override
    public void effect(Objet objet) {
        
    }

    
}
