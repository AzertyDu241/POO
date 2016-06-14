/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import iut.Objet;
import java.util.ArrayList;
import java.util.Vector;
/**
 *
 * @author hl444895
 */
public class Niveau {
    private int numero;
    
    private ArrayList<String> ListeEnnemi;
    private ArrayList<BonusMalus> ListeBonusMalus = new ArrayList<BonusMalus>() ;
    
    public Niveau(int numero){
        this.numero = numero;
        ListeEnnemi = new ArrayList<String>() ;
        RemplissageListeEnnemi();
    }
    
    public Objet NouvelObjet(long time){
        return null;
  
    }
    
    
    public int getNbNiveau(){
        return this.numero;
    }
    
    
    public ArrayList<String> getListeEnnemi(){
        return this.ListeEnnemi;
    }
    
    public void RemplissageListeEnnemi(){
        
        if(this.numero>=1){
            ListeEnnemi.add("Eggs1");
        }
        
        if(this.numero>=2){
            ListeEnnemi.add("Eggs2");
        }
        
        if(this.numero>=3){
            ListeEnnemi.add("Eggs3");
        }
        
        if(this.numero>=4){
            ListeEnnemi.add("Ship");
        }
    }
    
    
    
}
