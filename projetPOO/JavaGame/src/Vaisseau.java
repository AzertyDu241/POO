
import iut.Game;
import java.awt.event.KeyListener;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author hl444895
 */
public abstract class Vaisseau extends Ennemi{

    private boolean indestructible;
    

    
    public Vaisseau(Game aG, String aNom, int aX, int aY,double vX, double vY ,boolean indestructible) {
        super(aG,aNom,aX,aY,vX,vY);
        this.indestructible = indestructible;
        

        
    }
    
    
    
}