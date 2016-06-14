
import iut.Game;
import iut.Objet;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author db322793
 */
public class Jeu extends iut.Game{
    
    private Image img;

    public Jeu(int aLargeur, int aHauteur, String aTitle) throws IOException {
        super(aLargeur, aHauteur, aTitle);
        
        try {
            img = ImageIO.read(new File("sprites/background.png"));
        } catch (IOException ex) {
            System.out.println("File not Found");
        }
    }

    @Override
    protected void drawBackground(Graphics aG) {
        aG.drawImage(img, 1, 1, null);
    }

    @Override
    protected void perdu() {
        JOptionPane.showMessageDialog(this,"Perdu :-(");
    }

    @Override
    protected void createObjects() {
        
         Joueur player1 = new  Joueur(this, "Faucon" , 0, 150);
         this.add(player1);
         this.addMouseInteractiveObject(player1);
         Horloge h = new Horloge(this);
         this.add(h);
         
               

    }

    @Override
    protected void gagne() {
        JOptionPane.showMessageDialog(this,"Gagné !");
    }

    protected boolean aGagne() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    protected boolean aPerdu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}
