
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
public class Horloge extends iut.Objet{
    
    
    private int cooldown;
    private Niveau Niv;
    private int nbEnnemiPresent;
    private int nbEnnemiMax;
    

    public Horloge(Game aG) {
        super(aG, "horloge", 0, 0);
        cooldown = 0;
        nbEnnemiPresent = 0;
        nbEnnemiMax = 10;
        Niv = new Niveau(1);
    }
    

    
    @Override
    public boolean collision(Objet o){
        return false;
        
    }
    
    @Override
    public void effect(Objet o){
        
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
        
        String s;
        int nb;
        int pos;
        if(nbEnnemiPresent <= nbEnnemiMax){
            if(cooldown == 0){
                cooldown = (10 - Niv.getNbNiveau()) * 10;
                nb = (int) (Math.random() * Niv.getNbNiveau());
                s = Niv.getListeEnnemi().get(nb);
                pos = (int) (Math.random() * game().height() - 50) + 1;
                CreationEnnemi(s,pos);
                nbEnnemiPresent+=1;
            }else{
                cooldown--;
            }
        }
        
    }
    
    public void ChangeNiveau(Niveau n){
        
    }
    
    
    public void CreationEnnemi(String s, int pos){
        if(s== "Eggs1"){
            game().add(new Alien1(game(), "bEgg", game().width() - 100, pos, 1, 1, true));
        }
        
        if(s== "Eggs2"){
            game().add(new Alien2(game(), "rEgg", game().width() - 100, pos, 1.5, 1.5, true));
        }
        
        if(s== "Eggs3"){
            game().add(new Alien3(game(), "gEgg", game().width() - 100, pos, 2, 2, true));
        }
        
        if(s== "Ship"){
            game().add(new BigShip(game(), "enemy", game().width() - 100, pos, 3, 3, true));
        }

    }
    
    
    
}
