
import iut.Game;
import iut.Objet;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author db322793
 */
public class Joueur extends iut.ObjetTouchable implements MouseListener, MouseMotionListener{
    
    private int vie;
    private double vitesse;
    private String nom;
    private boolean bloque = false;
    private int prevY = 250;

    public Joueur(Game aG, String aNom, int aX, int aY) {
        super(aG, aNom, aX, aY);
    }
    
    public void effect(Object o){
        
    }
    
    @Override
    public boolean isFriend(){
        return true;
    }
    
    @Override
    public boolean isEnnemy(){
        return false;
    }
    
    @Override
    public void move(long dt){
        
    }
    
    public void ajouteBonus(BonusMalus b){
        
    }
    
    public void enleveBonus(BonusMalus b){
        
    }
    
    public void debloque(){
        
    }
    
    public void bloque(){
        
    }

    
    
    public void setString(String s){
        this.nom=s;
    }
    
    public String getString(){
        return this.nom;
    }

    @Override
    public void effect(Objet objet) {
       
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Missile m = new Missile(this.game(), "mariocket", this.getRight(), this.getMiddleY() - 40);
        this.game().add(m);
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        
    }

    @Override
    public void mouseExited(MouseEvent e) {
        
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        if(prevY==-1)
            prevY = e.getY();
        if(e.getY()>=0 && e.getY()<= this.game().getHeight()-20){
            this.moveY(e.getY()-prevY);
            prevY = e.getY();
        }
    }

    
    
}
